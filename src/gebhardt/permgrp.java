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


	long refcount;               /* reference count */
	int[][] perm = new int[Constants.MAXN - 2][];           /* permutations for generators; DATA IS NOT CONSECUTIVE DURING CONSTRUCTION */
	int[][] invperm = new int[Constants.MAXN - 2][];        /* permutations for inverses of generators */
	int invol;                  /* invol & BIT[i] indicates whether generator i is an involution */
	int BenesValid;             /* which levels of array Benes contain valid pointers */
	// #ifndef FILTER_GRADED
// 	benes*         Benes[MAXN-2][MAXN-2];  /* *(Benes[i][j]): Beneš network for the action of generator j on level i */
// #else
	Benes[][] benes = new Benes[1][Constants.MAXN - 2];
	//#endif
	int n;                      /* number of points on which the group acts */
	int ngens;                  /* number of generators */

	static class JVertexT {
		int neighbours;    /* indicating which vertices are neighbours */
		int[] perm = new int[Constants.MAXN - 2];  /* if i is a neighbour, perm[i] is the index in perm/invperm for the edge to i */
	}

	static class permgrpc {
		permgrp G;
		JVertexT[] Jerrum = new JVertexT[Constants.MAXN - 2];  /* graph used for Jerrum's filter */
		int freeperm;        /* indicating unused indices in perm/inverm */
	}

	/*
	 * Allocate space for a permutation group (permgrp); the group is NOT initialised.
	 */
	static permgrp permgrp_alloc() {
		permgrp G;

		G = new permgrp();
		G.refcount = 1;
		G.BenesValid = 0;
		return G;
	}

	/*
	 * Allocate space for a permutation group (permgrpc); the group is NOT initialised.
	 */
	static permgrpc permgrpc_alloc() {
		permgrpc G;

		G = new permgrpc();
		G.G = permgrp_alloc();
		return G;
	}


	/*
	 * Delete all Beneš networks stored in G.
	 */
	static void permgrp_clearBenes(final permgrp G) {
		final int[] i = new int[1];

		final int[] ugly = new int[] {G.BenesValid};  // todo avoid this
		while (Constants.extract_LSB32(ugly,i)){
			for (int j = 0; j < G.ngens; j++) {
				Benes.benes_delete(G.benes[i[0]][j]);
			}
		}
		G.BenesValid = ugly[0];
	}


	/*
	 * Set G to the trivial permutation group on n points.
	 */
	static void permgrp_init(permgrp G, int n) {
		permgrp_clearBenes(G);
		G.n = n;
		G.ngens = 0;
	}


//	/*
//	 * Set G to the trivial permutation group on n points.
//	 */
//	static void permgrpc_init(permgrpc G, int n) {
//		int i;
//
//		permgrp_init(G.G, n);
//		G.freeperm = allBits32(MAXN - 2);
//		for (i = 0; i < n; i++)
//			G.Jerrum[i].neighbours = 0;
//	}
//
//
	/*
	 * Increment the reference count for *G and return *G.
	 */
	static permgrp permgrp_incref(permgrp G) {
		G.refcount++;
		return G;
	}


	/*
	 * Copy G to H.
	 */
	static void permgrp_cpy(permgrp G, permgrp H) {
		int i, n;

		permgrp_clearBenes(H);
		H.refcount = 1;
		n = H.n = G.n;
		H.ngens = G.ngens;
		for (i = 0; i < n; i++) { /* We need G.n instead of G.ngens for permgrpc_cpy to work in the general case! */
			permutation.perm_cpy(n, G.perm[i], H.perm[i]);
			permutation.perm_cpy(n, G.invperm[i], H.invperm[i]);
		}
		H.invol = G.invol;
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
		if ((--(G.refcount)) == 0) {
			permgrp_clearBenes(G);
			//free(G);
		}
	}


