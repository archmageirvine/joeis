package gebhardt;

/**
 * Permutation group.
 * @author Volker Gebhardt
 * @author Sean A. Irvine (Java port)
 */
class PermGrp {

  // Original header:

	/*
	 * permgrp.c
	 *
	 * Created on: 23 May 2014
	 * Last modified: 24 Jan 2018
	 * Author: Volker Gebhardt, v.gebhardt@westernsydney.edu.au
	 *
	 *   Copyright (C) 2015-2018 by Volker Gebhardt
	 *
	 *   This program is free software; you can redistribute it and/or modify
	 *   it under the terms of the GNU General Public License as published by
	 *   the Free Software Foundation; either version 3 of the License, or
	 *   (at your option) any later version.
	 *
	 *   This program is distributed in the hope that it will be useful,
	 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
	 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
	 *   GNU General Public License for more details.
	 *
	 *   You should have received a copy of the GNU General Public License
	 *   along with this program; if not, write to the
	 *   Free Software Foundation, Inc.,
	 *   59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
	 */

	byte[][] mPerm = new byte[Utils.MAXN - 2][];           /* permutations for generators; DATA IS NOT CONSECUTIVE DURING CONSTRUCTION */
	byte[][] mInvPerm = new byte[Utils.MAXN - 2][];        /* permutations for inverses of generators */
	int mInvol;                  /* invol & BIT[i] indicates whether generator i is an involution */
	int mBenesValid;             /* which levels of array Benes contain valid pointers */
 	Benes[][] mBenes = new Benes[Utils.MAXN-2][Utils.MAXN-2];  /* *(Benes[i][j]): Beneš network for the action of generator j on level i */
	int mN;                      /* number of points on which the group acts */
	int mNgens;                  /* number of generators */

	static class JVertexT {
		int mNeighbours;    /* indicating which vertices are neighbours */
		int[] mPerm = new int[Utils.MAXN - 2];  /* if i is a neighbour, perm[i] is the index in perm/invperm for the edge to i */
	}

	static class PermGrpC {
		PermGrp mG = new PermGrp();
		JVertexT[] mJerrum = new JVertexT[Utils.MAXN - 2];  /* graph used for Jerrum's filter */
		int mFreePerm;        /* indicating unused indices in perm/inverm */
    {
      for (int k = 0; k < mJerrum.length; ++k) {
        mJerrum[k] = new JVertexT();
      }
    }

    /*
     * Insert the generator p, where i is the smallest point in the support of p and j=p[i].
     */
    private void jerrumInsertGenerator(final byte[] p, final int i, final int j) {
      final int g = mFreePerm == 0 ? 0 : Integer.numberOfTrailingZeros(mFreePerm);
      mFreePerm ^= Utils.BIT(g);
      mG.mPerm[g] = Permutation.create();
      mG.mInvPerm[g] = Permutation.create();
      Permutation.copy(mG.mN, p, mG.mPerm[g]);
      Permutation.inverse(mG.mN, p, mG.mInvPerm[g]);
      mJerrum[i].mNeighbours |= Utils.BIT(j);
      mJerrum[i].mPerm[j] = g;
      mJerrum[j].mNeighbours |= Utils.BIT(i);
      mJerrum[j].mPerm[i] = g;
    }

    /*
     * Remove the generator associated to the edge from i to j.
     */
    private void jerrumRemoveGenerator(final int i, final int j) {
      final int g = mJerrum[i].mPerm[j];
      mFreePerm |= Utils.BIT(g);
      mJerrum[i].mNeighbours ^= Utils.BIT(j);  /* bit j is set, so this clears it */
      mJerrum[j].mNeighbours ^= Utils.BIT(i);  /* bit i is set, so this clears it */
    }

    /*
     * Return whether adding an edge i--j, for the permutation p, creates a cycle in the Jerrum graph.
     * If so, the product of the generators along the cycle is returned in k, and (*m)--(*nm) is the
     * first edge of the cycle.
     */
    private boolean jerrumCreatesCycle(final int i, final int j, final byte[] p, final byte[] h, final int[] m, final int[] nm) {
      final int[] anc = new int[Utils.MAXN - 2];
      final int[] todo = new int[Utils.MAXN - 2];
      final int[] v = new int[1];

      todo[0] = i;
      int ntodo = 1;
      int unseen = (int)~Utils.BIT(i);
      for (int pos = 0; pos < ntodo; pos++) {
        int u = todo[pos];
        final int nu = mJerrum[u].mNeighbours;
        while (Utils.getLSB32(nu & unseen, v)){
          anc[v[0]] = u;
          if (v[0] == j) {
            int min;
            for (min = i, u = j; u != i; u = anc[u]) {
              min = Math.min(u, min);
            }
            m[0] = min;
            nm[0] = anc[min];
            if (min == i) {
              Permutation.copy(mG.mN, p, h);
              for (u = j; u != i; u = v[0]) {
                v[0] = anc[u];
                Permutation.multiply(mG.mN, h, (u < v[0] ? mG.mPerm : mG.mInvPerm)[mJerrum[u].mPerm[v[0]]], h);
              }
            } else {
              Permutation.copy(mG.mN, mG.mPerm[mJerrum[min].mPerm[anc[min]]], h);
              for (u = anc[min]; u != i; u = v[0]) {
                v[0] = anc[u];
                Permutation.multiply(mG.mN, h, (u < v[0] ? mG.mPerm : mG.mInvPerm)[mJerrum[u].mPerm[v[0]]], h);
              }
              Permutation.multiply(mG.mN, h, p, h);
              for (u = j; u != min; u = v[0]) {
                v[0] = anc[u];
                Permutation.multiply(mG.mN, h, (u < v[0] ? mG.mPerm : mG.mInvPerm)[mJerrum[u].mPerm[v[0]]], h);
              }
            }
            return true;
          }
          todo[ntodo++] = v[0];
          unseen ^= Utils.BIT(v[0]);  /* bit v is set, so this clears it */
        }
      }
      return false;
    }

