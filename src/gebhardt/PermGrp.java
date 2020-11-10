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
  }

	byte[][] mPerm = new byte[Utils.MAXN - 2][];           /* permutations for generators; DATA IS NOT CONSECUTIVE DURING CONSTRUCTION */
	byte[][] mInvPerm = new byte[Utils.MAXN - 2][];        /* permutations for inverses of generators */
	int mInvol;                  /* invol & BIT[i] indicates whether generator i is an involution */
	int mBenesValid = 0;             /* which levels of array Benes contain valid pointers */
 	Benes[][] mBenes = new Benes[Utils.MAXN-2][Utils.MAXN-2];  /* *(Benes[i][j]): Beneš network for the action of generator j on level i */
	int mN;                      /* number of points on which the group acts */
	int mNgens;                  /* number of generators */

  /*
	 * Delete all Beneš networks stored in g.
	 */
	static void clearBenes(final PermGrp g) {
		final int[] i = new int[1];

		final int[] ugly = new int[] {g.mBenesValid};  // todo avoid this
		while (Utils.extractLSB32(ugly,i)){
//			for (int j = 0; j < g.ngens; j++) {
//				Benes.delete(g.benes[i[0]][j]);
//			}
		}
		g.mBenesValid = ugly[0];
	}


	/*
	 * Set g to the trivial permutation group on n points.
	 */
	static void init(final PermGrp g, final int n) {
		clearBenes(g);
		g.mN = n;
		g.mNgens = 0;
	}

	/*
	 * Set g to the trivial permutation group on n points.
	 */
	static void init(final PermGrpC g, final int n) {
		init(g.mG, n);
		g.mFreePerm = Utils.allBits32(Utils.MAXN - 2);
		for (int i = 0; i < n; i++) {
      g.mJerrum[i].mNeighbours = 0;
    }
	}

	/*
	 * Copy g to h.
	 */
	static void copy(final PermGrp g, final PermGrp h) {
		clearBenes(h);
		final int n = h.mN = g.mN;
		h.mNgens = g.mNgens;
		for (int i = 0; i < n; ++i) { /* We need g.n instead of g.ngens for permgrpc_cpy to work in the general case! */
			Permutation.copy(n, g.mPerm[i], h.mPerm[i]);
			Permutation.copy(n, g.mInvPerm[i], h.mInvPerm[i]);
		}
		h.mInvol = g.mInvol;
	}


