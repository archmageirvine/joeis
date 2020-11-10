package gebhardt;

/**
 * Permutation group.
 * @author Volker Gebhardt
 * @author Sean A. Irvine (Java port)
 */
class permgrp {

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


	long mRefCount;               /* reference count */
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

	static class permgrpc {
		permgrp mG = new permgrp();
		JVertexT[] mJerrum = new JVertexT[Utils.MAXN - 2];  /* graph used for Jerrum's filter */
		int mFreePerm;        /* indicating unused indices in perm/inverm */
    {
      for (int k = 0; k < mJerrum.length; ++k) {
        mJerrum[k] = new JVertexT();
      }
    }
	}

	/*
	 * Allocate space for a permutation group (permgrp); the group is NOT initialised.
	 */
	static permgrp permgrp_alloc() {
		final permgrp G = new permgrp();
		G.mRefCount = 1;
		G.mBenesValid = 0;
		return G;
	}

	/*
	 * Allocate space for a permutation group (permgrpc); the group is NOT initialised.
	 */
	static permgrpc permgrpc_alloc() {
		permgrpc G = new permgrpc();
		G.mG = permgrp_alloc();
		return G;
	}

	private static long BIT(final long i) {
    return Utils.BIT(i); // todo inline
  }

	/*
	 * Delete all Beneš networks stored in G.
	 */
	static void permgrp_clearBenes(final permgrp G) {
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
	static void init(permgrp G, int n) {
		permgrp_clearBenes(G);
		G.mN = n;
		G.mNgens = 0;
	}

	/*
	 * Set G to the trivial permutation group on n points.
	 */
	static void permgrpc_init(permgrpc G, int n) {
		init(G.mG, n);
		G.mFreePerm = Utils.allBits32(Utils.MAXN - 2);
		for (int i = 0; i < n; i++) {
      G.mJerrum[i].mNeighbours = 0;
    }
	}


	/*
	 * Increment the reference count for *G and return *G.
	 */
	static permgrp permgrp_incref(permgrp G) {
		G.mRefCount++;
		return G;
	}


	/*
	 * Copy G to H.
	 */
	static void permgrp_cpy(permgrp G, permgrp H) {
		permgrp_clearBenes(H);
		H.mRefCount = 1;
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
	/*
	 * Decrement the reference count for *G, and free the allocated memory if the reference count reaches 0.
	 */
	static void permgrp_delete(permgrp G) {
		if ((--(G.mRefCount)) == 0) {
			permgrp_clearBenes(G);
			//free(G);
		}
	}


	/*
	 * Delete the group *G.
	 */
	static void permgrpc_delete(permgrpc G) {
		permgrp_delete(G.mG);
		//free(G);
	}


//	/*
//	 * TEST FUNCTION:  Print current generators (in array notation).  NOTE:  The function only works if the
//	 * generators are stored consecutively, i.e., after permgrpc_compactGenerators has been called.
//	 */
//	static void permgrpc_printGenerators(permgrpc G, int offset) {
//		permgrp_printGenerators(G.G, offset);
//	}
//
//
	/*
	 * Return whether adding an edge i--j, for the permutation p, creates a cycle in the Jerrum graph.
	 * If so, the product of the generators along the cycle is returned in k, and (*m)--(*nm) is the
	 * first edge of the cycle.
	 */
	static boolean jerrumCreatesCycle(permgrpc G, int i, int j, byte[] p, byte[] h, int[] m, int[] nm) {
		int[] anc = new int[ Utils.MAXN - 2];
		int[] todo = new int[ Utils.MAXN - 2];
		int ntodo, pos, min, u;
		int unseen;
		final int[] v = new int[1];

		todo[0] = i;
		ntodo = 1;
		unseen = (int)~BIT(i);
		for (pos = 0; pos < ntodo; pos++) {
			int nu;
			u = todo[pos];
			nu = G.mJerrum[u].mNeighbours;
			while (Utils.getLSB32(nu & unseen, v)){
				anc[v[0]] = u;
				if (v[0] == j) {
					for (min = i, u = j; u != i; u = anc[u]) {
            min = Math.min(u, min);
          }
					m[0] = min;
					nm[0] = anc[min];
					if (min == i) {
						Permutation.copy(G.mG.mN, p, h);
						for (u = j; u != i; u = v[0]) {
							v[0] = anc[u];
							Permutation.multiply(G.mG.mN, h, (u < v[0] ? G.mG.mPerm : G.mG.mInvPerm)[G.mJerrum[u].mPerm[v[0]]], h);
						}
					} else {
						Permutation.copy(G.mG.mN, G.mG.mPerm[G.mJerrum[min].mPerm[anc[min]]], h);
						for (u = anc[min]; u != i; u = v[0]) {
							v[0] = anc[u];
							Permutation.multiply(G.mG.mN, h, (u < v[0] ? G.mG.mPerm : G.mG.mInvPerm)[G.mJerrum[u].mPerm[v[0]]], h);
						}
						Permutation.multiply(G.mG.mN, h, p, h);
						for (u = j; u != min; u = v[0]) {
							v[0] = anc[u];
							Permutation.multiply(G.mG.mN, h, (u < v[0] ? G.mG.mPerm : G.mG.mInvPerm)[G.mJerrum[u].mPerm[v[0]]], h);
						}
					}
					return true;
				}
				todo[ntodo++] = v[0];
				unseen ^= BIT(v[0]);  /* bit v is set, so this clears it */
			}
		}
		return false;
	}


	/*
	 * Insert the generator p, where i is the smallest point in the support of p and j=p[i].
	 */
	static void JerrumInsertGenerator(permgrpc G, byte[] p, int i, int j) {
		int[] g = new int[1];

		final int[] ugly = {G.mFreePerm}; // todo
		Utils.extractLSB32(ugly, g);  /* sorry GCC: there must be a free slot, so g *is* initialised here */
		G.mFreePerm = ugly[0];
    G.mG.mPerm[g[0]] = Permutation.create();
    G.mG.mInvPerm[g[0]] = Permutation.create();
		Permutation.copy(G.mG.mN, p, G.mG.mPerm[g[0]]);
		Permutation.inverse(G.mG.mN, p, G.mG.mInvPerm[g[0]]);
		G.mJerrum[i].mNeighbours |= BIT(j);
		G.mJerrum[i].mPerm[j] = g[0];
		G.mJerrum[j].mNeighbours |= BIT(i);
		G.mJerrum[j].mPerm[i] = g[0];
	}

	/*
	 * Remove the generator associated to the edge from i to j.
	 */
	static void JerrumRemoveGenerator(permgrpc G, int i, int j) {
		int g;

		g = G.mJerrum[i].mPerm[j];
		G.mFreePerm |= BIT(g);
		G.mJerrum[i].mNeighbours ^= BIT(j);  /* bit j is set, so this clears it */
		G.mJerrum[j].mNeighbours ^= BIT(i);  /* bit i is set, so this clears it */
	}

	/*
	 * Add the permutation p as a generator of G.  The permutation p *must* be nontrivial!
	 */
	static void permgrpc_addGenerator(permgrpc G, byte[] p) {
		int i, j;

		i = Permutation.minSupport(G.mG.mN, p);
		j = p[i];
		if ((G.mJerrum[i].mNeighbours & BIT(j)) != 0) {
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
	static void permgrp_printGenerators(permgrp G, int offset) {
		for (int i = 0; i < G.mNgens; i++) {
      Permutation.print(G.mN, G.mPerm[i], offset);
    }
	}
}