    /*
     * Add the permutation p as a generator of g.  The permutation p *must* be nontrivial!
     */
    void addGenerator(final byte[] p) {
      int i = Permutation.minSupport(mG.mN, p);
      int j = p[i];
      if ((mJerrum[i].mNeighbours & Utils.BIT(j)) != 0) {
        int k;
        byte[] h = Permutation.create();
        /* j is already a neighbour of i; unless we have a duplicate generator... */
        if (Permutation.compare(mG.mN, p, mG.mPerm[k = mJerrum[i].mPerm[j]]) != 0
          && Permutation.compare(mG.mN, p, mG.mInvPerm[k]) != 0) {
          /* ...there is a generator k so that h=g*k^-1 fixes i; add h instead of g */
          Permutation.multiply(mG.mN, p, mG.mInvPerm[k], h);
          addGenerator(h);
        }
      } else {
        byte[] h = Permutation.create();
        int[] m = new int[1], nm = new int[1];
        if (jerrumCreatesCycle(i, j, p, h, m, nm)){
          if (m[0] != i) {
            jerrumRemoveGenerator(m[0], nm[0]);
            jerrumInsertGenerator(p, i, j);
          }
          if (!Permutation.isIdentity(mG.mN, h)) {
            addGenerator(h);
          }
        } else{
          jerrumInsertGenerator(p, i, j);
        }
      }
    }
	}

	/*
	 * Allocate space for a permutation group (permgrp); the group is NOT initialised.
	 */
	static PermGrp permgrp_alloc() {
		final PermGrp G = new PermGrp();
		G.mBenesValid = 0;
		return G;
	}

	/*
	 * Allocate space for a permutation group (permgrpc); the group is NOT initialised.
	 */
	static PermGrpC permgrpc_alloc() {
		PermGrpC G = new PermGrpC();
		G.mG = permgrp_alloc();
		return G;
	}

  /*
	 * Delete all Beneš networks stored in G.
	 */
	static void clearBenes(final PermGrp G) {
		final int[] i = new int[1];

		final int[] ugly = new int[] {G.mBenesValid};  // todo avoid this
		while (Utils.extractLSB32(ugly,i)){
//			for (int j = 0; j < G.ngens; j++) {
//				Benes.delete(G.benes[i[0]][j]);
//			}
		}
		G.mBenesValid = ugly[0];
	}


	/*
	 * Set G to the trivial permutation group on n points.
	 */
	static void init(PermGrp G, int n) {
		clearBenes(G);
		G.mN = n;
		G.mNgens = 0;
	}

	/*
	 * Set G to the trivial permutation group on n points.
	 */
	static void permgrpc_init(PermGrpC G, int n) {
		init(G.mG, n);
		G.mFreePerm = Utils.allBits32(Utils.MAXN - 2);
		for (int i = 0; i < n; i++) {
      G.mJerrum[i].mNeighbours = 0;
    }
	}


	/*
	 * Copy G to H.
	 */
	static void permgrp_cpy(PermGrp G, PermGrp H) {
		clearBenes(H);
		final int n = H.mN = G.mN;
		H.mNgens = G.mNgens;
		for (int i = 0; i < n; i++) { /* We need G.n instead of G.ngens for permgrpc_cpy to work in the general case! */
			Permutation.copy(n, G.mPerm[i], H.mPerm[i]);
			Permutation.copy(n, G.mInvPerm[i], H.mInvPerm[i]);
		}
		H.mInvol = G.mInvol;
	}


//	/*
//	 * Copy G to H.
//	 */
//	static void permgrpc_cpy(permgrpc G, permgrpc H) {
//		permgrp_cpy(G.G, H.G);
//		H.freeperm = G.freeperm;
//		memcpy(H.Jerrum, G.Jerrum, G.G.n * sizeof(JVertexT));
//	}
//
//
//	/*
//	 * Return the underlying permgrp of *G WITHOUT REFERENCE COUNT.
//	 */
//	static permgrp permgrpc_get_permgrp(permgrpc G) {
//		return G.G;
//	}
//
//


//	/*
//	 * TEST FUNCTION:  Print current generators (in array notation).  NOTE:  The function only works if the
//	 * generators are stored consecutively, i.e., after permgrpc_compactGenerators has been called.
//	 */
//	static void permgrpc_printGenerators(permgrpc g, int offset) {
//		permgrp_printGenerators(g.g, offset);
//	}
//
//



	/*
	 * TEST FUNCTION:  Print current generators (in array notation).
	 */
	static void permgrp_printGenerators(PermGrp G, int offset) {
		for (int i = 0; i < G.mNgens; i++) {
      Permutation.print(G.mN, G.mPerm[i], offset);
    }
	}
}