//	/*
//	 * Delete the group *G.
//	 */
//	static void permgrpc_delete(permgrpc G) {
//		permgrp_delete(G.G);
//		free(G);
//	}
//
//
//	/*
//	 * TEST FUNCTION:  Print current generators (in array notation).  NOTE:  The function only works if the
//	 * generators are stored consecutively, i.e., after permgrpc_compactGenerators has been called.
//	 */
//	static void permgrpc_printGenerators(permgrpc G, int offset) {
//		permgrp_printGenerators(G.G, offset);
//	}
//
//
//	/*
//	 * Return whether adding an edge i--j, for the permutation p, creates a cycle in the Jerrum graph.
//	 * If so, the product of the generators along the cycle is returned in k, and (*m)--(*nm) is the
//	 * first edge of the cycle.
//	 */
//	static bool JerrumCreatesCycle(permgrpc G, int i, int j, int[] p, int[] h, int[] m, int[] nm) {
//		int anc[ MAXN - 2];
//		int todo[ MAXN - 2];
//		int ntodo, pos, min, u, v;
//		int unseen;
//
//		todo[0] = i;
//		ntodo = 1;
//		unseen = NBIT(i);
//		for (pos = 0; pos < ntodo; pos++) {
//			int nu;
//			u = todo[pos];
//			nu = G.Jerrum[u].neighbours;
//			while (get_LSB32(nu & unseen, & v)){
//				anc[v] = u;
//				if (v == j)
//				goto cycle_found;
//				todo[ntodo++] = v;
//				unseen ^= BIT(v);  /* bit v is set, so this clears it */
//			}
//		}
//		return FALSE;
//		cycle_found:
//		for (min = i, u = j; u != i; u = anc[u])
//			min = u < min ? u : min;
//	*m = min;
//	*nm = anc[min];
//		if (min == i) {
//			perm_cpy(G.G.n, p, h);
//			for (u = j; u != i; u = v) {
//				v = anc[u];
//				perm_mult(G.G.n, h, (u < v ? G.G.perm : G.G.invperm)[G.Jerrum[u].perm[v]], h);
//			}
//		} else {
//			perm_cpy(G.G.n, G.G.perm[G.Jerrum[min].perm[anc[min]]], h);
//			for (u = anc[min]; u != i; u = v) {
//				v = anc[u];
//				perm_mult(G.G.n, h, (u < v ? G.G.perm : G.G.invperm)[G.Jerrum[u].perm[v]], h);
//			}
//			perm_mult(G.G.n, h, p, h);
//			for (u = j; u != min; u = v) {
//				v = anc[u];
//				perm_mult(G.G.n, h, (u < v ? G.G.perm : G.G.invperm)[G.Jerrum[u].perm[v]], h);
//			}
//		}
//		return TRUE;
//	}
//
//
//	/*
//	 * Insert the generator p, where i is the smallest point in the support of p and j=p[i].
//	 */
//	static void JerrumInsertGenerator(permgrpc G, int[] p, int i, int j) {
//		int g;
//
//		extract_LSB32( & (G.freeperm), &g);  /* sorry GCC: there must be a free slot, so g *is* initialised here */
//		perm_cpy(G.G.n, p, G.G.perm[g]);
//		perm_inv(G.G.n, p, G.G.invperm[g]);
//		G.Jerrum[i].neighbours |= BIT(j);
//		G.Jerrum[i].perm[j] = g;
//		G.Jerrum[j].neighbours |= BIT(i);
//		G.Jerrum[j].perm[i] = g;
//	}
//
//
//	/*
//	 * Remove the generator associated to the edge from i to j.
//	 */
//	static void JerrumRemoveGenerator(permgrpc G, int i, int j) {
//		int g;
//
//		g = G.Jerrum[i].perm[j];
//		G.freeperm |= BIT(g);
//		G.Jerrum[i].neighbours ^= BIT(j);  /* bit j is set, so this clears it */
//		G.Jerrum[j].neighbours ^= BIT(i);  /* bit i is set, so this clears it */
//	}
//
//
//	/*
//	 * Add the permutation p as a generator of G.  The permutation p *must* be nontrivial!
//	 */
//	void permgrpc_addGenerator(permgrpc G, int[] p) {
//		int i, j;
//
//		i = perm_minSupport(G.G.n, p);
//		j = p[i];
//		if (G.Jerrum[i].neighbours & BIT(j)) {
//			int k;
//			int[] h;
//			/* j is already a neighbour of i; unless we have a duplicate generator... */
//			if (perm_cmp(G.G.n, p, G.G.perm[k = G.Jerrum[i].perm[j]])
//				&& perm_cmp(G.G.n, p, G.G.invperm[k])) {
//				/* ...there is a generator k so that h=g*k^-1 fixes i; add h instead of g */
//				perm_mult(G.G.n, p, G.G.invperm[k], h);
//				permgrpc_addGenerator(G, h);
//			}
//		} else {
//			int[] h;
//			int m, nm;
//			if (JerrumCreatesCycle(G, i, j, p, h, & m, &nm)){
//				if (m != i) {
//					JerrumRemoveGenerator(G, m, nm);
//					JerrumInsertGenerator(G, p, i, j);
//				}
//				if (!perm_isId(G.G.n, h))
//					permgrpc_addGenerator(G, h);
//			} else{
//				JerrumInsertGenerator(G, p, i, j);
//			}
//		}
//
//	}
//
//
//	/*
//	 * TEST FUNCTION:  Print current generators (in array notation).
//	 */
//	void permgrp_printGenerators(permgrp G, int offset) {
//		int i;
//
//		for (i = 0; i < G.ngens; i++)
//			perm_print(G.n, G.perm[i], offset);
//	}
}