//	/*
//	 * Copy g to H.
//	 */
//	static void permgrpc_cpy(permgrpc g, permgrpc H) {
//		permgrp_cpy(g.g, H.g);
//		H.freeperm = g.freeperm;
//		memcpy(H.Jerrum, g.Jerrum, g.g.n * sizeof(JVertexT));
//	}
//
//
//	/*
//	 * Return the underlying permgrp of *g WITHOUT REFERENCE COUNT.
//	 */
//	static permgrp permgrpc_get_permgrp(permgrpc g) {
//		return g.g;
//	}
//
//

	/*
	 * Return whether adding an edge i--j, for the permutation p, creates a cycle in the Jerrum graph.
	 * If so, the product of the generators along the cycle is returned in k, and (*m)--(*nm) is the
	 * first edge of the cycle.
	 */
	static boolean jerrumCreatesCycle(final PermGrpC g, final int i, final int j, final byte[] p, final byte[] h, final int[] m, final int[] nm) {
		int[] anc = new int[ Utils.MAXN - 2];
		int[] todo = new int[ Utils.MAXN - 2];
		int ntodo, pos, min, u;
		int unseen;
		final int[] v = new int[1];

		todo[0] = i;
		ntodo = 1;
    unseen = (int)~Utils.BIT(i);
		for (pos = 0; pos < ntodo; pos++) {
			int nu;
			u = todo[pos];
			nu = g.mJerrum[u].mNeighbours;
			while (Utils.getLSB32(nu & unseen, v)){
				anc[v[0]] = u;
				if (v[0] == j) {
					for (min = i, u = j; u != i; u = anc[u]) {
            min = Math.min(u, min);
          }
					m[0] = min;
					nm[0] = anc[min];
					if (min == i) {
						Permutation.copy(g.mG.mN, p, h);
						for (u = j; u != i; u = v[0]) {
							v[0] = anc[u];
							Permutation.multiply(g.mG.mN, h, (u < v[0] ? g.mG.mPerm : g.mG.mInvPerm)[g.mJerrum[u].mPerm[v[0]]], h);
						}
					} else {
						Permutation.copy(g.mG.mN, g.mG.mPerm[g.mJerrum[min].mPerm[anc[min]]], h);
						for (u = anc[min]; u != i; u = v[0]) {
							v[0] = anc[u];
							Permutation.multiply(g.mG.mN, h, (u < v[0] ? g.mG.mPerm : g.mG.mInvPerm)[g.mJerrum[u].mPerm[v[0]]], h);
						}
						Permutation.multiply(g.mG.mN, h, p, h);
						for (u = j; u != min; u = v[0]) {
							v[0] = anc[u];
							Permutation.multiply(g.mG.mN, h, (u < v[0] ? g.mG.mPerm : g.mG.mInvPerm)[g.mJerrum[u].mPerm[v[0]]], h);
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
	 * Insert the generator p, where i is the smallest point in the support of p and j=p[i].
	 */
	static void JerrumInsertGenerator(PermGrpC G, byte[] p, int i, int j) {
		int[] g = new int[1];

		final int[] ugly = {G.mFreePerm}; // todo
		Utils.extractLSB32(ugly, g);  /* sorry GCC: there must be a free slot, so g *is* initialised here */
		G.mFreePerm = ugly[0];
    G.mG.mPerm[g[0]] = Permutation.create();
    G.mG.mInvPerm[g[0]] = Permutation.create();
		Permutation.copy(G.mG.mN, p, G.mG.mPerm[g[0]]);
		Permutation.inverse(G.mG.mN, p, G.mG.mInvPerm[g[0]]);
    G.mJerrum[i].mNeighbours |= Utils.BIT(j);
		G.mJerrum[i].mPerm[j] = g[0];
    G.mJerrum[j].mNeighbours |= Utils.BIT(i);
		G.mJerrum[j].mPerm[i] = g[0];
	}

	/*
	 * Remove the generator associated to the edge from i to j.
	 */
	static void JerrumRemoveGenerator(PermGrpC G, int i, int j) {
		int g;

		g = G.mJerrum[i].mPerm[j];
    G.mFreePerm |= Utils.BIT(g);
    G.mJerrum[i].mNeighbours ^= Utils.BIT(j);  /* bit j is set, so this clears it */
    G.mJerrum[j].mNeighbours ^= Utils.BIT(i);  /* bit i is set, so this clears it */
	}

	/*
	 * Add the permutation p as a generator of G.  The permutation p *must* be nontrivial!
	 */
	static void permgrpc_addGenerator(PermGrpC G, byte[] p) {
		int i, j;

		i = Permutation.minSupport(G.mG.mN, p);
		j = p[i];
    if ((G.mJerrum[i].mNeighbours & Utils.BIT(j)) != 0) {
			int k;
			byte[] h = Permutation.create();
			/* j is already a neighbour of i; unless we have a duplicate generator... */
			if (Permutation.compare(G.mG.mN, p, G.mG.mPerm[k = G.mJerrum[i].mPerm[j]]) != 0
				&& Permutation.compare(G.mG.mN, p, G.mG.mInvPerm[k]) != 0) {
				/* ...there is a generator k so that h=g*k^-1 fixes i; add h instead of g */
				Permutation.multiply(G.mG.mN, p, G.mG.mInvPerm[k], h);
				permgrpc_addGenerator(G, h);
			}
		} else {
			byte[] h = Permutation.create();
			int[] m = new int[1], nm = new int[1];
			if (jerrumCreatesCycle(G, i, j, p, h, m, nm)){
				if (m[0] != i) {
					JerrumRemoveGenerator(G, m[0], nm[0]);
					JerrumInsertGenerator(G, p, i, j);
				}
				if (!Permutation.isIdentity(G.mG.mN, h)) {
          permgrpc_addGenerator(G, h);
        }
			} else{
				JerrumInsertGenerator(G, p, i, j);
			}
		}

	}


	/*
	 * TEST FUNCTION:  Print current generators (in array notation).
	 */
	static void permgrp_printGenerators(PermGrp G, int offset) {
		for (int i = 0; i < G.mNgens; i++) {
      Permutation.print(G.mN, G.mPerm[i], offset);
    }
	}
}
