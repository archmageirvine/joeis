package gebhardt;

/**
 * Lattice enumeration.
 * @author Volker Gebhardt
 * @author Sean A. Irvine (Java port)
 */
public abstract class LattEnum {

  // Original header:

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

  private static final boolean VERBOSE = "true".equals(System.getProperty("oeis.verbose"));

  abstract void reg(final Lattice l);  /* function called for registering lattices */

  Globals mGlobals;                /* "global" data for process/thread         */
  Lattice mL;                 /* lattice whose descendants we enumerate   */
  long mCount;             /* number of lattices found                 */
  int mN;                 /* target size                              */
  int mNmin;              /* minimum size for recursion               */

  static class LattEnumCount extends LattEnum {
    /*
     * Register the lattice l.
     */
    void reg(final Lattice l) {
      if (l.mN == mN) {
        ++mCount;
      }
    }
  }

  static class LattEnumStdout extends LattEnum {

    /*
     * Register the lattice L.
     */
    void reg(final Lattice l) {
      if (l.mN == mN) {
        ++mCount;
        System.out.println(l.toString());
      }
    }
  }


  /**
   * Return the number of registered lattices.
   */
  public long getCount() {
    return mCount;
  }

  /**
   * Do the enumeration.
   */
  public void doEnumeration() {
    reg(mL);
    if (mL.mN < mN) {
      if (mL.mN != 0) {
        growLattice(mN, mL, mNmin - mL.mN);
      } else {
        growLattice2(mN, mL, mNmin - mL.mN);
      }
    }
  }

  /*
   * Return a structure for counting the descendants of *L of size equal to N, for which all intermediate lattices
   * have size at most Nmin.
   */
  public static LattEnum lattEnum_Count_create(Lattice L, int N, int Nmin, Globals GD) {
    LattEnumCount E;

    if (L != null && (N - 2 < L.mN || Nmin - 2 < L.mN)) {
      throw new RuntimeException("BAD PARAMETERS in lattEnum_Count_create: given lattice larger than target/intermediate size!");
    }
    E = new LattEnumCount();
    E.mL = L;
    E.mN = N - 2;
    E.mNmin = Nmin - 2;
    E.mCount = 0;
    E.mGlobals = GD;
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
  LattEnum lattEnum_stdout_create(Lattice L, int N, int Nmin, Globals GD) {
    LattEnumStdout E;

    if (L != null && (N - 2 < L.mN || Nmin - 2 < L.mN)) {
      throw new RuntimeException("BAD PARAMETERS in lattEnum_stdout_create: given lattice larger than target/intermediate size!");
    }
    E = new LattEnumStdout();
    E.mL = L;
    E.mN = N - 2;
    E.mNmin = Nmin - 2;
    E.mCount = 0;
    E.mGlobals = GD;
    //E.reg = lattEnum_stdout_register; // sai note done in subclass now
// #ifdef THREADED
//   E.output = (char*)malloc(THREADED_OUTPUT_BUFFER_SIZE);
//   *(E.output) = 0;
//   E.outpos = 0;
//   E.outsize = THREADED_OUTPUT_BUFFER_SIZE;
// #endif
    return E;
  }


  /*
   * Flush the output buffer.
   */
  void lattEnum_stdout_flush(LattEnumStdout E) {
// #ifdef THREADED
//   *(E.output+E.outpos) = 0;
//   pthread_mutex_lock(&mutex_out);
//   printf("%s", E.output);
//   pthread_mutex_unlock(&mutex_out);
//   E.outpos = 0;
// #endif
  }


  /*
   * Free all memory (and print the maximal number of maximal chains if enabled).
   */
  void lattEnum_Count_free(LattEnum E) {
// #ifdef COUNT_MAXIMAL_CHAINS
//   lattEnum_Count* EE = (lattEnum_Count*)E;
//   printf("at most %u maximal chains\n", EE.max_mc);
// #endif
//   free((lattEnum_Count*)E);
  }


  /*
   * Construct canonical lattices with n elements by recursively adding new levels to the canonical lattice l,
   * where the first added level contains at least nmin elements.  For every canonical lattice found during
   * this process (also for those with fewer than n elements), the function *reg is called.
   */
  private void growLattice(final int n, final Lattice l, final int nmin) {
    Lattice la = new Lattice();
    if (VERBOSE) {
      System.out.printf("\n[>>> entering lattEnum_growLattice]: %d\n", nmin);
      l.print();
    }
    Antichain antichain = new Antichain(l, nmin, mGlobals);

    antichain.prepareLattice(l, la);
    int k;
    if (nmin == 1) {
      if (VERBOSE) {
        System.out.printf("\n=== adding a level with %d elements\n", 1);
      }
      while (antichain.next1()) {
        antichain.generateLattice1(l, la);
        if (VERBOSE) {
          System.out.println("\n### lattice:");
          l.print();
          System.out.print("+++ antichain data: ");
          antichain.printAntichains();
          System.out.println(">>> lattice:");
          la.print();
        }
        this.reg(la);
        if (la.mN < n) {
          growLattice(n, la, 1);
        }
        if (!antichain.step1()) {
          break;
        }
      }
      k = 2;
    } else {
      k = nmin;
    }

    for (; k <= n - l.mN; ++k) {
      if (VERBOSE) {
        System.out.printf("\n=== adding a level with %d elements\n", k);
      }
      antichain.reset(k);
      antichain.prepareLattice(l, la);
      while (antichain.next()) {
        antichain.generateLattice(l, la);
        if (VERBOSE) {
          System.out.print("\n### lattice:\n");
          l.print();
          System.out.print("+++ antichain data: ");
          antichain.printAntichains();
          System.out.println(">>> lattice:");
          la.print();
        }
        reg(la);
        if (la.mN < n) {
          growLattice(n, la, 1);
        }
        if (!antichain.step()) {
          break;
        }
      }
    }

    if (VERBOSE) {
      System.out.println("\n[<<< leaving lattEnum_growLattice]:");
      l.print();
    }
  }


  /*
   * Construct canonical lattices with n elements by recursively adding new levels to the lattice l with 2
   * elements, where the first added level contains at least nmin elements.  For every canonical lattice
   * found during this process (also for those with fewer than n elements), the function *reg is called.
   *
   * The function assumes that *l is the lattice with 2 elements.
   */
  void growLattice2(int n, Lattice l, int nmin) {
    Lattice la = new Lattice();
    for (int k = nmin; k <= n - l.mN; ++k) {
      Lattice.initKFan(la, k);
      reg(la);
      if (la.mN < n) {
        growLattice(n, la, 1);
      }
    }
  }
}
