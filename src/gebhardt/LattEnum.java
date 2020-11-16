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

  /**
   * Return a structure for counting the descendants of *l of size equal to n, for which all intermediate lattices
   * have size at most <code>nMin</code>.
   * @param l lattice
   * @param n size
   * @param nMin minimum size of intermediate lattices
   * @param globals global state
   */
  public static LattEnum countCreate(final Lattice l, final int n, final int nMin, final Globals globals) {
    if (l != null && (n - 2 < l.mN || nMin - 2 < l.mN)) {
      throw new IllegalArgumentException("Bad parameters: given lattice larger than target/intermediate size!");
    }
    final LattEnumCount e = new LattEnumCount();
    e.mL = l;
    e.mN = n - 2;
    e.mNmin = nMin - 2;
    e.mCount = 0;
    e.mGlobals = globals;
    return e;
  }


  /*
   * Return a structure for writing string representations of the descendants of *l of size n to stdout, for
   * which all intermediate lattices have size at most nMin..
   */
  LattEnum stdoutCreate(final Lattice l, final int n, final int nMin, final Globals globals) {
    if (l != null && (n - 2 < l.mN || nMin - 2 < l.mN)) {
      throw new IllegalArgumentException("Bad parameters: given lattice larger than target/intermediate size!");
    }
    final LattEnumStdout e = new LattEnumStdout();
    e.mL = l;
    e.mN = n - 2;
    e.mNmin = nMin - 2;
    e.mCount = 0;
    e.mGlobals = globals;
    return e;
  }

  /*
   * Construct canonical lattices with n elements by recursively adding new levels to the canonical lattice l,
   * where the first added level contains at least nmin elements.  For every canonical lattice found during
   * this process (also for those with fewer than n elements), the function *reg is called.
   */
  private void growLattice(final int n, final Lattice l, final int nmin) {
    final Lattice la = new Lattice();
    if (VERBOSE) {
      System.out.printf("%n[>>> entering lattEnum_growLattice]: %d%n", nmin);
      l.print();
    }
    final Antichain antichain = new Antichain(l, nmin, mGlobals);
    antichain.prepareLattice(l, la);
    int k;
    if (nmin == 1) {
      if (VERBOSE) {
        System.out.printf("%n=== adding a level with %d elements%n", 1);
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
        reg(la);
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
        System.out.printf("%n=== adding a level with %d elements%n", k);
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
  void growLattice2(final int n, final Lattice l, final int nmin) {
    final Lattice la = new Lattice();
    for (int k = nmin; k <= n - l.mN; ++k) {
      Lattice.initKFan(la, k);
      reg(la);
      if (la.mN < n) {
        growLattice(n, la, 1);
      }
    }
  }
}
