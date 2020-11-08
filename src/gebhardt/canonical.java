package gebhardt;

import gebhardt.antichain.antichaindata;
import gebhardt.permgrp.permgrpc;
import gebhardt.Globals.SIdata;

class canonical {
	/*
	 * canonical.c
	 *
	 * Created on: 1 Jun 2014
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

	private static final boolean VERBOSE = "true".equals(System.getProperty("oeis.verbose"));

// #if 0
// #define PRINTLARGEORBITS
// #define LARGEORBITTHRESHOLD 128

//	static int AD.cl = antichain.AD.cl;

	// #endif
	static long BIT(final long i) {
		return Constants.BIT(i); // todo inline
	}

	/*
	 * Whether the antichain data given by AD may yield a canonical antichain list.  Wrapper which dispatches
	 * the work to antichaindata_isCanonical_p1 or antichaindata_isCanonical_p2.
	 *
	 * An antichain list is canonical if and only if, as a multiset, it is minimal in its orbit under the
	 * stabiliser of the (full) old lattice.  As this stabiliser acts on each level, a violation of minimality
	 * on any level precludes any completion of the antichain data on higher levels being canonical.
	 *
	 * The function checks whether the multiset of sets chosen on the current level (AD.O[...] & AD.cmc) is
	 * minimal under the action of the current stabiliser (AD.ST[AD.cl+1]).  If yes, and if the antichain
	 * data is not complete (that is, AD.cl > 0]), then the new stabiliser is stored in AD.ST[AD.cl].  If
	 * the antichain data is complete and canonical, AD.ST[0] will instead be set to the stabiliser of the
	 * new lattice obtained from the antichain data.  (The points on the lowest (new) level of the new lattice
	 * correspond to the antichains in that sequence; if a permutation fixes the multiset but permutes its
	 * elements, the points of the lowest level of the new lattice need to be permuted accordingly to obtain
	 * an element of the stabiliser of the new lattice.  Additional generators of the stabiliser of the new
	 * lattice are given by all possible permutations of identical antichains, i.e., all possible permutations
	 * of points of the lowest level of the new lattice that have identical covering sets.)
	 */
	static boolean antichaindata_isCanonical(antichaindata AD) {
		int bits;

		bits = AD.L.lev[AD.cl + 1] - AD.L.lev[AD.cl];
		if (AD.k * bits <= Long.SIZE) {
			return antichaindata_isCanonical_p1(AD, bits);
		} else {
			throw new UnsupportedOperationException();
			//return antichaindata_isCanonical_p2(AD, bits);
		}
	}


///*
// * Return the hash value of A.
// */
//static long hash_1(long A)
//{
//	int hash;
//
//	hash = 0;
//	while (A != 0) {
//		hash ^= A & ((1L<<ORBITS_HASHTABLE_LD_SIZE)-1);
//		A >>= ORBITS_HASHTABLE_LD_SIZE;
//	}
//	return hash;
//}
//
//
///*
// * Return the hash value of A:B.
// */
//static long hash_2(long A[2])
//{
//	return hash_1(A[0]^A[1]);
//}
//#define HASH_1(A) hash_1(A)
//#define HASH_2(A) hash_2(A)


	/*
	 * Compare the weight of the antichains A and B.
	 *
	 * Return value: <0 if wt(A) < wt(B)
	 *               0  if A = B
	 *               >0 if wt(A) > wt(B)
	 */
	static int long_cmp(long A, long B) {
		return Long.compare(A, B);
//	if (A < B)
//		return -1;
//	else if (A > B)
//		return 1;
//	else
//		return 0;
	}


	/*
	 * Compare in lexicographical order the packed antichain lists A and B.
	 *
	 * Note that the function knows nothing about the levellised ordering!  The idea is to use this
	 * function on a list of antichains that only live on one level, and/or iteratively, starting at
	 * the maximal level, with appropriate masking.
	 *
	 * Return value: <0 if A < B
	 *               0  if A = B
	 *               >0 if A > B
	 */
	static int antichainList_cmp_p1(long A, long B) {
		return Long.compare(A, B);
//	if (A < B)
//		return -1;
//	else if (A > B)
//		return 1;
//	else
//		return 0;
	}


	/*
	 * Compare in lexicographical order the packed antichain lists A and B.
	 *
	 * Note that the function knows nothing about the levellised ordering!  The idea is to use this
	 * function on a list of antichains that only live on one level, and/or iteratively, starting at
	 * the maximal level, with appropriate masking.
	 *
	 * Return value: <0 if A < B
	 *               0  if A = B
	 *               >0 if A > B
	 */
	static int antichainList_cmp_p2(long[] A, long[] B) {
		if (A[0] < B[0]) {
			return -1;
		} else if (A[0] > B[0]) {
			return 1;
		} else if (A[1] < B[1]) {
			return -1;
		} else if (A[1] > B[1]) {
			return 1;
		} else {
			return 0;
		}
	}


// #ifdef DOTEST
// static void antichain_apply_perm(int lo, int hi, permutation p, long A, long[] R)
// /*
//  * TEST FUNCTION: Store the result of applying the permutation p to the antichain A, containing the elements
//  * lo..(hi-1) only, in *R.
//  */
// {
// 	int  i;

// 	for (*R=0UL, i=lo; i<hi; i++)
// 		if (A & BIT(i))
// 			*R |= BIT(p[i]);
// }


// static void antichainList_apply_perm_p1(int n, int lo, int hi, permutation p, int k,	long L, long[] R)
// /*
//  * TEST FUNCTION: Store the result of applying the permutation p to the packed antichain list L containing
//  * k antichains, involving only the elements lo..(hi-1), in the packed antichain list *R.  The action on
//  * points points 0..n-1 corresponds to a permutation of the elements of the antichains; the action on points
//  * n..n+k-1 corresponds to a permutation of the antichains.
//  */
// {
// 	int  i, j, bits;

// 	bits = hi-lo;
// 	*R = 0UL;
// 	for (i=0; i<k; i++)
// 		for (j=0; j<bits; j++)
// 			if (L & (BIT(j) << (bits*(k-1-i))))
// 				*R |= BIT(p[lo+j]-lo) << (bits*(k-1-(p[n+i]-n)));
// }


// static void antichainList_apply_perm_p2(int n, int lo, int hi, permutation p, int k,	long L[2], long R[2])
// /*
//  * TEST FUNCTION: Store the result of applying the permutation p to the packed antichain list L containing
//  * k antichains, involving only the elements lo..(hi-1), in the packed antichain list *R.  The action on
//  * points points 0..n-1 corresponds to a permutation of the elements of the antichains; the action on points
//  * n..n+k-1 corresponds to a permutation of the antichains.
//  */
// {
// 	int  i, j, bits, apf, fi, oi, fpi, opi;

// 	bits = hi-lo;
// 	apf = BITSPERLONG/bits;
// 	R[0] = R[1] = 0UL;
// 	for (i=0; i<k; i++) {
// 		fi = 1 - (k-1-i)/apf;
// 		oi = (k-1-i) % apf;
// 		fpi = 1 - (k-1-(p[n+i]-n))/apf;
// 		opi = (k-1-(p[n+i]-n)) % apf;
// 		for (j=0; j<bits; j++)
// 			if (L[fi] & (BIT(j) << (bits*oi)))
// 				R[fpi] |= BIT(p[lo+j]-lo) << (bits*opi);
// 	}
// }
// #endif


	/*
	 * Sort the packed antichain list *L containing k antichains of size m in ascending order, subject to the
	 * permitted swaps of adjacent antichains indicated by bl.  The permutation sorting L is also applied to
	 * p[offset]..p[offset+k-1].  The array mask should contain ((1<<m)-1)<<((k-1)*m),..,((1<<m)-1).
	 */
	static void antichainList_sort_p1(int k, int m, long mask[], int bl, long[] L, byte[] p, int offset) {
		long t1, t2;
		//int[]     pp;
		byte tp;
		int newn, n, i, lo;

		if (bl == 0) {
			return;
		}
		lo = Integer.numberOfTrailingZeros(bl); //__builtin_ctz(bl);
		n = 32 - Integer.numberOfLeadingZeros(bl); //__builtin_clz(bl);
		//pp = p+offset;
		do {
			newn = 0;
			for (i = lo; i < n; i++) {
				if ((bl & BIT(i)) != 0 && (t1 = ((L[0] & mask[i - 1]) >> m)) > (t2 = (L[0] & mask[i]))) {
					t1 ^= t2;
					L[0] ^= ((t1 << m) | t1);
					tp = p[offset + i - 1];
					p[offset + i - 1] = p[offset + i];
					p[offset + i] = tp;
					newn = i;
				}
			}
			n = newn;
		} while (n != 0);
	}


	/*
	 * Sort the packed antichain list L containing k antichains of size m in ascending order, with L[0] containing
	 * k0 antichains and L[1] containing k-k0 antichains, subject to the permitted swaps of adjacent antichains
	 * indicated by bl.  The permutation sorting L is also applied to p[offset]..p[offset+k-1].  The arrays M0 and M1
	 * should contain ((1<<m)-1)<<((k0-1)*m),..,((1<<m)-1) and ((1<<m)-1)<<((k-k0-1)*m),..,((1<<m)-1) respectively.
	 */
	static void antichainList_sort_p2(int k, int m, int k0, long[] M0, long[] M1, int bl, long[] L, byte[] p, int offset) {
		long t1, t2;
		//int[]     pp;
		byte tp;
		int newn, n, n0, i, lo;

		if (bl == 0) {
			return;
		}
		lo = Integer.numberOfTrailingZeros(bl); //__builtin_ctz(bl);
		n = 32 - Integer.numberOfLeadingZeros(bl); //__builtin_clz(bl);
		//pp = p+offset;
		do {
			newn = 0;
			if (lo < k0) {
				n0 = k0 < n ? k0 : n;
				for (i = lo; i < n0; i++) {
					if ((bl & BIT(i)) != 0 && (t1 = ((L[0] & M0[i - 1]) >> m)) > (t2 = (L[0] & M0[i]))) {
						t1 ^= t2;
						L[0] ^= ((t1 << m) | t1);
						tp = p[offset + i - 1];
						p[offset + i - 1] = p[offset + i];
						p[offset + i] = tp;
						newn = i;
					}
				}
			}
			if (lo <= k0 && k0 < n) {
				int shift;
				shift = (k - k0 - 1) * m;
				if ((bl & BIT(k0)) != 0 && (t1 = ((L[0] & M0[k0 - 1]) << shift)) > (t2 = (L[1] & M1[0]))) {
					t1 ^= t2;
					L[0] ^= t1 >> shift;
					L[1] ^= t1;
					tp = p[offset + k0 - 1];
					p[offset + k0 - 1] = p[offset + k0];
					p[offset + k0] = tp;
					newn = k0;
				}
			}
			if (k0 + 1 < n) {
				for (i = lo > k0 ? lo : k0 + 1; i < n; i++) {
					if ((bl & BIT(i)) != 0 && (t1 = ((L[1] & M1[i - k0 - 1]) >> m)) > (t2 = (L[1] & M1[i - k0]))) {
						t1 ^= t2;
						L[1] ^= ((t1 << m) | t1);
						tp = p[offset + i - 1];
						p[offset + i - 1] = p[offset + i];
						p[offset + i] = tp;
						newn = i;
					}
				}
			}
			n = newn;
		} while (n != 0);
	}


	/*
	 * Minimise the packed antichain list L containing one antichain on the elements a0..(a0+m-1) under the
	 * action of the implicit automorphisms given by SI.  The inverse of the permutation minimising L is
	 * left-multiplied to p, the rationale being to keep track of the permutation mapping L to some original
	 * element.  If SI_ != 0, the implicit stabiliser of the minimised antichain L is returned in SI_.
	 */
	static void antichainList_applySI_1(int a0, int m, long[] L, int SI, int[] SI_, byte[] p) {
		long mask, A_;
//	int      t, hi, lo;
//	int[]     pp;

		final int[] hi = new int[1];
		final int[] lo = new int[1];

		mask = BIT(m) - 1;
//	pp = p+a0;
		if (SI_ != null) {
			SI_[0] = (int) (SI & ~(mask << a0));
		}
		SI = (int) ((SI >> a0) & mask);
		final int[] B = new int[] {SI ^ (SI >> 1)};
		A_ = L[0] & ~(SI | B[0]);  /* the elements in blocks of size 1 */
		while (Constants.extract_MSB32(B, hi)) {
			Constants.extract_MSB32(B, lo);
			final int pmask = (int) (BIT(hi[0] + 1) - BIT(lo[0]));
			int SB = (int) (L[0] & pmask);
			int UB = (int) (~L[0] & pmask);
			while (Constants.get_MSB32(SB, hi) && Constants.get_LSB32(UB, lo) && hi[0] > lo[0]) {
				SB ^= BIT(hi[0]) | BIT(lo[0]);
				UB ^= BIT(hi[0]) | BIT(lo[0]);
				final byte t = p[a0 + hi[0]];  /* left-multiplication of p by the transposition (lo hi) */
				p[a0 + hi[0]] = p[a0 + lo[0]];
				p[a0 + lo[0]] = t;
			}
			A_ |= SB;
			if (SB != 0 && UB != 0) {
				SI ^= BIT(lo[0]);
			}
		}
		L[0] = A_;
		if (SI_ != null) {
			SI_[0] |= SI << a0;
		}
	}


