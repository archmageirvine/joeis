package gebhardt;

public abstract class lattEnum {
	/*
	 * lattEnum.c
	 *
	 * Created on: 22 Mar 2014
	 * Last modified: 23 Feb 2019
	 * Author: Volker Gebhardt, v.gebhardt@westernsydney.edu.au
	 *
	 *   Copyright (C) 2015-2019 by Volker Gebhardt
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

// #include "lattEnum.h"
// #include "antichain.h"

	/*
	 * "The C99 standard permits you to cast any struct pointer to a pointer to its first member, and the other
	 *  way (6.7.2.1 Structure and union specifiers):
	 *     13 Within a structure object, the non-bit-field members and the units in which bit-fields reside have
	 *     addresses that increase in the order in which they are declared. A pointer to a structure object, suitably
	 *     converted, points to its initial member (or if that member is a bit-field, then to the unit in which it
	 *     resides), and vice versa. There may be unnamed padding within a structure object, but not at its beginning.
	 */
//typedef struct lattEnum lattEnum;
//typedef lattEnum lattEnum_Count;
//struct lattEnum {
	private static final boolean VERBOSE = "true".equals(System.getProperty("oeis.verbose"));

	abstract void reg(lattEnum E, lattice L);  /* function called for registering lattices */

	Globals GD;                /* "global" data for process/thread         */
	lattice L;                 /* lattice whose descendants we enumerate   */
	long count;             /* number of lattices found                 */
	int N;                 /* target size                              */
	int Nmin;              /* minimum size for recursion               */
// #ifdef COUNT_MAXIMAL_CHAINS
//     unsigned int        max_mc;
// #endif
// };

	static class lattEnum_Count extends lattEnum {
		/*
		 * Register the lattice L.
		 */
		void reg(lattEnum E, lattice L) {
			if (L.n == E.N) {
// #ifdef FILTER_GARSIDE
// 		if (!possiblyGarside(L))
// 			return;
// #endif
				E.count++;
// #ifdef COUNT_MAXIMAL_CHAINS
// 		unsigned int mc = lattice_numberOfMaximalChains(L);
// 		lattEnum_Count* EE = (lattEnum_Count*)E;
// 		if (mc > EE.max_mc)
// 			EE.max_mc = mc;
// #endif
			}
		}
	}


	//typedef struct lattEnum_stdout lattEnum_stdout;
	static class lattEnum_stdout extends lattEnum {
//	void reg(lattEnum E, lattice L);  /* function called for registering lattices */
//	Globals            GD;                /* "global" data for process/thread         */
//	lattice            L;                 /* lattice whose descendants we enumerate   */
//	long  count;             /* number of lattices found                 */
//	int                 N;                 /* target size                              */
//	int                 Nmin;              /* minimum size for recursion               */
//// #ifdef THREADED
//// 	char*               output;            /* output buffer                            */
//// 	int                 outpos;            /* write position in output buffer          */
//// 	int                 outsize;           /* current size of output buffer            */
//// #endif
/*
 * Register the lattice L.
 */
void reg(lattEnum E, lattice L) {
	boolean valid;

// #ifdef FILTER_GARSIDE
// 	valid = L.n == E.N && possiblyGarside(L);
// #else
	valid = L.n == E.N;
	//#endif
	if (valid) {
		E.count++;
		//#ifndef THREADED
		//char[] buffer = new char[ (Constants.MAXN * (Constants.MAXN - 1)) / 2 + 1];

		System.out.println(lattice.lattice_toString(L));
// #else
//     	lattEnum_stdout* EE = (lattEnum_stdout*)E;

// #if 0
//     	if (EE.outpos+(L.n+2)*(L.n+1)/2+2 >= EE.outsize) {
// 			EE.outsize *= 2;
// 			EE.output = (char*)realloc(EE.output, EE.outsize);
// 		}
// #else
//     	if (EE.outpos+(L.n+2)*(L.n+1)/2+2 >= EE.outsize)
//     		lattEnum_stdout_flush(EE);
// #endif
//     	lattice_toString(EE.output+EE.outpos, L);
//     	EE.outpos += (L.n+2)*(L.n+1)/2;
//     	*(EE.output+(EE.outpos++)) = '\n';
// #endif
	}
}
	}