	/*
	 * Minimise the packed antichain list *L containing k antichains on the elements a0..(a0+m-1) under the
	 * action of the implicit automorphisms given by SI.  The inverse of the permutation minimising L is
	 * left-multiplied to p, the rationale being to keep track of the permutation mapping L to some original
	 * element.
	 */
	static void antichainList_applySI_p1(int n, int k, int a0, int m, int bl, Globals GD, long[] L, int SI, long M, byte[] p) {
		SIdata[] SIt;
		int SI0size, SI1size, i;
		int r, dr, j, dj, t;
		long T;
		int A, A_, A_min, S, mask;
		boolean next;
// #ifdef DOTEST
// 	permutation    argpi, pt;
// 	int            nLev;
// 	int            lev[MAXN];
// 	long        MM[MAXN-2];
// 	long        tmask;
// 	perm_inv(n+k, p, argpi);
// #endif

		mask = (int) (BIT(m) - 1);
		assert GD.SI0 != null;
		assert GD.SI0[0] != null;
		assert L != null;
		GD.SI0[0].rep[0] = L[0];
		GD.SI0[0].S = (SI >> a0) & mask;
		GD.SI0[0].p = permutation.create();
		permutation.perm_cpy(n + k, p, GD.SI0[0].p);
		SI0size = 1;
		for (r = k - 1; r >= 0; r -= dr) { /* r: position to be filled */
			SI1size = 0;
			A_min = mask;
			dr = 1;
			for (i = 0; i < SI0size; i++) { /* loop over candidates */
				next = false;
				for (j = r; !next; j -= dj) { /* j: position of the antichain under consideration */
					int[] hi = new int[1];
					int[] lo = new int[1];
					long P;
					byte[] q = permutation.create();
					//int[]         pq = q+a0;
					if (SI1size == GD.SIspace) {
						Globals.globals_enlargen_SIspace(GD);
					}
					permutation.perm_cpy(n + k, GD.SI0[i].p, q);
					S = GD.SI0[i].S;
					P = GD.SI0[i].rep[0];
					A = (int) ((P >> j * m) & mask);  /* j: antichain under consideration */
					final int[] B = new int[] {(S >> 1) ^ S};
					A_ = A & ~(S | B[0]);  /* the elements in blocks of size 1 */
					while (A != A_ && Constants.extract_MSB32(B, hi)) {  /* get an orbit lo..hi ... */
						int pmask, SB, UB;
						Constants.extract_MSB32(B, lo);
						pmask = (int) (BIT(hi[0] + 1) - BIT(lo[0]));
						SB = A & pmask;
						UB = ~A & pmask;
						while (Constants.get_MSB32(SB, hi) && Constants.get_LSB32(UB, lo) && hi[0] > lo[0]) { /* ... if highest set > lowest unset: swap them */
							SB ^= BIT(hi[0]) | BIT(lo[0]);
							UB ^= BIT(hi[0]) | BIT(lo[0]);
							T = ((P >> hi[0]) ^ (P >> lo[0])) & M;
							P ^= (T << hi[0]) | (T << lo[0]);
							t = q[a0 + hi[0]];  /* left-multiplication by (lo hi) */
							q[a0 + hi[0]] = q[a0 + lo[0]];
							q[a0 + lo[0]] = (byte)t;
						}
						A_ |= SB;
						if (SB != 0 && UB != 0) {
							S ^= BIT(lo[0]);
						}
						if (A_ > A_min) {
							break;
						}
					}
					dj = 0;
					do {
						if (dj >= j || (bl & BIT(k - j + dj)) == 0) {
							next = true;
						}
						dj++;
					} while (!next && ((P >> (j - dj) * m) & mask) == A_);
					if (A_ > A_min || (A_ == A_min && dj < dr)) {
						continue;  /* not minimal */
					}
					if (A_ < A_min || (A_ == A_min && dj > dr)) {  /* new minimum! */
						A_min = A_;
						dr = dj;
						SI1size = 0;
					}
					GD.SI1[SI1size].p = permutation.create();
					permutation.perm_cpy(n + k, q, GD.SI1[SI1size].p);
					if (j < r) {  /* insert antichains (j-dr+1)..j at positions (r-dr+1)..r */
						long mask1, mask2;
						byte[] pqq;
						mask1 = (BIT((r - j) * m) - 1) << ((j + 1) * m);
						mask2 = (BIT(dr * m) - 1) << ((j - dr + 1) * m);
						P = (P & ~(mask1 | mask2)) | ((P & mask1) >> (dr * m)) | ((P & mask2) << ((r - j) * m));
						/* left-multiply q=GD.SI1[SI1size].p by the inverse of the applied permutation */
						int offset = n + k - 1 - j;
						//pq = q + n+k-1-j;
						pqq = GD.SI1[SI1size].p;
						int opqq = n + k - 1 - r;
						for (t = dr; t-- != 0; ) {
							pqq[opqq + t] = q[offset + t];
						}
						offset -= (r - j);  /* pq = q + n+k-1-r; */
						opqq += dr;   /* pqq = GD.SI1[SI1size].p + n+k-1-r+dr; */
						for (t = r - j; t-- != 0; ) {
							pqq[opqq + t] = q[offset + t];
						}
					}
					GD.SI1[SI1size].S = S;
					GD.SI1[SI1size].rep[0] = P;
// #ifdef DOTEST
// 				if (((P >> r*m) & mask) != A_min) {
// 					printf("BAD MINIMISATION [antichainList_applySI_p1]: minimising %lx\n", (long)(*L));
// 					printf("   have %lx\n", (long)P);
// 					printf("   expected %x (m=%d, r=%d, j=%d, S=%x)\n", A_min, m, r, j, S);
// 					erri(-4);
// 				}
// 				perm_mult(n+k, GD.SI1[SI1size].p, argpi, pt);
// 				antichainList_apply_perm_p1(n, a0, a0+m, pt, k, GD.SI1[SI1size].rep[0], &T);
// 				if (antichainList_cmp_p1(T, *L)) {
// 					printf("BAD ACTION [antichainList_applySI_p1]: "); perm_print(n+k, pt, 0);
// 					printf("   on %lx\n", (long)GD.SI1[SI1size].rep[0]);
// 					printf("   have %lx\n", (long)T);
// 					printf("   expected %lx\n", (long)(*L));
// 					erri(-4);
// 				}
// #endif
					SI1size++;
				}
			}
			SI0size = SI1size;
			SIt = GD.SI0;
			GD.SI0 = GD.SI1;
			GD.SI1 = SIt;
		}
// #ifdef DOTEST
// 	nLev = 0;
// 	for (tmask=BIT(m)-1,j=k; j--; tmask<<=m)
// 		MM[j] = tmask;
// 	for (j=1; j<=n; j++)
// 		if (!(SI & BIT(j)))
// 			lev[nLev++] = j;
// 	perm_init(n+k, pt);
// 	while (perm_next(nLev, lev, pt)) {
// 		antichainList_apply_perm_p1(n, a0, a0+m, pt, k, GD.SI0[0].rep[0], &T);
// 		antichainList_sort_p1(k, m, MM, bl, &T, p, a0);
// 		if (antichainList_cmp_p1(T, GD.SI0[0].rep[0]) < 0) {
// 			printf("BAD MINIMUM [antichainList_applySI_p1]: minimising %lx\n", (long)(*L));
// 			printf("   have %lx\n", (long)GD.SI1[0].rep[0]);
// 			printf("   but %lx is smaller (a0=%d, m=%d, k=%d, SI=%x, bl=%x)\n", (long)T, a0, m, k, SI, bl);
// 			erri(-4);
// 		}
// 	}
// #endif
		L[0] = GD.SI0[0].rep[0];
		permutation.perm_cpy(n + k, GD.SI0[0].p, p);
		GD.SI0size = SI0size;
	}


// #ifdef TARGET_UTEST_SI
// void antichainList_applySI_p1_f(int n, int k, int a0, int m, int bl, Globals GD, long[] L, int SI,
// 		long M, permutation p)
// /*
//  * Non-static wrapper for antichainList_applySI_p1.
//  */
// {
// 	antichainList_applySI_p1(n, k, a0, m, bl, GD, L, SI, M, p);
// }
// #endif


	static int ANTICHAIN(long[] L, int i, int m, int k1, int mask) {/* access macro for the antichain in *position* i */
		return (int) ((((i) >= (k1)) ? ((L)[0] >> (((i) - (k1)) * (m))) : ((L)[1] >> ((i) * (m)))) & mask);
	}

	/*
	 * Minimise the packed antichain list L containing k antichains on the elements a0..(a0+m-1), with L[0]
	 * containing k-k1 antichains and L[1] containing k1 antichains,  under the action of the implicit
	 * automorphisms given by SI.  The inverse of the permutation minimising L is left-multiplied to p, the
	 * rationale being to keep track of the permutation mapping L to some original element.
	 */
	static void antichainList_applySI_p2(int n, int k, int k1, int a0, int m, int bl, Globals GD, long[] L, int SI, long M, byte[] p) {
		SIdata[] SIt;
		int SI0size, SI1size;
		int i;
		int r, dr, j, dj, t;
		long T;
		int A, A_, A_min, S, mask;
		boolean next;
// #ifdef DOTEST
// 	permutation    argpi, pt;
// 	int            nLev, apf;
// 	int            lev[MAXN];
// 	long[]       M0;
// 	long        M1[MAXN-2];
// 	long        TT[2];
// 	perm_inv(n+k, p, argpi);
// #endif

//#define MIN(a,b)  ((a)<(b) ? (a) : (b))
//#define MAX(a,b)  ((a)>(b) ? (a) : (b))

		mask = (int) (BIT(m) - 1);
		GD.SI0[0].rep[0] = L[0];
		GD.SI0[0].rep[1] = L[1];
		GD.SI0[0].S = (SI >> a0) & mask;
		permutation.perm_cpy(n + k, p, GD.SI0[0].p);
		SI0size = 1;
		for (r = k - 1; r >= 0; r -= dr) { /* r: position to be filled */
			SI1size = 0;
			A_min = mask;
			dr = 1;
			for (i = 0; i < SI0size; i++) { /* loop over candidates */
				next = false;
				for (j = r; !next; j -= dj) { /* j: position of the antichain under consideration */
					int[] hi = new int[1];
					int[] lo = new int[1];
					long[] P = new long[2];
					byte[] q = permutation.create();
					//int[]         pq = q+a0;
					if (SI1size == GD.SIspace) {
						Globals.globals_enlargen_SIspace(GD);
					}
					permutation.perm_cpy(n + k, GD.SI0[i].p, q);
					S = GD.SI0[i].S;
					P[0] = GD.SI0[i].rep[0];
					P[1] = GD.SI0[i].rep[1];
					A = ANTICHAIN(P, j, m, k1, mask);   /* j: antichain under consideration */
					final int[] B = new int[] {(S >> 1) ^ S};
					A_ = A & ~(S | B[0]);  /* the elements in blocks of size 1 */
					while (A != A_ && Constants.extract_MSB32(B, hi)) {  /* get an orbit lo..hi ... */
						int pmask, SB, UB;
						Constants.extract_MSB32(B, lo);
						pmask = (int) (BIT(hi[0] + 1) - BIT(lo[0]));
						SB = A & pmask;
						UB = ~A & pmask;
						while (Constants.get_MSB32(SB, hi) && Constants.get_LSB32(UB, lo) && hi[0] > lo[0]) { /* ... if highest set > lowest unset: swap them */
							SB ^= BIT(hi[0]) | BIT(lo[0]);
							UB ^= BIT(hi[0]) | BIT(lo[0]);
							T = ((P[0] >> hi[0]) ^ (P[0] >> lo[0])) & M;
							P[0] ^= (T << hi[0]) | (T << lo[0]);
							T = ((P[1] >> hi[0]) ^ (P[1] >> lo[0])) & M;
							P[1] ^= (T << hi[0]) | (T << lo[0]);
							t = q[a0 + hi[0]];  /* left-multiplication by (lo hi) */
							q[a0 + hi[0]] = q[a0 + lo[0]];
							q[a0 + lo[0]] = (byte)t;
						}
						A_ |= SB;
						if (SB != 0 && UB != 0) {
							S ^= BIT(lo[0]);
						}
						if (A_ > A_min) {
							break;
						}
					}
					dj = 0;
					do {
						if (dj >= j || (bl & BIT(k - j + dj)) == 0) {
							next = true;
						}
						dj++;
					} while (!next && ANTICHAIN(P, j - dj, m, k1, mask) == A_);
					if (A_ > A_min || (A_ == A_min && dj < dr)) {
						continue;  /* not minimal */
					}
					if (A_ < A_min || (A_ == A_min && dj > dr)) {  /* new minimum! */
						A_min = A_;
						dr = dj;
						SI1size = 0;
					}
					permutation.perm_cpy(n + k, q, GD.SI1[SI1size].p);
					if (j < r) {  /* move antichains j..(j-dr+1) to positions r..(r-dr+1), shifting r..j+1 to the right
					 *  - move j..(j-dr+1) by r-j positions to the left
					 *  - move r..(j+1) by dr positions to the right
					 */
						byte[] pqq;
						if (j < k1) {
							if (r < k1) {
								long MR11, ML11;
								ML11 = (BIT(dr * m) - 1) << ((j - dr + 1) * m);
								MR11 = (BIT((r - j) * m) - 1) << ((j + 1) * m);
								P[1] = (P[1] & ~(ML11 | MR11)) | ((P[1] & ML11) << ((r - j) * m)) | ((P[1] & MR11) >> (dr * m));
							} else {
								long MR00, MR01, MR11, ML10, ML11;
								if (r - dr >= k1) {
									MR00 = (BIT((r - k1 - dr + 1) * m) - 1) << (dr * m);
									MR01 = BIT(dr * m) - 1;
								} else {
									MR00 = 0L;
									MR01 = BIT((r - k1 + 1) * m) - 1;
								}
								MR11 = (BIT((k1 - j - 1) * m) - 1) << (j + 1) * m;
								if (r - k1 + 1 >= dr) {
									ML10 = (BIT(dr * m) - 1) << (j - dr + 1) * m;
									ML11 = 0L;
								} else {
									ML10 = (BIT((r - k1 + 1) * m) - 1) << (j - r + k1) * m;
									ML11 = (BIT((dr - (r - k1 + 1)) * m) - 1) << (j - dr + 1) * m;
								}
								T = (P[0] & ~(MR00 | MR01))
									| ((P[0] & MR00) >> (dr * m))
									| (r - j - k1 > 0 ? ((P[1] & ML10) << ((r - j - k1) * m)) : ((P[1] & ML10) >> (-(r - j - k1) * m)));
								P[1] = (P[1] & ~(MR11 | ML10 | ML11))
									| ((P[1] & MR11) >> (dr * m))
									| ((P[1] & ML11) << ((r - j) * m))
									| (dr - k1 > 0 ? ((P[0] & MR01) >> ((dr - k1) * m)) : ((P[0] & MR01) << (-(dr - k1) * m)));
								P[0] = T;
							}
						} else {
							if (j - dr + 1 < k1) {
								long MR00, MR01, ML00, ML10, ML11;
								MR00 = (BIT((r + 1 - k1 - dr) * m) - 1) << (dr * m);
								MR01 = (BIT((k1 + dr - j - 1) * m) - 1) << ((j + 1 - k1) * m);
								ML00 = BIT((j - k1 + 1) * m) - 1;
								if (r - dr + 1 - k1 >= 0) {
									ML10 = ((BIT((k1 - 1 - j + dr) * m) - 1) << ((j - dr + 1) * m));
									ML11 = 0L;
								} else {
									ML10 = ((BIT((r - j) * m) - 1) << (k1 - r + j) * m);
									ML11 = ((BIT(k1 - r + dr - 1) * m) - 1) << ((j - dr + 1) * m);
								}
								T = (P[0] & ~(MR00 | MR01 | ML00))
									| ((P[0] & MR00) >> (dr * m))
									| ((P[0] & ML00) << ((r - j) * m))
									| (r - j - k1 > 0 ? ((P[1] & ML10) << ((r - j - k1) * m)) : ((P[1] & ML10) >> (-(r - j - k1) * m)));
								P[1] = (P[1] & ~(ML10 | ML11))
									| ((P[1] & ML11) << ((r - j) * m))
									| (dr - k1 > 0 ? ((P[0] & MR01) >> ((dr - k1) * m)) : ((P[0] & MR01) << (-(dr - k1) * m)));
								P[0] = T;
							} else {
								long MR00, ML00;
								ML00 = (BIT(dr * m) - 1) << ((j - dr + 1 - k1) * m);
								MR00 = (BIT((r - j) * m) - 1) << ((j + 1 - k1) * m);
								P[0] = (P[0] & ~(ML00 | MR00)) | ((P[0] & ML00) << ((r - j) * m)) | ((P[0] & MR00) >> (dr * m));
							}
						}
						/* left-multiply q=GD.SI1[SI1size].p by the inverse of the applied permutation */
						int pqo = n + k - 1 - j;
						pqq = GD.SI1[SI1size].p;
						int pqqo = n + k - 1 - r;
						for (t = dr; t-- != 0; ) {
							pqq[pqqo + t] = q[pqo + t];
						}
						pqo -= (r - j);  /* pq = q + n+k-1-r; */
						pqqo += dr;   /* pqq = GD.SI1[SI1size].p + n+k-1-r+dr; */
						for (t = r - j; t-- != 0; ) {
							pqq[pqqo + t] = q[pqo + t];
						}
					}
					GD.SI1[SI1size].S = S;
					GD.SI1[SI1size].rep[0] = P[0];
					GD.SI1[SI1size].rep[1] = P[1];
//#ifdef DOTEST
//				if (ANTICHAIN(P,r,m,k1,mask) != A_min) {
//					printf("BAD MINIMISATION [antichainList_applySI_p2]: minimising %lx|%lx\n",
//							(long)L[0], (long)L[1]);
//					printf("   have %lx|%lx\n", (long)P[0], (long)P[1]);
//					printf("   expected %x (m=%d, r=%d, j=%d, S=%x)\n", A_min, m, r, j, S);
//					erri(-4);
//				}
//				perm_mult(n+k, GD.SI1[SI1size].p, argpi, pt);
//				antichainList_apply_perm_p2(n, a0, a0+m, pt, k, GD.SI1[SI1size].rep, TT);
//				if (antichainList_cmp_p2(TT, L)) {
//					printf("BAD ACTION [antichainList_applySI_p2]: "); perm_print(n+k, pt, 0);
//					printf("   on %lx|%lx\n", (long)GD.SI1[SI1size].rep[0], (long)GD.SI1[SI1size].rep[1]);
//					printf("   have %lx|%lx\n", (long)TT[0], (long)TT[1]);
//					printf("   expected %lx|%lx\n", (long)L[0], (long)L[1]);
//					erri(-4);
//				}
//#endif
					SI1size++;
				}
			}
			SI0size = SI1size;
			SIt = GD.SI0;
			GD.SI0 = GD.SI1;
			GD.SI1 = SIt;
		}
// #ifdef DOTEST
// 	apf = BITSPERLONG/m;
// 	for (mask=BIT(m)-1,i=apf; i--; mask<<=m)
// 		M1[i] = mask;
// 	M0 = M1 + 2*apf-k;
// 	nLev = 0;
// 	for (j=1; j<=n; j++)
// 		if (!(SI & BIT(j)))
// 			lev[nLev++] = j;
// 	perm_init(n+k, pt);
// 	while (perm_next(nLev, lev, pt)) {
// 		antichainList_apply_perm_p2(n, a0, a0+m, pt, k, GD.SI0[0].rep, TT);
// 		antichainList_sort_p2(k, m, k-k1, M0, M1, bl, TT, p, a0);
// 		if (antichainList_cmp_p2(TT, GD.SI0[0].rep) < 0) {
// 			printf("BAD MINIMUM [antichainList_applySI_p2]: minimising %lx|%lx\n", (long)L[0], (long)L[1]);
// 			printf("   have %lx|%lx\n", (long)GD.SI1[0].rep[0], (long)GD.SI1[0].rep[1]);
// 			printf("   but %lx|%lx is smaller (a0=%d, m=%d, k=%d, SI=%x, bl=%x)\n",
// 					(long)TT[0], (long)TT[1], a0, m, k, SI, bl);
// 			erri(-4);
// 		}
// 	}
// #endif
		L[0] = GD.SI0[0].rep[0];
		L[1] = GD.SI0[0].rep[1];
		permutation.perm_cpy(n + k, GD.SI0[0].p, p);
		GD.SI0size = SI0size;
	}


// #ifdef TARGET_UTEST_SI
// void antichainList_applySI_p2_f(int n, int k, int k0, int a0, int m, int bl, Globals GD, long L[2],
// 		int SI, long M, permutation p)
// /*
//  * Non-static wrapper for antichainList_applySI_p2.
//  */
// {
// 	antichainList_applySI_p2(n, k, k0, a0, m, bl, GD, L, SI, M, p);
// }
// #endif


	/*
	 * After a call to antichainList_applySI_p1 that showed that its argument L is minimal under the action of the implicit
	 * stabiliser:  Add to S any generator of the stabiliser of L that arises from different ways of reaching the minimal
	 * element, and set *SI to the implicit stabiliser of L.  (L is only used in testing mode.)
	 */
	static void antichainList_extractStabiliser_p1(int n, int k, int lo, int hi, Globals GD, permgrpc S, int[] SI, long L) {
		int i;
		byte[] p = permutation.create();
// #ifdef DOTEST
// 	long        L_;
// #endif

		SI[0] &= ~(BIT(hi) - BIT(lo));
		SI[0] |= GD.SI0[0].S << lo;
		for (i = 1; i < GD.SI0size; i++) {
			permutation.perm_ldiv(n + k, GD.SI0[0].p, GD.SI0[i].p, p);
			if (!permutation.perm_isId(n + k, p)) {
				if (VERBOSE) {
					System.out.print("[antichainList_extractStabiliser_p1]: adding stabiliser generator ");
					permutation.perm_print(S.G.n, p, 0);
				}
				permgrp.permgrpc_addGenerator(S, p);
// #ifdef DOTEST
// 			antichainList_apply_perm_p1(n, lo, hi, p, k, L, &L_);
// 			if (antichainList_cmp_p1(L, L_)) {
// 				/* We don't test here whether the action on the lowest level is correct; this is done
// 				 * in lattice_test after the new lattice is created.
// 				 */
// 				printf("BAD STABILISER ELEMENT [antichainList_extractStabiliser_p1]: ");
// 				perm_print(n+k, p, 0);
// 				erri(-4);
// 			}
// #endif
			}
		}
	}


	/*
	 * After a call to antichainList_applySI_p2 that showed that its argument L is minimal under the action of the implicit
	 * stabiliser:  Add to S any generator of the stabiliser of L that arises from different ways of reaching the minimal
	 * element, and set *SI to the implicit stabiliser of L.  (L is only used in testing mode.)
	 */
	static void antichainList_extractStabiliser_p2(int n, int k, int lo, int hi, Globals GD, permgrpc S, int[] SI, long[] L) {
		int i;
		byte[] p = permutation.create();
// #ifdef DOTEST
// 	long        L_[2];
// #endif

		SI[0] &= ~(BIT(hi) - BIT(lo));
		SI[0] |= GD.SI0[0].S << lo;
		for (i = 1; i < GD.SI0size; i++) {
			permutation.perm_ldiv(n + k, GD.SI0[0].p, GD.SI0[i].p, p);
			if (!permutation.perm_isId(n + k, p)) {
// #ifdef VERBOSE
// 			printf("[antichainList_extractStabiliser_p2]: adding stabiliser generator "); perm_print(S.G.n, p, 0);
// #endif
				permgrp.permgrpc_addGenerator(S, p);
// #ifdef DOTEST
// 			antichainList_apply_perm_p2(n, lo, hi, p, k, L, L_);
// 			if (antichainList_cmp_p2(L, L_)) {
// 				/* We don't test here whether the action on the lowest level is correct; this is done
// 				 * in lattice_test after the new lattice is created.
// 				 */
// 				printf("BAD STABILISER ELEMENT [antichainList_extractStabiliser_p2]: ");
// 				perm_print(n+k, p, 0);
// 				erri(-4);
// 			}
// #endif
			}
		}
	}

	static int allbits = (1 << (Constants.MAXN - 2)) - 1;

	/*
	 * Make sure that the generators are stored consecutively in perm, and record which generators are involutions.
	 */
	static void permgrpc_compactGenerators(permgrpc G) {
		final int[] i = new int[1];
		final int[] j = new int[1];

		while (Constants.get_LSB32(G.freeperm, i) && Constants.get_MSB32(allbits ^ G.freeperm, j) && i[0] < j[0]) {
			permutation.perm_cpy(G.G.n, G.G.perm[j[0]], G.G.perm[i[0]]);
			permutation.perm_cpy(G.G.n, G.G.invperm[j[0]], G.G.invperm[i[0]]);
			G.freeperm ^= BIT(i[0]);  /* bit i is set, so this clears it */
			G.freeperm |= BIT(j[0]);
		}
		final int[] ugly = new int[] {G.G.ngens};
		Constants.get_LSB32(G.freeperm, ugly);
		G.G.ngens = ugly[0];
		G.G.invol = 0;
		for (int k = 0, biti = 1; k < G.G.ngens; k++, biti <<= 1) {
			if (permutation.perm_cmp(G.G.n, G.G.perm[k], G.G.invperm[k]) == 0) {
				G.G.invol |= biti;
			}
		}
	}