	/*
	 * Return the number of registered lattices.
	 */
	public static long lattEnum_getLatticeCount(lattEnum E) {
		return E.count;
	}


	/*
	 * Do the enumeration.
	 */
	public static void lattEnum_doEnumeration(lattEnum E) {
		E.reg(E, E.L);
// #if defined(FILTER_INDECOMPOSABLE) && defined(FILTER_GRADED)
// 	if (E.L.n < E.N-1) {
// 		if (E.L.n)
// 			lattEnum_growLattice(E, E.N, E.L, (E.Nmin)-(E.L.n)>1 ? (E.Nmin)-(E.L.n) : 2);
// 		else
// 			lattEnum_growLattice_2(E, E.N, E.L, (E.Nmin)-(E.L.n)>1 ? (E.Nmin)-(E.L.n) : 2);
// 	}
// #else
		if (E.L.n < E.N) {
			if (E.L.n != 0) {
				lattEnum_growLattice(E, E.N, E.L, (E.Nmin) - (E.L.n));
			} else {
				lattEnum_growLattice_2(E, E.N, E.L, (E.Nmin) - (E.L.n));
			}
		}
		//#endif
	}

// #ifdef FILTER_GARSIDE
// #include "garside.h"
// #endif

// #ifdef THREADED
// #include <pthread.h>
// pthread_mutex_t  mutex_out = PTHREAD_MUTEX_INITIALIZER;
// #endif


	/*
	 * Return a structure for counting the descendants of *L of size equal to N, for which all intermediate lattices
	 * have size at most Nmin.
	 */
	public static lattEnum lattEnum_Count_create(lattice L, int N, int Nmin, Globals GD) {
		lattEnum_Count E;

		if (L != null && (N - 2 < L.n || Nmin - 2 < L.n)) {
			throw new RuntimeException("BAD PARAMETERS in lattEnum_Count_create: given lattice larger than target/intermediate size!");
		}
		E = new lattEnum_Count();
		E.L = L;
		E.N = N - 2;
		E.Nmin = Nmin - 2;
		E.count = 0;
		E.GD = GD;
		//E.reg = lattEnum_Count_register; // sai done in subclass
// #ifdef COUNT_MAXIMAL_CHAINS
//     E.max_mc = 0;
// #endif
		return E;
	}


	/*
	 * Return a structure for writing string representations of the descendants of *L of size N to stdout, for
	 * which all intermediate lattices have size at most Nmin..
	 */
	lattEnum lattEnum_stdout_create(lattice L, int N, int Nmin, Globals GD) {
		lattEnum_stdout E;

		if (L != null && (N - 2 < L.n || Nmin - 2 < L.n)) {
			throw new RuntimeException("BAD PARAMETERS in lattEnum_stdout_create: given lattice larger than target/intermediate size!");
		}
		E = new lattEnum_stdout();
		E.L = L;
		E.N = N - 2;
		E.Nmin = Nmin - 2;
		E.count = 0;
		E.GD = GD;
		//E.reg = lattEnum_stdout_register; // sai note done in subclass now
// #ifdef THREADED
// 	E.output = (char*)malloc(THREADED_OUTPUT_BUFFER_SIZE);
// 	*(E.output) = 0;
// 	E.outpos = 0;
// 	E.outsize = THREADED_OUTPUT_BUFFER_SIZE;
// #endif
		return E;
	}


	/*
	 * Flush the output buffer.
	 */
	void lattEnum_stdout_flush(lattEnum_stdout E) {
// #ifdef THREADED
// 	*(E.output+E.outpos) = 0;
// 	pthread_mutex_lock(&mutex_out);
// 	printf("%s", E.output);
// 	pthread_mutex_unlock(&mutex_out);
// 	E.outpos = 0;
// #endif
	}





	/*
	 * Free all memory (and print the maximal number of maximal chains if enabled).
	 */
	void lattEnum_Count_free(lattEnum E) {
// #ifdef COUNT_MAXIMAL_CHAINS
// 	lattEnum_Count* EE = (lattEnum_Count*)E;
// 	printf("at most %u maximal chains\n", EE.max_mc);
// #endif
// 	free((lattEnum_Count*)E);
	}


	/*
	 * Free all memory (and flush buffer).
	 */
	void lattEnum_stdout_free(lattEnum E) {
		lattEnum_stdout EE = (lattEnum_stdout) E;
// #ifdef THREADED
// 	lattEnum_stdout_flush(EE);
// 	free(EE.output);
// #endif
// 	free(EE);
	}


	/*
	 * Construct canonical lattices with N elements by recursively adding new levels to the canonical lattice L,
	 * where the first added level contains at least nmin elements.  For every canonical lattice found during
	 * this process (also for those with fewer than N elements), the function *reg is called.
	 */
	static void lattEnum_growLattice(lattEnum E, int N, lattice L, int nmin) {
		lattice LA = new lattice();
		Antichain AD = new Antichain();
		int k;

// #ifdef DOTEST
// 	if (!L.n) {
// 		printf("BAD CALL [lattEnum_growLattice]: argument is the lattice with 2 elements!\n");
// 		lattice_print(L);
// 	}
// #endif

		if (VERBOSE) {
			System.out.printf("\n[>>> entering lattEnum_growLattice]: %d\n", nmin);
			lattice.lattice_print(L);
		}
		Antichain.antichaindata_init(L, nmin, AD, E.GD);

		Antichain.antichaindata_prepareLattice(AD, L, LA);
		if (nmin == 1) {
			if (VERBOSE) {
				System.out.printf("\n=== adding a level with %d elements\n", 1);
			}
// #if defined(DOTEST) && defined(FILTER_INDECOMPOSABLE) && defined(FILTER_GRADED)
// 		printf("BAD CALL [lattEnum_growLattice]: asked for a graded indecomposable lattice with a level of size 1!\n");
// #endif
			while (Antichain.antichaindata_next_1(AD)) {
				if (VERBOSE) {
					System.out.println("SAI: while-an1 " + AD.mStabilisers[0].mSt.mN);
				}
				Antichain.antichaindata_generateLattice_1(AD, L, LA);
// #ifdef DOTEST
// 			if (!antichaindata_test(&AD)) {
// 				printf("BAD LATTICE-ANTICHAIN DATA\n");
// 				printf("\n### lattice:\n"); lattice_print(L);
// 				printf("+++ antichain data: "); antichaindata_printAntichains(&AD);
// 				printf(">>> lattice:\n"); lattice_print(&LA);
// 				erri(-4);
// 			}
// 			if (!lattice_test(&LA)) {
// 				printf("INCONSISTENT LATTICE!\n");
// 				printf("\n### lattice:\n"); lattice_print(L);
// 				printf("+++ antichain data: "); antichaindata_printAntichains(&AD);
// 				printf(">>> lattice:\n"); lattice_print(&LA);
// 				erri(-4);
// 			}
// 			if (!lattice_isCanonical(&LA)) {
// 				printf("NON-CANONICAL LATTICE!\n");
// 				printf("\n### lattice:\n"); lattice_print(L);
// 				printf("+++ antichain data: "); antichaindata_printAntichains(&AD);
// 				printf(">>> lattice:\n"); lattice_print(&LA);
// 				erri(-4);
// 			}
// #endif
				if (VERBOSE) {
					System.out.println("\n### lattice:");
					lattice.lattice_print(L);
					System.out.print("+++ antichain data: ");
					Antichain.antichaindata_printAntichains(AD);
					System.out.println(">>> lattice:");
					lattice.lattice_print(LA);
				}
// #ifdef FILTER_INDECOMPOSABLE
// 			if (LA.up[L.n] != BIT(LA.n)-1) {
// 				(*(E.reg))(E, &LA);
// #ifdef FILTER_GRADED
// 				if (LA.n < N-1)
// 					lattEnum_growLattice(E, N, &LA, 2);
// #else
// 				if (LA.n < N)
// 					lattEnum_growLattice(E, N, &LA, 1);
// #endif
// 			} else {
// #ifdef VERBOSE
// 				printf("VERTICALLY DECOMPOSABLE; SKIPPING!\n");
// #endif
// 			}
// #else
 			E.reg(E, LA);
 			if (LA.n < N) {
				lattEnum_growLattice(E, N, LA, 1);
			}
// #endif
				lattice.lattice_clearStabiliser(LA);
// #ifdef DOTEST
// 			if (!antichaindata_step_1_FUNC(&AD))
// 				break;
// #else
				if (!Antichain.antichaindata_step_1(AD)) {
					break;
				}
// #endif
			}
			k = 2;
		} else {
			k = nmin;
		}
		if (VERBOSE) {
			System.out.println("SAI: k=" + k);
		}

		for (; k <= N - L.n; k++) {
			if (VERBOSE) {
				System.out.printf("\n=== adding a level with %d elements\n", k);
			}
			Antichain.antichaindata_reinit(AD, k);
			Antichain.antichaindata_prepareLattice(AD, L, LA);
			while (Antichain.antichaindata_next(AD)){
				Antichain.antichaindata_generateLattice(AD, L, LA);
// #ifdef DOTEST
// 			if (!antichaindata_test(&AD)) {
// 				printf("BAD LATTICE-ANTICHAIN DATA\n");
// 				printf("\n### lattice:\n"); lattice_print(L);
// 				printf("+++ antichain data: "); antichaindata_printAntichains(&AD);
// 				printf(">>> lattice:\n"); lattice_print(&LA);
// 				erri(-4);
// 			}
// 			if (!lattice_test(&LA)) {
// 				printf("INCONSISTENT LATTICE!\n");
// 				printf("\n### lattice:\n"); lattice_print(L);
// 				printf("+++ antichain data: "); antichaindata_printAntichains(&AD);
// 				printf(">>> lattice:\n"); lattice_print(&LA);
// 				erri(-4);
// 			}
// 			if (!lattice_isCanonical(&LA)) {
// 				printf("NON-CANONICAL LATTICE!\n");
// 				printf("\n### lattice:\n"); lattice_print(L);
// 				printf("+++ antichain data: "); antichaindata_printAntichains(&AD);
// 				printf(">>> lattice:\n"); lattice_print(&LA);
// 				erri(-4);
// 			}
// #endif
				if (VERBOSE) {
					System.out.print("\n### lattice:\n");
					lattice.lattice_print(L);
					System.out.print("+++ antichain data: ");
					Antichain.antichaindata_printAntichains(AD);
					System.out.println(">>> lattice:");
					lattice.lattice_print(LA);
				}
				E.reg(E, LA);
// #if defined(FILTER_INDECOMPOSABLE) && defined(FILTER_GRADED)
// 			if (LA.n < N-1)
// 				lattEnum_growLattice(E, N, &LA, 2);
// #else
				//System.out.println("SAI: " + LA.n + " cf. " + N);
				if (LA.n < N) {
					lattEnum_growLattice(E, N, LA, 1);
				}
//#endif
				lattice.lattice_clearStabiliser(LA);
// #ifdef DOTEST
// 			if (!antichaindata_step_FUNC(&AD))
// 				break;
// #else
				if (!Antichain.antichaindata_step(AD)) {
					break;
				}
				//#endif
			}
		}

		Antichain.antichaindata_clear(AD);
		if (VERBOSE) {
			System.out.println("\n[<<< leaving lattEnum_growLattice]:");
			lattice.lattice_print(L);
		}
	}