	/*
	 * Generate Beneš networks for the action of the generators on the next level (AD.cl-1)
	 * of the current lattice or, if AD.cl==0, the lowest non-trivial level of the new lattice.
	 */
	static void permgrp_preprocessGenerators(final antichaindata AD) {
		final lattice L = AD.L;
		final permgrp G = AD.SD[AD.cl].ST;
		//#ifndef FILTER_GRADED
		if (AD.cl != 0) {
			for (int i = 0; i < G.ngens; i++) {
				G.benes[AD.cl - 1][i] = Benes.benes_get(G.perm[i], G.invperm[i], L.lev[AD.cl - 1], L.lev[AD.cl]);
			}
			G.BenesValid |= BIT(AD.cl - 1);
		} else {
			for (int i = 0; i < G.ngens; i++) {
				G.benes[L.nLev - 1][i] = Benes.benes_get(G.perm[i], G.invperm[i], L.lev[L.nLev - 1], L.lev[L.nLev]);
			}
			G.BenesValid |= BIT(L.nLev - 1);
		}
// #else
// 	for (i=0; i<G.ngens; i++)
// 		benes_get(G.perm[i], G.invperm[i], L.lev[L.nLev-1], L.lev[L.nLev], &(G.Benes[0][i]));
// 	G.BenesValid |= BIT(0);
// #endif
	}


	/*
	 * Generate Beneš networks for the action of the generators on the next level (AD.cl-1)
	 * of the current lattice as well as for the action on AD.k antichains of the appropriate
	 * size or, if AD.cl==0, the lowest non-trivial level of the new lattice.
	 */
	static void permgrp_preprocessGenerators_blocked(antichaindata AD) {
		int i;
		lattice L;
		permgrp G;

		L = AD.L;
		G = AD.SD[AD.cl].ST;
		//#ifndef FILTER_GRADED
		if (AD.cl != 0) {
			if ((G.BenesValid & BIT(L.nLev - 1)) != 0) {
				for (i = 0; i < G.ngens; i++) {
					G.benes[AD.cl - 1][i] = Benes.benes_get(G.perm[i], G.invperm[i], L.lev[AD.cl - 1], L.lev[AD.cl]);
					Benes.benes_delete(G.benes[L.nLev - 1][i]);
					G.benes[L.nLev - 1][i] = Benes.benes_get_blocked(G.perm[i], G.invperm[i], L.lev[L.nLev - 1], L.lev[L.nLev], L.lev[AD.cl] - L.lev[AD.cl - 1]);
				}
				G.BenesValid |= BIT(AD.cl - 1);
			} else {
				for (i = 0; i < G.ngens; i++) {
					G.benes[AD.cl - 1][i] = Benes.benes_get(G.perm[i], G.invperm[i], L.lev[AD.cl - 1], L.lev[AD.cl]);
					G.benes[L.nLev - 1][i] = Benes.benes_get_blocked(G.perm[i], G.invperm[i], L.lev[L.nLev - 1], L.lev[L.nLev], L.lev[AD.cl] - L.lev[AD.cl - 1]);
				}
				G.BenesValid |= BIT(AD.cl - 1) | BIT(L.nLev - 1);
			}
		} else {
			if ((G.BenesValid & BIT(L.nLev - 1)) != 0) {
				for (i = 0; i < G.ngens; i++) {
					Benes.benes_delete(G.benes[L.nLev - 1][i]);
					G.benes[L.nLev - 1][i] = Benes.benes_get(G.perm[i], G.invperm[i], L.lev[L.nLev - 1], L.lev[L.nLev]);
				}
			} else {
				for (i = 0; i < G.ngens; i++) {
					G.benes[L.nLev - 1][i] = Benes.benes_get(G.perm[i], G.invperm[i], L.lev[L.nLev - 1], L.lev[L.nLev]);
				}
				G.BenesValid |= BIT(L.nLev - 1);
			}
		}
// #else
// 	if (G.BenesValid & BIT(0)) {
// 		for (i=0; i<G.ngens; i++) {
// 			benes_delete(G.Benes[0][i]);
// 			benes_get(G.perm[i], G.invperm[i], L.lev[L.nLev-1], L.lev[L.nLev], &(G.Benes[0][i]));
// 		}
// 	} else {
// 		for (i=0; i<G.ngens; i++)
// 			benes_get(G.perm[i], G.invperm[i], L.lev[L.nLev-1], L.lev[L.nLev], &(G.Benes[0][i]));
// 		G.BenesValid |= BIT(0);
// 	}
// #endif
	}


	/*
	 * Do the housekeeping for a newly computed orbit element.  Special case of a single antichain.
	 *
	 * An antichain list is canonical if and only if, as a multiset, it is minimal in its orbit under the
	 * stabiliser of the (full) old lattice.  As this stabiliser acts on each level, a violation of minimality
	 * on any level precludes any completion of the antichain data on higher levels being canonical.
	 *
	 * The points on the lowest level of the new lattice correspond to the antichains in that sequence; if a
	 * permutation fixes the multiset but permutes its elements, the points of the lowest level of the new
	 * lattice need to be permuted accordingly to obtain an element of the stabiliser of the new lattice.
	 */
	static void processElement_1(antichaindata AD, permgrp G, permgrpc S, int pos, int gen) {
		long A;
		int Apos;
		byte[] h = permutation.create();

		A = AD.GD.orb[AD.GD.orbsize].data[0];
		Apos = AD.GD.orbsize;
		/* check whether the element is new... */
		//if (hashtable_query_insert_1(AD.GD.orbpos, A, HASH_1(A), & Apos)){
		final boolean contains = AD.GD.orbpos.containsKey(A);
		AD.GD.orbpos.put(A, (long) Apos);
		if (contains) {
			/* ...if not, note the new stabiliser element */
			if (pos != 0) {
				if (Apos != 0) {
					permutation.perm_ldiv_mult(S.G.n, AD.GD.orb[pos].toRoot, G.perm[gen], AD.GD.orb[Apos].toRoot, h);
				} else {
					permutation.perm_ldiv(S.G.n, AD.GD.orb[pos].toRoot, G.perm[gen], h);
				}
			} else {
				if (Apos != 0)  /* equivalent to if (AD.GD.orbsort[lpos]) */ {
					assert h != null;
					assert G.perm[gen] != null;
					assert AD.GD.orb[Apos].toRoot != null;
					permutation.perm_mult(S.G.n, G.perm[gen], AD.GD.orb[Apos].toRoot, h);
				} else {
					permutation.perm_cpy(S.G.n, G.perm[gen], h);
				}
			}
// #ifdef DOTEST
// 		if (AD.GD.orbspace == AD.GD.orbsize)
// 			globals_enlargen_orbitspace(AD.GD);
// 		antichain_apply_perm(AD.L.lev[AD.cl], AD.L.lev[AD.cl+1], h, AD.GD.orb[0].data[0] << AD.L.lev[AD.cl],
// 				AD.GD.orb[AD.GD.orbsize].data);
// 		if (long_cmp(AD.GD.orb[0].data[0] << AD.L.lev[AD.cl], AD.GD.orb[AD.GD.orbsize].data[0])) {
// 			/* We don't test here whether the action on the lowest level is correct; this is done
// 			 * in lattice_test after the new lattice is created.
// 			 */
// 			printf("BAD STABILISER ELEMENT [processElement_1]: ");
// 			perm_print(S.G.n, h, 0);
// 			erri(-4);
// 		}
// #endif
// #ifdef VERBOSE
// 		printf("[processElement_1]: adding stabiliser generator "); perm_print(S.G.n, h, 0);
// #endif
			if (!permutation.perm_isId(S.G.n, h)) {
				permgrp.permgrpc_addGenerator(S, h);
			}
		} else {
			/* ...if yes, note the permutation to the root and the applied generator */
			AD.GD.orb[AD.GD.orbsize].gen = gen;
			if (pos != 0) {
				permutation.perm_mult(S.G.n, G.invperm[gen], AD.GD.orb[pos].toRoot, AD.GD.orb[AD.GD.orbsize].toRoot);
			} else {
				permutation.perm_cpy(S.G.n, G.invperm[gen], AD.GD.orb[AD.GD.orbsize].toRoot);
			}
			AD.GD.orbsize++;
		}
	}