	/*
	 * Construct canonical lattices with N elements by recursively adding new levels to the lattice L with 2
	 * elements, where the first added level contains at least nmin elements.  For every canonical lattice
	 * found during this process (also for those with fewer than N elements), the function *reg is called.
	 *
	 * The function assumes that *L is the lattice with 2 elements.
	 */
	static void lattEnum_growLattice_2(lattEnum E, int N, lattice L, int nmin) {
		lattice LA = new lattice();
		int k;

// #ifdef DOTEST
// 	if (L.n) {
// 		printf("BAD CALL [lattEnum_growLattice_2]: argument is not the lattice with 2 elements!\n");
// 		lattice_print(L);
// 	}
// #endif

// #ifdef FILTER_INDECOMPOSABLE
// 	for (k=nmin>1?nmin:2; k<=N-L.n; k++) {
// #else
		for (k = nmin; k <= N - L.n; k++) {
			//#endif
			lattice.lattice_init_kFan(LA, k);
			E.reg(E, LA);
// #if defined(FILTER_INDECOMPOSABLE) && defined(FILTER_GRADED)
// 			if (LA.n < N-1)
// 				lattEnum_growLattice(E, N, &LA, 2);
// #else
			if (LA.n < N) {
				lattEnum_growLattice(E, N, LA, 1);
			}
			//#endif
			lattice.lattice_clearStabiliser(LA);
		}
	}

}