	/*
	 * Do the housekeeping for a newly computed orbit element.  Special case of a list of antichains that,
	 * if packed, fits into one long.
	 *
	 * An antichain list is canonical if and only if, as a multiset, it is minimal in its orbit under the
	 * stabiliser of the (full) old lattice.  As this stabiliser acts on each level, a violation of minimality
	 * on any level precludes any completion of the antichain data on higher levels being canonical.
	 *
	 * The points on the lowest level of the new lattice correspond to the antichains in that sequence; if a
	 * permutation fixes the multiset but permutes its elements, the points of the lowest level of the new
	 * lattice need to be permuted accordingly to obtain an element of the stabiliser of the new lattice.
	 */
	static void processElement_p1(antichaindata AD, permgrp G, permgrpc S, int pos, int gen, byte[] p) {
		long A;
		int Apos;
		byte[] h = permutation.create();

		A = AD.GD.orb[AD.GD.orbsize].data[0];
		Apos = AD.GD.orbsize;
		/* check whether the element is new... */
		final boolean contains = AD.GD.orbpos.containsKey(A);
		AD.GD.orbpos.put(A, (long) Apos);
		if (contains) {
			//if (hashtable_query_insert_1(AD.GD.orbpos, A, HASH_1(A), & Apos)){
			/* ...if no, note the new stabiliser element */
			if (pos != 0) {
				if (Apos != 0) {
					permutation.perm_mult3_ldiv(S.G.n, p, G.invperm[gen], AD.GD.orb[pos].toRoot,AD.GD.orb[Apos].toRoot, h);
				} else {
					permutation.perm_mult3_inv(S.G.n, p, G.invperm[gen], AD.GD.orb[pos].toRoot, h);
				}
			} else {
				if (Apos != 0) {
					permutation.perm_mult_ldiv(S.G.n, p, G.invperm[gen], AD.GD.orb[Apos].toRoot, h);
				} else {
					permutation.perm_mult_inv(S.G.n, p, G.invperm[gen], h);
				}
			}
// #ifdef DOTEST
// 		if (AD.GD.orbspace == AD.GD.orbsize)
// 			globals_enlargen_orbitspace(AD.GD);
// 		antichainList_apply_perm_p1(AD.L.n, AD.L.lev[AD.cl], AD.L.lev[AD.cl+1], h, AD.k,
// 				AD.GD.orb[0].data[0], AD.GD.orb[AD.GD.orbsize].data);
// 		if (antichainList_cmp_p1(AD.GD.orb[0].data[0], AD.GD.orb[AD.GD.orbsize].data[0])) {
// 			/* We don't test here whether the action on the lowest level is correct; this is done
// 			 * in lattice_test after the new lattice is created.
// 			 */
// 			printf("BAD STABILISER ELEMENT [processElement_p1]: ");
// 			perm_print(S.G.n, h, 0);
// 			erri(-4);
// 		}
// #endif
// #ifdef VERBOSE
// 		printf("[processElement_p1]: adding stabiliser generator "); perm_print(S.G.n, h, 0);
// #endif
			if (!permutation.perm_isId(S.G.n, h)) {
				permgrp.permgrpc_addGenerator(S, h);
			}
		} else {
			/* ...if yes, note the permutation to the root and the applied generator */
			AD.GD.orb[AD.GD.orbsize].gen = gen;
			if (pos != 0) {
				permutation.perm_mult3(S.G.n, p, G.invperm[gen], AD.GD.orb[pos].toRoot, AD.GD.orb[AD.GD.orbsize].toRoot);
			} else {
				permutation.perm_mult(S.G.n, p, G.invperm[gen], AD.GD.orb[AD.GD.orbsize].toRoot);
			}
			AD.GD.orbsize++;
// #ifdef DOTEST
// 		if (AD.GD.orbspace == AD.GD.orbsize)
// 			globals_enlargen_orbitspace(AD.GD);
// 		antichainList_apply_perm_p1(AD.L.n, AD.L.lev[AD.cl], AD.L.lev[AD.cl+1], AD.GD.orb[AD.GD.orbsize-1].toRoot,
// 				AD.k, AD.GD.orb[AD.GD.orbsize-1].data[0], AD.GD.orb[AD.GD.orbsize].data);
// 		if (antichainList_cmp_p1(AD.GD.orb[0].data[0], AD.GD.orb[AD.GD.orbsize].data[0])) {
// 			/* We don't test here whether the action on the lowest level is correct; this is done
// 			 * in lattice_test after the new lattice is created.
// 			 */
// 			printf("BAD ACTION [processElement_p1]: ");
// 			perm_print(S.G.n, AD.GD.orb[AD.GD.orbsize-1].toRoot, 0);
// 			erri(-4);
// 		}
// #endif
		}
	}


//	/*
//	 * Do the housekeeping for a newly computed orbit element.    Special case of a list of antichains that,
//	 * if packed, fits into (and requires) two long.
//	 *
//	 * An antichain list is canonical if and only if, as a multiset, it is minimal in its orbit under the
//	 * stabiliser of the (full) old lattice.  As this stabiliser acts on each level, a violation of minimality
//	 * on any level precludes any completion of the antichain data on higher levels being canonical.
//	 *
//	 * The points on the lowest level of the new lattice correspond to the antichains in that sequence; if a
//	 * permutation fixes the multiset but permutes its elements, the points of the lowest level of the new
//	 * lattice need to be permuted accordingly to obtain an element of the stabiliser of the new lattice.
//	 */
//	static void processElement_p2(antichaindata AD, permgrp G, permgrpc S, long pos, int gen, int[] p) {
//		long[] A;
//		int Apos;
//		int[] h;
//
//		A = AD.GD.orb[AD.GD.orbsize].data;
//		Apos = AD.GD.orbsize;
//		/* check whether the element is new... */
//		if (hashtable_query_insert_2(AD.GD.orbpos, A, HASH_2(A), & Apos)){
//			/* ...if no, note the new stabiliser element */
//			if (pos != 0) {
//				if (Apos != 0)
//					permutation.perm_mult3_ldiv(S.G.n, p, G.invperm[gen], AD.GD.orb[pos].toRoot,
//						AD.GD.orb[Apos].toRoot, h);
//				else
//					permutation.perm_mult3_inv(S.G.n, p, G.invperm[gen], AD.GD.orb[pos].toRoot, h);
//			} else {
//				if (Apos != 0)
//					permutation.perm_mult_ldiv(S.G.n, p, G.invperm[gen], AD.GD.orb[Apos].toRoot, h);
//				else
//					permutation.perm_mult_inv(S.G.n, p, G.invperm[gen], h);
//			}
//// #ifdef DOTEST
//// 		if (AD.GD.orbspace == AD.GD.orbsize)
//// 			globals_enlargen_orbitspace(AD.GD);
//// 		antichainList_apply_perm_p2(AD.L.n, AD.L.lev[AD.cl], AD.L.lev[AD.cl+1], h, AD.k, AD.GD.orb[0].data,
//// 				AD.GD.orb[AD.GD.orbsize].data);
//// 		if (antichainList_cmp_p2(AD.GD.orb[0].data, AD.GD.orb[AD.GD.orbsize].data)) {
//// 			/* We don't test here whether the action on the lowest level is correct; this is done
//// 			 * in lattice_test after the new lattice is created.
//// 			 */
//// 			printf("BAD STABILISER ELEMENT [processElement_p2]: ");
//// 			perm_print(S.G.n, h, 0);
//// 			erri(-4);
//// 		}
//// #endif
//// #ifdef VERBOSE
//// 		printf("[processElement_p2]: adding stabiliser generator "); perm_print(S.G.n, h, 0);
//// #endif
//			if (!perm_isId(S.G.n, h))
//				permgrpc_addGenerator(S, h);
//		} else{
//			/* ...if yes, note the permutation to the root and the applied generator */
//			AD.GD.orb[AD.GD.orbsize].gen = gen;
//			if (pos)
//				perm_mult3(S.G.n, p, G.invperm[gen], AD.GD.orb[pos].toRoot, AD.GD.orb[AD.GD.orbsize].toRoot);
//			else
//				perm_mult(S.G.n, p, G.invperm[gen], AD.GD.orb[AD.GD.orbsize].toRoot);
//			AD.GD.orbsize++;
//#ifdef DOTEST
//			if (AD.GD.orbspace == AD.GD.orbsize)
//				globals_enlargen_orbitspace(AD.GD);
//			antichainList_apply_perm_p2(AD.L.n, AD.L.lev[AD.cl], AD.L.lev[AD.cl + 1], AD.GD.orb[AD.GD.orbsize - 1].toRoot,
//				AD.k, AD.GD.orb[AD.GD.orbsize - 1].data, AD.GD.orb[AD.GD.orbsize].data);
//			if (antichainList_cmp_p2(AD.GD.orb[0].data, AD.GD.orb[AD.GD.orbsize].data)) {
//				/* We don't test here whether the action on the lowest level is correct; this is done
//				 * in lattice_test after the new lattice is created.
//				 */
//				printf("BAD ACTION [processElement_p2]: ");
//				perm_print(S.G.n, AD.GD.orb[AD.GD.orbsize - 1].toRoot, 0);
//				erri(-4);
//			}
//#endif
//		}
//	}


	/*
	 * Whether the antichain data given by AD may yield a canonical antichain list.  Special case of a single
	 * antichain.
	 *
	 * An antichain list is canonical if and only if, as a multiset, it is minimal in its orbit under the
	 * stabiliser of the (full) old lattice.  As this stabiliser acts on each level, a violation of minimality
	 * on any level precludes any completion of the antichain data on higher levels being canonical.
	 *
	 * The function checks whether the multiset of sets chosen on the current level (AD.O[...] & AD.cmc) is
	 * minimal under the action of the current stabiliser (AD.SD[AD.cl+1].ST).  If yes, and if the antichain
	 * data is not complete (that is, AD.cl > 0]), then the new stabiliser is stored in AD.SD[AD.cl].ST.  If
	 * the antichain data is complete and canonical, AD.SD[0].ST will instead be set to the stabiliser of the
	 * new lattice obtained from the antichain data.  (The points on the lowest (new) level of the new lattice
	 * correspond to the antichains in that sequence; if a permutation fixes the multiset but permutes its
	 * elements, the points of the lowest level of the new lattice need to be permuted accordingly to obtain
	 * an element of the stabiliser of the new lattice.  Additional generators of the stabiliser of the new
	 * lattice are given by all possible permutations of identical antichains, i.e., all possible permutations
	 * of points of the lowest level of the new lattice that have identical covering sets.)
	 */
	static boolean antichaindata_isCanonical_1(antichaindata AD) {
		int pos;
		int gen;
		permgrp G;
		permgrpc S;

		if (VERBOSE) {
			System.out.println("[entering antichaindata_isCanonical_1]: " + AD.cl + " " + AD.SD[AD.cl + 1].ST.n);
			lattice.lattice_print(AD.L);
			antichain.antichaindata_printCounters(AD);
		}
		G = AD.SD[AD.cl + 1].ST;
		assert G.ngens == 0 || (G.BenesValid & BIT(AD.cl)) != 0
			: "ATTEMPTS TO USE INVALID BENEŠ NETWORKS [antichaindata_isCanonical_1]: level " + AD.cl;
		if (G.ngens > 0) {
			if ((AD.GD.orb[0].data[0] = (AD.O[0] & AD.cmc) >> AD.L.lev[AD.cl]) != 0) {
				if (AD.SD[AD.cl + 1].SI != 0) {
					/* test minimality under implied stabiliser and extract implied stabiliser generators if minimal */
					final byte[] p = permutation.create();
					final long[] L = new long[] {AD.GD.orb[0].data[0]};
					permutation.perm_init(AD.L.n + AD.k, p);
					final int[] ugly = new int[] {AD.SD[AD.cl].SI};
					final int xcl = AD.cl;
					antichainList_applySI_1(AD.L.lev[AD.cl], AD.L.lev[AD.cl + 1] - AD.L.lev[AD.cl], L, AD.SD[AD.cl + 1].SI, ugly, p)	;
					AD.SD[xcl].SI = ugly[0];
					if (L[0] != AD.GD.orb[0].data[0]) {
						return false;
					}
					S = antichain.antichaindata_ensureStabiliser(AD, AD.cl);
					AD.SD[AD.cl].ST = S.G;
					permgrp.permgrpc_init(S, AD.L.n + AD.k);
					/* now spin up the orbit of representatives under the action of the (old) implicit stabiliser */
					AD.GD.orbsize = 1;
					AD.GD.orb[0].gen = -1;
					//hashtable_clear(AD.GD.orbpos);
					//hashtable_insert_1(AD.GD.orbpos, L, HASH_1(L), 0);
					AD.GD.orbpos.clear();
					AD.GD.orbpos.put(L[0], 0L);
					//#ifndef HARDCODE_MAXN_22
					if (S.G.n > G.n) {
						for (gen = 0; gen < G.ngens; gen++) {
							permutation.perm_resize(G.n, S.G.n, G.perm[gen]);
							permutation.perm_resize(G.n, S.G.n, G.invperm[gen]);
						}
					}
					//#endif
					for (pos = 0; pos < AD.GD.orbsize; pos++) {
						for (gen = 0; gen < G.ngens; gen++) {
							if ((G.invol & BIT(gen)) != 0 && AD.GD.orb[pos].gen == gen) {
								continue;
							}
							/* apply generator gen to orbit element pos... */
							if (AD.GD.orbspace == AD.GD.orbsize) {
								Globals.globals_enlargen_orbitspace(AD.GD);
							}
							long[] A = new long[] {AD.GD.orb[pos].data[0]};
							Benes.benes_apply_p1(G.benes[AD.cl][gen], A);
							permutation.perm_init(AD.L.n + AD.k, p);
							antichainList_applySI_1(AD.L.lev[AD.cl], AD.L.lev[AD.cl + 1] - AD.L.lev[AD.cl], A, AD.SD[AD.cl + 1].SI, null, p);
							/* ...we're done if the result is smaller than the original element */
							if (long_cmp(L[0], A[0]) > 0) {
								if (VERBOSE) {
									System.out.println("                                       NOT canonical");
								}
// #ifdef PRINTLARGEORBITS
// 							if (AD.GD.orbsize > LARGEORBITTHRESHOLD)
// 								printf("antichaindata_isCanonical_1: %lu [false]\n", AD.GD.orbsize);
// #endif
								return false;
							}
							/* ...otherwise, do the necessary housekeeping */
							AD.GD.orb[AD.GD.orbsize].data[0] = A[0];
							processElement_p1(AD, G, S, pos, gen, p);
						}
					}
					permgrpc_compactGenerators(S);
				} else {
					/* test minimality under implied stabiliser and extract implied stabiliser generators if minimal */
					byte[] p = permutation.create();
					long L;
					L = AD.GD.orb[0].data[0];
					permutation.perm_init(AD.L.n + AD.k, p);
					AD.SD[AD.cl].SI = 0;
					S = antichain.antichaindata_ensureStabiliser(AD, AD.cl);
					AD.SD[AD.cl].ST = S.G;
					permgrp.permgrpc_init(S, AD.L.n + AD.k);
					/* now spin up the orbit of representatives under the action of the (old) implicit stabiliser */
					AD.GD.orbsize = 1;
					AD.GD.orb[0].gen = -1;
//					hashtable_clear(AD.GD.orbpos);
//					hashtable_insert_1(AD.GD.orbpos, L, HASH_1(L), 0);
					AD.GD.orbpos.clear();
					AD.GD.orbpos.put(L,0L);
//#ifndef HARDCODE_MAXN_22
					if (S.G.n > G.n) {
						for (gen = 0; gen < G.ngens; gen++) {
							permutation.perm_resize(G.n, S.G.n, G.perm[gen]);
							permutation.perm_resize(G.n, S.G.n, G.invperm[gen]);
						}
					}
//#endif
					for (pos = 0; pos < AD.GD.orbsize; pos++) {
						for (gen = 0; gen < G.ngens; gen++) {
							if ((G.invol & BIT(gen)) != 0 && AD.GD.orb[pos].gen == gen) {
								continue;
							}
							/* apply generator gen to orbit element pos... */
							if (AD.GD.orbspace == AD.GD.orbsize) {
								Globals.globals_enlargen_orbitspace(AD.GD);
							}
							long[] A = new long[] {AD.GD.orb[pos].data[0]};
							Benes.benes_apply_p1(G.benes[AD.cl][gen], A);
							permutation.perm_init(AD.L.n + AD.k, p);
							/* ...we're done if the result is smaller than the original element */
							if (long_cmp(L, A[0]) > 0) {
								if (VERBOSE) {
									System.out.println("                                       NOT canonical");
								}
// #ifdef PRINTLARGEORBITS
// 							if (AD.GD.orbsize > LARGEORBITTHRESHOLD)
// 								printf("antichaindata_isCanonical_1: %lu [false]\n", AD.GD.orbsize);
// #endif
								return false;
							}
							/* ...otherwise, do the necessary housekeeping */
							AD.GD.orb[AD.GD.orbsize].data[0] = A[0];
							if (AD.SD[AD.cl + 1].SI != 0) {
								processElement_p1(AD, G, S, pos, gen, p);
							} else {
								processElement_1(AD, G, S, pos, gen);
							}
						}
					}
					permgrpc_compactGenerators(S);
				}
			} else { /* as the antichains must intersect the lowest level, AD.cl < AD.L.nLev-2, so G.n == S.n */
				AD.SD[AD.cl].ST = AD.SD[AD.cl + 1].ST;
				AD.SD[AD.cl].SI = AD.SD[AD.cl + 1].SI;
			}
		} else if (AD.SD[AD.cl + 1].SI != 0) {
			if ((AD.GD.orb[0].data[0] = (AD.O[0] & AD.cmc) >> AD.L.lev[AD.cl]) != 0) {
				/* test minimality under implied stabiliser and extract implied stabiliser generators if minimal */
				byte[] p = permutation.create();
				long[] L = new long[] { AD.GD.orb[0].data[0]};
				permutation.perm_init(AD.L.n + AD.k, p);
				final int[] ugly = new int[] {AD.SD[AD.cl].SI};
				final int xcl = AD.cl;
				antichainList_applySI_1(AD.L.lev[AD.cl], AD.L.lev[AD.cl + 1] - AD.L.lev[AD.cl], L, AD.SD[AD.cl + 1].SI, ugly, p);
				AD.SD[xcl].SI = ugly[0];
				if (L[0] != AD.GD.orb[0].data[0]) {
					return false;
				}
				S = antichain.antichaindata_ensureStabiliser(AD, AD.cl);
				AD.SD[AD.cl].ST = S.G;
				permgrp.permgrpc_init(S, AD.L.n + AD.k);
			} else { /* as the antichains must intersect the lowest level, AD.cl < AD.L.nLev-2, so G.n == S.n */
				AD.SD[AD.cl].ST = AD.SD[AD.cl + 1].ST;
				AD.SD[AD.cl].SI = AD.SD[AD.cl + 1].SI;
			}
		} else {
			//#ifndef FILTER_GRADED
			if (AD.cl == AD.L.nLev - 2) {
				//#endif
				S = antichain.antichaindata_ensureStabiliser(AD, AD.cl);
				AD.SD[AD.cl].ST = S.G;
				permgrp.permgrpc_init(S, AD.L.n + AD.k);
				//#ifndef FILTER_GRADED
			} else {
				AD.SD[AD.cl].ST = AD.SD[AD.cl + 1].ST;
			}
			//#endif
			AD.SD[AD.cl].SI = AD.SD[AD.cl + 1].SI;
		}
		permgrp_preprocessGenerators(AD);
		if (VERBOSE) {
			System.out.printf("***** level %d:\n", AD.cl);
			permgrp.permgrp_printGenerators(AD.SD[AD.cl].ST, 0);
			System.out.println("                                       canonical");
		}
// #ifdef PRINTLARGEORBITS
// 	if (AD.GD.orbsize > LARGEORBITTHRESHOLD)
// 		printf("antichaindata_isCanonical_1: %lu [true]\n", AD.GD.orbsize);
// #endif
		return true;
	}


	/*
	 * Whether the antichain data given by AD may yield a canonical antichain list.  Special case of a list
	 * that, if packed, fits into one long.
	 *
	 * An antichain list is canonical if and only if, as a multiset, it is minimal in its orbit under the
	 * stabiliser of the (full) old lattice.  As this stabiliser acts on each level, a violation of minimality
	 * on any level precludes any completion of the antichain data on higher levels being canonical.
	 *
	 * The function checks whether the multiset of sets chosen on the current level (AD.O[...] & AD.cmc) is
	 * minimal under the action of the current stabiliser (AD.SD[AD.cl+1].ST and AD.SD[AD.cl+1].SI).  If yes,
	 * and if the antichain data is not complete (that is, AD.cl > 0]), then the new stabiliser is stored in
	 * AD.SD[AD.cl].ST and AD.SD[AD.cl].SI.  If the antichain data is complete and canonical, AD.SD[0].ST and
	 * AD.SD[0].SI will instead be set to the stabiliser of the new lattice obtained from the antichain data.
	 * (The points on the lowest (new) level of the new lattice correspond to the antichains in that sequence;
	 * if a permutation fixes the multiset but permutes its elements, the points of the lowest level of the
	 * new lattice need to be permuted accordingly to obtain an element of the stabiliser of the new lattice.
	 * Additional generators of the stabiliser of the new lattice are given by all possible permutations of
	 * identical antichains, i.e., all possible permutations of points of the lowest level of the new lattice
	 * that have identical covering sets.  The latter may be handled by "implicit" stabilisers.)
	 */
	static boolean antichaindata_isCanonical_p1(antichaindata AD, int bits) {
		int i, gen;
		int pos;
		long[] M = new long[Constants.MAXN - 2];
		long mask, pmask;
		permgrp G;
		permgrpc S;

		if (VERBOSE) {
			System.out.println("[entering antichaindata_isCanonical_p1]:");
			lattice.lattice_print(AD.L);
			antichain.antichaindata_printCounters(AD);
		}
		for (mask = BIT(bits) - 1, i = AD.k; i-- != 0; mask <<= bits) {
			M[i] = mask;
		}
		G = AD.SD[AD.cl + 1].ST;
// #ifdef DOTEST
// 	if (G.ngens && !(G.BenesValid & BIT(AD.cl))) {
// 		printf("ATTEMPTS TO USE INVALID BENEŠ NETWORKS [antichaindata_isCanonical_1]: level %d\n", AD.cl);
// 		erri(-4);
// 	}
// #endif
		if (G.ngens > 0) {
			AD.GD.orb[0].data[0] = 0;
			for (i = 0; i < AD.k; i++) {
				AD.GD.orb[0].data[0] <<= bits;
				AD.GD.orb[0].data[0] |= (AD.O[i] & AD.cmc) >> AD.L.lev[AD.cl];
			}
			if (AD.GD.orb[0].data[0] != 0) {
				if (AD.SD[AD.cl + 1].SI != 0) {
					/* test minimality under implied stabiliser and extract implied stabiliser generators if minimal */
					byte[] p = permutation.create();
					long[] L = new long[] {AD.GD.orb[0].data[0]};
					permutation.perm_init(AD.L.n + AD.k, p);
					for (pmask = 1, i = AD.k; i-- != 0; ) {
						pmask = (pmask << bits) | 1;
					}
					antichainList_applySI_p1(AD.L.n, AD.k, AD.L.lev[AD.cl], bits, AD.SD[AD.cl + 1].bl, AD.GD, L, AD.SD[AD.cl + 1].SI, pmask, p);
					if (antichainList_cmp_p1(L[0], AD.GD.orb[0].data[0]) != 0) {
						/* determine the position up to which we can backtrack */
						int m, pi;
						long D;
						m = i = 0;
						D = L[0] ^ AD.GD.orb[0].data[0];
						do {
							pi = p[AD.L.n + i] - AD.L.n;
							if (pi > m) {
								m = pi;
							}
						} while ((D & M[i++]) == 0);
						AD.Fpos += m - AD.cp;
						AD.cp = m;
						if (VERBOSE) {
							permutation.perm_print(AD.L.n+AD.k, p, 0);
							System.out.printf("                                       NOT canonical --> %d\n", AD.cp);
						}
						return false;
					}
					S = antichain.antichaindata_ensureStabiliser(AD, AD.cl);
					AD.SD[AD.cl].ST = S.G;
					permgrp.permgrpc_init(S, AD.L.n + AD.k);
					AD.SD[AD.cl].SI = AD.SD[AD.cl + 1].SI;
					final int[] ugly = {AD.SD[AD.cl].SI};
					final int xcl = AD.cl;
					antichainList_extractStabiliser_p1(AD.L.n, AD.k, AD.L.lev[AD.cl], AD.L.lev[AD.cl + 1], AD.GD, S, ugly, L[0]);
					AD.SD[xcl].SI=ugly[0];
					/* now spin up the orbit of representatives under the action of the (old) implicit stabiliser */
					AD.GD.orbsize = 1;
					AD.GD.orb[0].gen = -1;
					permutation.perm_init(S.G.n, AD.GD.orb[0].toRoot);
//					hashtable_clear(AD.GD.orbpos);
//					hashtable_insert_1(AD.GD.orbpos, L, HASH_1(L), 0);
					AD.GD.orbpos.clear();
					AD.GD.orbpos.put(L[0], 0L);
					//	#ifndef HARDCODE_MAXN_22
					if (S.G.n > G.n) {
						for (gen = 0; gen < G.ngens; gen++) {
							permutation.perm_resize(G.n, S.G.n, G.perm[gen]);
							permutation.perm_resize(G.n, S.G.n, G.invperm[gen]);
						}
					}
					//	#endif
					for (pos = 0; pos < AD.GD.orbsize; pos++) {
						for (gen = 0; gen < G.ngens; gen++) {
							//int[]  p;
							if ((G.invol & BIT(gen)) != 0 && AD.GD.orb[pos].gen == gen) {
								continue;
							}
							/* apply generator gen to orbit element pos... */
							if (AD.GD.orbspace == AD.GD.orbsize) {
								Globals.globals_enlargen_orbitspace(AD.GD);
							}
							long[] A = new long[] {AD.GD.orb[pos].data[0]};
							Benes.benes_apply_p1(G.benes[AD.cl][gen], A);
							//#ifndef FILTER_GRADED
							if (AD.cl < AD.L.nLev - 2) {
								Benes.benes_apply_blocked_p1(G.benes[AD.L.nLev - 1][gen], A);
							}
							//#endif
							permutation.perm_init(S.G.n, p);
							antichainList_applySI_p1(AD.L.n, AD.k, AD.L.lev[AD.cl], bits, AD.SD[AD.cl + 1].bl, AD.GD, A, AD.SD[AD.cl + 1].SI, pmask, p);
							/* ...we're done if the result is smaller than the original element */
							if (antichainList_cmp_p1(L[0], A[0]) > 0) {
								/* determine the position up to which we can backtrack */
								int m, pi;
								long D;
								m = i = 0;
								D = L[0] ^ A[0];
								do {
									pi = AD.GD.orb[pos].toRoot[G.invperm[gen][p[AD.L.n + i]]] - AD.L.n;
									if (pi > m) {
										m = pi;
									}
								} while ((D & M[i++]) == 0);
								AD.Fpos += m - AD.cp;
								AD.cp = m;
								if (VERBOSE) {
									permutation.perm_print(S.G.n, p, 0);
									System.out.printf("                                       NOT canonical --> %d\n", AD.cp);
								}
								// #ifdef PRINTLARGEORBITS
								// 						if (AD.GD.orbsize > LARGEORBITTHRESHOLD) {
								// 							printf("antichaindata_isCanonical_p1: %lu [false]\n", AD.GD.orbsize);
								// 							lattice_print(AD.L);
								// 							antichaindata_printCounters(AD);
								// 						}
								// #endif
								return false;
							}
							/* ...otherwise, do the necessary housekeeping */
							AD.GD.orb[AD.GD.orbsize].data[0] = A[0];
							processElement_p1(AD, G, S, pos, gen, p);
						}
					}
					permgrpc_compactGenerators(S);
				} else {
					/* test minimality under implied stabiliser and extract implied stabiliser generators if minimal */
					byte[] p = permutation.create();
					long L;
					L = AD.GD.orb[0].data[0];
					permutation.perm_init(AD.L.n + AD.k, p);
					S = antichain.antichaindata_ensureStabiliser(AD, AD.cl);
					AD.SD[AD.cl].ST = S.G;
					permgrp.permgrpc_init(S, AD.L.n + AD.k);
					AD.SD[AD.cl].SI = 0;
					/* now spin up the orbit of representatives under the action of the (old) implicit stabiliser */
					AD.GD.orbsize = 1;
					AD.GD.orb[0].gen = -1;
					permutation.perm_init(S.G.n, AD.GD.orb[0].toRoot);
//					hashtable_clear(AD.GD.orbpos);
//					hashtable_insert_1(AD.GD.orbpos, L, HASH_1(L), 0);
					AD.GD.orbpos.clear();
					AD.GD.orbpos.put(L, 0L);
					//	#ifndef HARDCODE_MAXN_22
					if (S.G.n > G.n) {
						for (gen = 0; gen < G.ngens; gen++) {
							permutation.perm_resize(G.n, S.G.n, G.perm[gen]);
							permutation.perm_resize(G.n, S.G.n, G.invperm[gen]);
						}
					}
					//	#endif
					for (pos = 0; pos < AD.GD.orbsize; pos++) {
						for (gen = 0; gen < G.ngens; gen++) {
							//int[]  p;
							if ((G.invol & BIT(gen)) != 0 && AD.GD.orb[pos].gen == gen) {
								continue;
							}
							/* apply generator gen to orbit element pos... */
							if (AD.GD.orbspace == AD.GD.orbsize) {
								Globals.globals_enlargen_orbitspace(AD.GD);
							}
							long[] A = new long[] {AD.GD.orb[pos].data[0]};
							Benes.benes_apply_p1(G.benes[AD.cl][gen], A);
							//#ifndef FILTER_GRADED
							if (AD.cl < AD.L.nLev - 2) {
								Benes.benes_apply_blocked_p1(G.benes[AD.L.nLev - 1][gen], A);
							}
							//#endif
							permutation.perm_init(S.G.n, p);
							antichainList_sort_p1(AD.k, bits, M, AD.SD[AD.cl + 1].bl, A, p, AD.L.n);
							/* ...we're done if the result is smaller than the original element */
							if (antichainList_cmp_p1(L, A[0]) > 0) {
								/* determine the position up to which we can backtrack */
								int m, pi;
								long D;
								m = i = 0;
								D = L ^ A[0];
								do {
									pi = AD.GD.orb[pos].toRoot[G.invperm[gen][p[AD.L.n + i]]] - AD.L.n;
									if (pi > m) {
										m = pi;
									}
								} while ((D & M[i++]) == 0);
								AD.Fpos += m - AD.cp;
								AD.cp = m;
								if (VERBOSE) {
									permutation.perm_print(S.G.n, p, 0);
									System.out.printf("                                       NOT canonical --> %d\n", AD.cp);
								}
								// #ifdef PRINTLARGEORBITS
								// 						if (AD.GD.orbsize > LARGEORBITTHRESHOLD) {
								// 							printf("antichaindata_isCanonical_p1: %lu [false]\n", AD.GD.orbsize);
								// 							lattice_print(AD.L);
								// 							antichaindata_printCounters(AD);
								// 						}
								// #endif
								return false;
							}
							/* ...otherwise, do the necessary housekeeping */
							AD.GD.orb[AD.GD.orbsize].data[0] = A[0];
							processElement_p1(AD, G, S, pos, gen, p);
						}
					}
					permgrpc_compactGenerators(S);
				}
			} else { /* as the antichains must intersect the lowest level, AD.cl < AD.L.nLev-2 */
				AD.SD[AD.cl].ST = AD.SD[AD.cl + 1].ST;
				AD.SD[AD.cl].SI = AD.SD[AD.cl + 1].SI;
			}
		} else if (AD.SD[AD.cl + 1].SI != 0) {
			AD.GD.orb[0].data[0] = 0;
			for (i = 0; i < AD.k; i++) {
				AD.GD.orb[0].data[0] <<= bits;
				AD.GD.orb[0].data[0] |= (AD.O[i] & AD.cmc) >> AD.L.lev[AD.cl];
			}
			if (AD.GD.orb[0].data[0] != 0) {
				/* test minimality under implied stabiliser and extract implied stabiliser generators if minimal */
				byte[] p = permutation.create();
				long[] L = new long[] {AD.GD.orb[0].data[0]};
				permutation.perm_init(AD.L.n + AD.k, p);
				for (pmask = 1, i = AD.k; i-- != 0; ) {
					pmask = (pmask << bits) | 1;
				}
				antichainList_applySI_p1(AD.L.n, AD.k, AD.L.lev[AD.cl], bits, AD.SD[AD.cl + 1].bl, AD.GD, L, AD.SD[AD.cl + 1].SI, pmask, p);
				if (antichainList_cmp_p1(L[0], AD.GD.orb[0].data[0]) != 0) {
					/* determine the position up to which we can backtrack */
					int m, pi;
					long D;
					m = i = 0;
					D = L[0] ^ AD.GD.orb[0].data[0];
					do {
						pi = p[AD.L.n + i] - AD.L.n;
						if (pi > m) {
							m = pi;
						}
					} while ((D & M[i++]) == 0);
					AD.Fpos += m - AD.cp;
					AD.cp = m;
					if (VERBOSE) {
						permutation.perm_print(AD.L.n+AD.k, p, 0);
						System.out.printf("                                       NOT canonical --> %d\n", AD.cp);
					}
					return false;
				}
				S = antichain.antichaindata_ensureStabiliser(AD, AD.cl);
				AD.SD[AD.cl].ST = S.G;
				permgrp.permgrpc_init(S, AD.L.n + AD.k);
				AD.SD[AD.cl].SI = AD.SD[AD.cl + 1].SI;
				final int[] ugly = new int[] {AD.SD[AD.cl].SI};
				final int xcl = AD.cl;
				antichainList_extractStabiliser_p1(AD.L.n, AD.k, AD.L.lev[AD.cl], AD.L.lev[AD.cl + 1], AD.GD, S, ugly, L[0]);
				AD.SD[xcl].SI = ugly[0];
				permgrpc_compactGenerators(S);
			} else { /* as the antichains must intersect the lowest level, AD.cl < AD.L.nLev-2 */
				AD.SD[AD.cl].ST = AD.SD[AD.cl + 1].ST;
				AD.SD[AD.cl].SI = AD.SD[AD.cl + 1].SI;
			}
		} else {
			//#ifndef FILTER_GRADED
			if (AD.cl == AD.L.nLev - 2) {
				//#endif
				S = antichain.antichaindata_ensureStabiliser(AD, AD.cl);
				AD.SD[AD.cl].ST = S.G;
				permgrp.permgrpc_init(S, AD.L.n + AD.k);
				//#ifndef FILTER_GRADED
			} else {
				AD.SD[AD.cl].ST = AD.SD[AD.cl + 1].ST;
			}
			//#endif
			AD.SD[AD.cl].SI = AD.SD[AD.cl + 1].SI;
		}
//#ifndef FILTER_GRADED
		if (AD.cl == 0) {
//#endif
			final int[] ugly = new int[] {AD.SD[0].bl}; // todo yuck
			antichain.antichaindata_updateBlocks(AD, AD.SD[1].bl, ugly);
			AD.SD[0].bl = ugly[0];
			AD.SD[0].SI |= AD.SD[0].bl << AD.L.n;
//#ifndef FILTER_GRADED
		}
//#endif
		permgrp_preprocessGenerators_blocked(AD);
		if (VERBOSE) {
			System.out.printf("***** level %d:\n", AD.cl);
			permgrp.permgrp_printGenerators(AD.SD[AD.cl].ST, 0);
			System.out.println("                                       canonical");
		}
// #ifdef PRINTLARGEORBITS
// 	if (AD.GD.orbsize > LARGEORBITTHRESHOLD) {
// 		printf("antichaindata_isCanonical_p1: %lu [true]\n", AD.GD.orbsize);
// 		lattice_print(AD.L);
// 		antichaindata_printCounters(AD);
// 	}
// #endif
		return true;
	}


//	/*
//	 * Whether the antichain data given by AD may yield a canonical antichain list.  Special case of a list
//	 * that, if packed, fits into (and requires) two long.
//	 *
//	 * An antichain list is canonical if and only if, as a multiset, it is minimal in its orbit under the
//	 * stabiliser of the (full) old lattice.  As this stabiliser acts on each level, a violation of minimality
//	 * on any level precludes any completion of the antichain data on higher levels being canonical.
//	 *
//	 * The function checks whether the multiset of sets chosen on the current level (AD.O[...] & AD.cmc) is
//	 * minimal under the action of the current stabiliser (AD.SD[AD.cl+1].ST and AD.SD[AD.cl+1].SI).  If yes,
//	 * and if the antichain data is not complete (that is, AD.cl > 0]), then the new stabiliser is stored in
//	 * AD.SD[AD.cl].ST and AD.SD[AD.cl].SI.  If the antichain data is complete and canonical, AD.SD[0].ST and
//	 * AD.SD[0].SI will instead be set to the stabiliser of the new lattice obtained from the antichain data.
//	 * (The points on the lowest (new) level of the new lattice correspond to the antichains in that sequence;
//	 * if a permutation fixes the multiset but permutes its elements, the points of the lowest level of the
//	 * new lattice need to be permuted accordingly to obtain an element of the stabiliser of the new lattice.
//	 * Additional generators of the stabiliser of the new lattice are given by all possible permutations of
//	 * identical antichains, i.e., all possible permutations of points of the lowest level of the new lattice
//	 * that have identical covering sets.  The latter may be handled by "implicit" stabilisers.)
//	 */
//	static boolean antichaindata_isCanonical_p2(antichaindata AD, int bits) {
//		int i, gen, apf;
//		int pos;
//		//long[]       M0;
//		long[] M1 = new long[Constants.MAXN - 2];
//		long mask, pmask;
//		permgrp G;
//		permgrpc S;
//
//// #if defined TEST_P2_16 || defined TEST_P2_32
//// 	static long hitcount = 0;
//// 	printf("antichaindata_isCanonical_p2 hitcount: %lu\n", ++hitcount);
//// #endif
//// #ifdef VERBOSE
//// 	printf("[entering antichaindata_isCanonical_p2]:\n"); lattice_print(AD.L); antichaindata_printCounters(AD);
//// #endif
//		apf = Long.SIZE / bits;
//		for (mask = BIT(bits) - 1, i = apf; i-- != 0; mask <<= bits)
//			M1[i] = mask;
//		//M0 = M1 + 2*apf-AD.k;
//		int offset = 2 * apf - AD.k;
//		G = AD.SD[AD.cl + 1].ST;
//// #ifdef DOTEST
//// 	if (G.ngens && !(G.BenesValid & BIT(AD.cl))) {
//// 		printf("ATTEMPTS TO USE INVALID BENEŠ NETWORKS [antichaindata_isCanonical_1]: level %d\n", AD.cl);
//// 		erri(-4);
//// 	}
//// #endif
//		if (G.ngens > 0) {
//			AD.GD.orb[0].data[0] = AD.GD.orb[0].data[1] = 0;
//			for (i = 0; i < AD.k - apf; i++) {
//				AD.GD.orb[0].data[0] <<= bits;
//				AD.GD.orb[0].data[0] |= (AD.O[i] & AD.cmc) >> AD.L.lev[AD.cl];
//			}
//			for (; i < AD.k; i++) {
//				AD.GD.orb[0].data[1] <<= bits;
//				AD.GD.orb[0].data[1] |= (AD.O[i] & AD.cmc) >> AD.L.lev[AD.cl];
//			}
//			if (AD.GD.orb[0].data[0] != 0 || AD.GD.orb[0].data[1] != 0) {
//				if (AD.SD[AD.cl + 1].SI != 0) {
//					/* test minimality under implied stabiliser and extract implied stabiliser generators if minimal */
//					int[] p;
//					long[] L = new long[2];
//					L[0] = AD.GD.orb[0].data[0];
//					L[1] = AD.GD.orb[0].data[1];
//					permutation.perm_init(AD.L.n + AD.k, p);
//					for (pmask = 1, i = apf; i-- != 0; )
//						pmask = (pmask << bits) | 1;
//					antichainList_applySI_p2(AD.L.n, AD.k, apf, AD.L.lev[AD.cl], bits, AD.SD[AD.cl + 1].bl, AD.GD, L,
//						AD.SD[AD.cl + 1].SI, pmask, p);
//					if (antichainList_cmp_p2(L, AD.GD.orb[0].data) != 0) {
//						/* determine the position up to which we can backtrack */
//						int m, pi;
//						long D;
//						boolean found;
//						m = i = 0;
//						D = L[0] ^ AD.GD.orb[0].data[0];
//						do {
//							pi = p[AD.L.n + i] - AD.L.n;
//							if (pi > m)
//								m = pi;
//						} while (!((found = (D & M1[offset + i]) != 0)) && (++i < AD.k - apf));
//						if (!found) {
//							D = L[1] ^ AD.GD.orb[0].data[1];
//							do {
//								pi = p[AD.L.n + i] - AD.L.n;
//								if (pi > m)
//									m = pi;
//							} while ((D & M1[(i++) - (AD.k - apf)]) == 0);
//						}
//						AD.Fpos += m - AD.cp;
//						AD.cp = m;
//// #ifdef VERBOSE
//// 					perm_print(AD.L.n+AD.k, p, 0);
//// 					printf("                                       NOT canonical --> %d\n", AD.cp);
//// #endif
//						return false;
//					}
//					S = antichain.antichaindata_ensureStabiliser(AD, AD.cl);
//					AD.SD[AD.cl].ST = S.G;
//					permgrp.permgrpc_init(S, AD.L.n + AD.k);
//					AD.SD[AD.cl].SI = AD.SD[AD.cl + 1].SI;
//					final int[] ugly = new int[] {AD.SD[AD.cl].SI};
//					antichainList_extractStabiliser_p2(AD.L.n, AD.k, AD.L.lev[AD.cl], AD.L.lev[AD.cl + 1], AD.GD, S, ugly, L);
//					AD.SD[AD.cl].SI = ugly[0];
//					/* now spin up the orbit of representatives under the action of the (old) implicit stabiliser */
//					AD.GD.orbsize = 1;
//					AD.GD.orb[0].gen = -1;
//					permutation.perm_init(S.G.n, AD.GD.orb[0].toRoot);
//					hashtable_clear(AD.GD.orbpos);
//					hashtable_insert_2(AD.GD.orbpos, L, HASH_2(L), 0);
//					//#ifndef HARDCODE_MAXN_22
//					if (S.G.n > G.n)
//						for (gen = 0; gen < G.ngens; gen++) {
//							permutation.perm_resize(G.n, S.G.n, G.perm[gen]);
//							permutation.perm_resize(G.n, S.G.n, G.invperm[gen]);
//						}
//					//#endif
//					for (pos = 0; pos < AD.GD.orbsize; pos++) {
//						for (gen = 0; gen < G.ngens; gen++) {
//							long[] A = new long[2];
//							//int[]  p;
//							if ((G.invol & BIT(gen)) != 0 && AD.GD.orb[pos].gen == gen)
//								continue;
//							/* apply generator gen to orbit element pos... */
//							if (AD.GD.orbspace == AD.GD.orbsize)
//								Globals.globals_enlargen_orbitspace(AD.GD);
//							A[0] = L[0];
//							A[1] = L[1];
//							Benes.benes_apply_p2(G.benes[AD.cl][gen], A);
//							//#ifndef FILTER_GRADED
//							if (AD.cl < AD.L.nLev - 2)
//								Benes.benes_apply_blocked_p2(G.benes[AD.L.nLev - 1][gen], A, apf * bits);
//							//#endif
//							permutation.perm_init(S.G.n, p);
//							antichainList_applySI_p2(AD.L.n, AD.k, apf, AD.L.lev[AD.cl], bits, AD.SD[AD.cl + 1].bl, AD.GD, A,
//								AD.SD[AD.cl + 1].SI, pmask, p);
//							/* ...we're done if the result is smaller than the original element */
//							if (antichainList_cmp_p2(L, A) > 0) {
//								/* determine the position up to which we can backtrack */
//								int m, pi;
//								long D;
//								boolean found;
//								m = i = 0;
//								D = L[0] ^ A[0];
//								do {
//									pi = AD.GD.orb[pos].toRoot[G.invperm[gen][p[AD.L.n + i]]] - AD.L.n;
//									if (pi > m)
//										m = pi;
//								} while (!((found = (D & M1[offset + i]) != 0)) && (++i < AD.k - apf));
//								if (!found) {
//									D = L[1] ^ A[1];
//									do {
//										pi = AD.GD.orb[pos].toRoot[G.invperm[gen][p[AD.L.n + i]]] - AD.L.n;
//										if (pi > m)
//											m = pi;
//									} while ((D & M1[(i++) - (AD.k - apf)]) == 0);
//								}
//								AD.Fpos += m - AD.cp;
//								AD.cp = m;
//// #ifdef VERBOSE
//// 							printf("                                       NOT canonical\n");
//// #endif
//// #ifdef PRINTLARGEORBITS
//// 							if (AD.GD.orbsize > LARGEORBITTHRESHOLD) {
//// 								printf("antichaindata_isCanonical_p2: %lu [false]\n", AD.GD.orbsize);
//// 								lattice_print(AD.L);
//// 								antichaindata_printCounters(AD);
//// 							}
//// #endif
//								return false;
//							}
//							/* ...otherwise, do the necessary housekeeping */
//							AD.GD.orb[AD.GD.orbsize].data[0] = A[0];
//							AD.GD.orb[AD.GD.orbsize].data[1] = A[1];
//							processElement_p2(AD, G, S, pos, gen, p);
//						}
//					}
//					permgrpc_compactGenerators(S);
//				} else {
//					/* test minimality under implied stabiliser and extract implied stabiliser generators if minimal */
//					int[] p;
//					long[] L = new long[2];
//					L[0] = AD.GD.orb[0].data[0];
//					L[1] = AD.GD.orb[0].data[1];
//					permutation.perm_init(AD.L.n + AD.k, p);
//
//					S = antichain.antichaindata_ensureStabiliser(AD, AD.cl);
//					AD.SD[AD.cl].ST = S.G;
//					permgrp.permgrpc_init(S, AD.L.n + AD.k);
//					AD.SD[AD.cl].SI = 0;
//					/* now spin up the orbit of representatives under the action of the (old) implicit stabiliser */
//					AD.GD.orbsize = 1;
//					AD.GD.orb[0].gen = -1;
//					permutation.perm_init(S.G.n, AD.GD.orb[0].toRoot);
//					hashtable_clear(AD.GD.orbpos);
//					hashtable_insert_2(AD.GD.orbpos, L, HASH_2(L), 0);
//					//#ifndef HARDCODE_MAXN_22
//					if (S.G.n > G.n)
//						for (gen = 0; gen < G.ngens; gen++) {
//							permutation.perm_resize(G.n, S.G.n, G.perm[gen]);
//							permutation.perm_resize(G.n, S.G.n, G.invperm[gen]);
//						}
//					//#endif
//					for (pos = 0; pos < AD.GD.orbsize; pos++) {
//						for (gen = 0; gen < G.ngens; gen++) {
//							long[] A = new long[2];
//							//int[]  p;
//							if ((G.invol & BIT(gen)) != 0 && AD.GD.orb[pos].gen == gen)
//								continue;
//							/* apply generator gen to orbit element pos... */
//							if (AD.GD.orbspace == AD.GD.orbsize)
//								Globals.globals_enlargen_orbitspace(AD.GD);
//							A[0] = L[0];
//							A[1] = L[1];
//							Benes.benes_apply_p2(G.benes[AD.cl][gen], A);
//							//#ifndef FILTER_GRADED
//							if (AD.cl < AD.L.nLev - 2)
//								Benes.benes_apply_blocked_p2(G.benes[AD.L.nLev - 1][gen], A, apf * bits);
//							//#endif
//							permutation.perm_init(S.G.n, p);
//							// todo todo M0 below should by &M1[offset]
//							antichainList_sort_p2(AD.k, bits, AD.k - apf, M0, M1, AD.SD[AD.cl + 1].bl, A, p, AD.L.n);
//							/* ...we're done if the result is smaller than the original element */
//							if (antichainList_cmp_p2(L, A) > 0) {
//								/* determine the position up to which we can backtrack */
//								int m, pi;
//								long D;
//								boolean found;
//								m = i = 0;
//								D = L[0] ^ A[0];
//								do {
//									pi = AD.GD.orb[pos].toRoot[G.invperm[gen][p[AD.L.n + i]]] - AD.L.n;
//									if (pi > m)
//										m = pi;
//								} while (!((found = (D & M1[offset + i]) != 0)) && (++i < AD.k - apf));
//								if (!found) {
//									D = L[1] ^ A[1];
//									do {
//										pi = AD.GD.orb[pos].toRoot[G.invperm[gen][p[AD.L.n + i]]] - AD.L.n;
//										if (pi > m)
//											m = pi;
//									} while ((D & M1[(i++) - (AD.k - apf)]) == 0);
//								}
//								AD.Fpos += m - AD.cp;
//								AD.cp = m;
//// #ifdef VERBOSE
//// 							printf("                                       NOT canonical\n");
//// #endif
//// #ifdef PRINTLARGEORBITS
//// 							if (AD.GD.orbsize > LARGEORBITTHRESHOLD) {
//// 								printf("antichaindata_isCanonical_p2: %lu [false]\n", AD.GD.orbsize);
//// 								lattice_print(AD.L);
//// 								antichaindata_printCounters(AD);
//// 							}
//// #endif
//								return false;
//							}
//							/* ...otherwise, do the necessary housekeeping */
//							AD.GD.orb[AD.GD.orbsize].data[0] = A[0];
//							AD.GD.orb[AD.GD.orbsize].data[1] = A[1];
//							processElement_p2(AD, G, S, pos, gen, p);
//						}
//					}
//					permgrpc_compactGenerators(S);
//				}
//			} else { /* as the antichains must intersect the lowest level, AD.cl < AD.L.nLev-2 */
//				AD.SD[AD.cl].ST = AD.SD[AD.cl + 1].ST;
//				AD.SD[AD.cl].SI = AD.SD[AD.cl + 1].SI;
//			}
//		} else if (AD.SD[AD.cl + 1].SI != 0) {
//			AD.GD.orb[0].data[0] = AD.GD.orb[0].data[1] = 0;
//			apf = Long.SIZE / bits;
//			for (i = 0; i < AD.k - apf; i++) {
//				AD.GD.orb[0].data[0] <<= bits;
//				AD.GD.orb[0].data[0] |= (AD.O[i] & AD.cmc) >> AD.L.lev[AD.cl];
//			}
//			for (; i < AD.k; i++) {
//				AD.GD.orb[0].data[1] <<= bits;
//				AD.GD.orb[0].data[1] |= (AD.O[i] & AD.cmc) >> AD.L.lev[AD.cl];
//			}
//			if (AD.GD.orb[0].data[0] != 0 || AD.GD.orb[0].data[1] != 0) {
//				/* test minimality under implied stabiliser and extract implied stabiliser generators if minimal */
//				int[] p;
//				long[] L = new long[2];
//				L[0] = AD.GD.orb[0].data[0];
//				L[1] = AD.GD.orb[0].data[1];
//				permutation.perm_init(AD.L.n + AD.k, p);
//				for (pmask = 1, i = apf; i-- != 0; )
//					pmask = (pmask << bits) | 1;
//				antichainList_applySI_p2(AD.L.n, AD.k, apf, AD.L.lev[AD.cl], bits, AD.SD[AD.cl + 1].bl, AD.GD, L,
//					AD.SD[AD.cl + 1].SI, pmask, p);
//				if (antichainList_cmp_p2(L, AD.GD.orb[0].data) != 0) {
//					/* determine the position up to which we can backtrack */
//					int m, pi;
//					long D;
//					boolean found;
//					m = i = 0;
//					D = L[0] ^ AD.GD.orb[0].data[0];
//					do {
//						pi = p[AD.L.n + i] - AD.L.n;
//						if (pi > m)
//							m = pi;
//					} while (!((found = (D & M1[offset + i]) != 0)) && (++i < AD.k - apf));
//					if (!found) {
//						D = L[1] ^ AD.GD.orb[0].data[1];
//						do {
//							pi = p[AD.L.n + i] - AD.L.n;
//							if (pi > m)
//								m = pi;
//						} while ((D & M1[(i++) - (AD.k - apf)]) == 0);
//					}
//					AD.Fpos += m - AD.cp;
//					AD.cp = m;
//// #ifdef VERBOSE
//// 				perm_print(AD.L.n+AD.k, p, 0);
//// 				printf("                                       NOT canonical --> %d\n", AD.cp);
//// #endif
//					return false;
//				}
//				S = antichain.antichaindata_ensureStabiliser(AD, AD.cl);
//				AD.SD[AD.cl].ST = S.G;
//				permgrp.permgrpc_init(S, AD.L.n + AD.k);
//				AD.SD[AD.cl].SI = AD.SD[AD.cl + 1].SI;
//				antichainList_extractStabiliser_p2(AD.L.n, AD.k, AD.L.lev[AD.cl], AD.L.lev[AD.cl + 1], AD.GD,
//					S, & (AD.SD[AD.cl].SI), L);
//				permgrpc_compactGenerators(S);
//			} else { /* as the antichains must intersect the lowest level, AD.cl < AD.L.nLev-2 */
//				AD.SD[AD.cl].ST = AD.SD[AD.cl + 1].ST;
//				AD.SD[AD.cl].SI = AD.SD[AD.cl + 1].SI;
//			}
//		} else {
//			//#ifndef FILTER_GRADED
//			if (AD.cl == AD.L.nLev - 2) {
//				//#endif
//				S = antichain.antichaindata_ensureStabiliser(AD, AD.cl);
//				AD.SD[AD.cl].ST = S.G;
//				permgrp.permgrpc_init(S, AD.L.n + AD.k);
//				//#ifndef FILTER_GRADED
//			} else {
//				AD.SD[AD.cl].ST = AD.SD[AD.cl + 1].ST;
//			}
//			//#endif
//			AD.SD[AD.cl].SI = AD.SD[AD.cl + 1].SI;
//		}
////#ifndef FILTER_GRADED
//		if (AD.cl == 0) {
////#endif
//			final int[] ugly = new int[] {AD.SD[0].bl};
//			antichain.antichaindata_updateBlocks(AD, AD.SD[1].bl, ugly);
//			AD.SD[0].bl = ugly[0];
//			AD.SD[0].SI |= AD.SD[0].bl << AD.L.n;
////#ifndef FILTER_GRADED
//		}
////#endif
//		permgrp_preprocessGenerators_blocked(AD);
//// #ifdef VERBOSE
//// 	printf("***** level %d:\n", AD.cl);
//// 	permgrp_printGenerators(AD.SD[AD.cl].ST, 0);
//// 	printf("                                       canonical\n");
//// #endif
//// #ifdef PRINTLARGEORBITS
//// 	if (AD.GD.orbsize > LARGEORBITTHRESHOLD) {
//// 		printf("antichaindata_isCanonical_p2: %lu [false]\n", AD.GD.orbsize);
//// 		lattice_print(AD.L);
//// 		antichaindata_printCounters(AD);
//// 	}
//// #endif
//		return true;
//	}
}
