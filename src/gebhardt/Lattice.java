package gebhardt;

/**
 * Lattices.
 * @author Volker Gebhardt
 * @author Sean A. Irvine (Java port)
 */
public class Lattice {

  // Original header:

  /*
   * lattice.c
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

  /* We describe a lattice with the elements T,0,..,n-1,L (where T and B are the upper and lower bounds) by the following data:
   *   elt       n              -- number of non-extremal elements (the upper and lower bounds T and B are not stored)
   *   elt       nLev           -- number of levels, excluding T but including B
   *   elt       lev[0..nLev-1] -- first element in each level, with L represented by n; lev[0]=0, ..., lev[nLev-1]=n
   *   permgrp*  S              -- subgroup of the stabiliser of the lattice that generates the stabiliser together with...
   *   flags32   SI             -- ...the transpositions (i-1 i) of elements on level nLev-2 for the bits i set in SI
   *   flags32   up[0..n-1]     -- upper set: up[i] & (1<<j) iff j \in uparrow i
   *   flags32   lo[0..n-1]     -- lower set: lo[i] & (1<<j) iff j \in \downarrow i
   *
   * no longer stored explicitly:
   *   elt       dep[0..n-1]    -- depth of each non-extremal element (0: depth 1, ..., n-1: depth nLev-2)
   *   flags32   co[0..n-1]     -- covers: co[i] & (1<<j) iff i \prec j (that is, i is covered by j)
   *
   */


  final int[] mUp = new int[Utils.MAXN - 2];
  final int[] mLo = new int[Utils.MAXN - 2];
  PermGrp mS;
  int mSi;
  final byte[] mLev = new byte[Utils.MAXN - 1];
  byte mN;
  int mNLev;

  /** Construct a lattice. */
  public Lattice() {
  }

//  // Copy constructor
//  public lattice(final lattice l) {
//    up = Arrays.copyOf(l.up, l.up.length);
//    lo = Arrays.copyOf(l.lo, l.lo.length);
//    S = l.S;
//    SI = l.SI;
//    lev = Arrays.copyOf(l.lev, l.lev.length);
//    n = l.n;
//    nLev = l.nLev;
//  }

  /*
   * Set the stabiliser data of the lattice L to s / si; the reference count of s is incremented.
   */
  void setStabiliser(final PermGrp s, final int si) {
    mS = s;
    mSi = si;
  }

//  /*
//   * Copy L to M.
//   */
//  static lattice lattice_cpy(lattice L) {
//    final lattice M = new lattice(L);
//    M.S = permgrp.permgrp_alloc();
//    permgrp.permgrp_cpy(L.S, M.S); /* This does not copy the Bene&scaron; networks, so we do this manually. */
//    int B = M.S.BenesValid = L.S.BenesValid;
//    final int[] n = new int[1];
//    while (Constants.get_LSB32(B, n)){
//      for (int i = 0; i < L.S.ngens; i++) {
//        M.S.benes[n[0]][i] = Benes.benes_incref(L.S.benes[n[0]][i]);
//      }
//      B ^= BIT(n[0]);  /* bit n is set, so this clears it */
//    }
//    return M;
//  }


  /*
   * Set co[i] to a flag indicating the covers of element i of the lattice L.
   * The array co must be allocated.
   */
  void getCoveringRelation(final int[] co) {
    final int[] j = new int[1];
    for (int i = mN; i-- != 0; ) {
      co[i] = 0;
      int ui = mUp[i] ^ (int) Utils.bit(i);
      while (Utils.getMSB32(ui, j)) {
        co[i] |= Utils.bit(j[0]);
        ui &= ~mUp[j[0]];
      }
    }
  }

//  /*
//   * Set dep[i] to the depth of element i of the lattice on n elements defined by the covering relation co.
//   * The array dep must be allocated.
//   */
//  void getDepths(int[] dep, int[] co, int n) {
//    for (int i = 0; i < n; i++) {
//      dep[i] = 0;
//    }
//    for (int l = n; l-- != 0; ) {
//      for (int i = n; i-- != 0; ) {
//        for (int j = n; j-- != 0; ) {
//          if ((co[i] & Utils.bit(j)) != 0) {
//            if (dep[i] < dep[j] + 1) {
//              dep[i] = dep[j] + 1;
//            }
//          }
//        }
//      }
//    }
//
//  }

  /*
   * Store a representation of the covering relation of the levellised lattice L in the
   * string buf.  The string contains the part of the covering matrix below the diagonal,
   * including the upper and lower bounds, in row major order.  The order of rows/columns
   * is as follows:  T,0,1,..,n-1,B.
   * The string buf must be allocated and have at least size (L.n+2)*(L.n+1)/2+1.
   */
  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    final int[] co = new int[Utils.MAXN - 2];
    getCoveringRelation(co);
    for (int i = 0; i < mN; ++i) {
      sb.append((co[i] == 0) ? '1' : '.');              /* i \prec T ? */
      for (int j = 0; j < i; ++j) {
        sb.append((co[i] & Utils.bit(j)) != 0 ? '1' : '.');  /* i \prec j ? */
      }
    }
    sb.append((mNLev == 1) ? '1' : '.');            /* B \prec T ? */
    for (int j = 0; j < mN; ++j) {
      sb.append((mLo[j] == Utils.bit(j)) ? '1' : '.');  /* B \prec j ? */
    }
    return sb.toString();
  }

  /*
   * Generate data for a levellised lattice on n elements (including upper and lower bounds) from
   * the string representation str of its covering relation [see above] and the stabiliser s, and
   * write the data to l.  l must point to an allocated block of memory.  Return whether successful.
   * The reference count of s is incremented.
   */
  static boolean fromString(final Lattice l, int n, final String str, final PermGrp s, final int si) {
    if (str.length() != (n * (n - 1)) / 2) {
      return false;
    }
    final int[] co = new int[Utils.MAXN - 2];
    final int[] dep = new int[Utils.MAXN - 2];
    n -= 2;  /* We don't store the upper and lower bounds. */
    //memset(l, 0, sizeof(lattice)); // todo this clear is not being done!
    l.mN = (byte) n;
    /* first extract covering relation... */
    int pos = 0;
    for (int i = 0; i < n; ++i) {
      ++pos;                    /* i \prec T ? (ignored) */
      for (int j = 0; j < i; ++j) {
        if (str.charAt(pos++) == '1') {
          co[i] |= Utils.bit(j);  /* i \prec j ? */
        }
      }
    }                             /* B \prec j ? (ignored) */
    /* ...then use it to generate the remaining data, except for the stabiliser... */
    for (int i = 0; i < n; ++i) {
      l.mUp[i] = l.mLo[i] = (int) Utils.bit(i);
      dep[i] = 0;
    }
    for (int d = 0; d < n; ++d) {
      for (int i = 1; i < n; ++i) {
        for (int j = 0; j < i; ++j) {
          if ((co[i] & Utils.bit(j)) != 0) {
            l.mUp[i] |= l.mUp[j];
            l.mLo[j] |= l.mLo[i];
            if (dep[i] < dep[j] + 1) {
              dep[i] = dep[j] + 1;
            }
          }
        }
      }
    }
    l.mLev[0] = 0;
    int d = 0;
    for (int i = 0; i < n; ++d) {
      while (i < n && dep[i] == d) {
        ++i;
      }
      l.mLev[d + 1] = (byte) i;
    }
    l.mNLev = d + 1;  /* count the level containing B */
    /* ...finally set the stabiliser */
    l.setStabiliser(s, si);
    return true;
  }

//  void lattice_toOldString(String buf, lattice L)
//    /*
//     * Store a representation of the covering relation of the levellised lattice L in the
//     * string buf.  The string contains the entire covering matrix below the diagonal,
//     * including the upper and lower bounds, in row major order.  The order of rows/columns
//     * is as follows:  T,0,1,..,n-1,B.
//     * The string buf must be allocated and have at least size (L.n+2)*(L.n+2)+1.
//     */ {
//    int i, j;
//    int pos;
//    int[] co = new int[ Constants.MAXN - 2];
//
//    lattice_getCoveringRelation(co, L);
//    pos = 0;
//    for (j = 0; j < L.n + 2; j++) {
//      buf[pos++] = '.';                               /* T \prec T/j/B ? */
//    }
//    for (i = 0; i < L.n; i++) {
//      buf[pos++] = (co[i] == 0) ? '1' : '.';              /* i \prec T ? */
//      for (j = 0; j < L.n; j++) {
//        buf[pos++] = (co[i] & BIT(j)) ? '1' : '.';  /* i \prec j ? */
//      }
//      buf[pos++] = '.';                               /* i \prec B ? */
//    }
//    buf[pos++] = (L.nLev == 1) ? '1' : '.';            /* B \prec T ? */
//    for (j = 0; j < L.n; j++) {
//      buf[pos++] = (L.lo[j] == BIT(j)) ? '1' : '.';  /* B \prec j ? */
//    }
//    buf[pos++] = '.';                                   /* B \prec B ? */
//    buf[pos] = 0;
//  }
//
//
//  /*
//   * Generate data for a levellised lattice on n elements (including upper and lower bounds)
//   * from the string representation s of its covering relation [see lattice_toOldString] and
//   * the stabiliser S, and write the data to L.  L must point to an allocated block of memory.
//   * Return whether successful.  The reference count of *S is incremented.
//   */
//  boolean lattice_fromOldString(lattice L, int n, String s, permgrp S, int SI) {
//    int d, i, j;
//    int pos;
//    int co[ MAXN - 2];
//    int dep[ MAXN - 2];
//
//    if (strlen(s) != n * n) {
//// #ifdef DOTEST
////     printf("BAD PARAMETERS in lattice_fromString: given string doesn't match lattice size!\n");
////     erri(-1);
//// #endif
//      return false;
//    }
//    n -= 2;  /* We don't store the upper and lower bounds. */
//    memset(L, 0, sizeof(lattice));
//    memset(co, 0, n * sizeof( int));
//    L.n = n;
//    /* first extract covering relation... */
//    pos = n + 2;                    /* T \prec T/j/B ? (ignored) */
//    for (i = 0; i < n; i++) {
//      pos++;                    /* i \prec T ? (ignored) */
//      for (j = 0; j < n; j++) {
//        if (s[pos++] == '1') {
//          co[i] |= BIT(j);  /* i \prec j ? */
//        }
//      }
//      pos++;                    /* i \prec B ? (ignored) */
//    }                             /* B \prec T/j/B ? (ignored) */
//    /* ...then use it to generate the remaining data, except for the stabiliser... */
//    for (i = 0; i < n; i++) {
//      L.up[i] = L.lo[i] = BIT(i);
//      dep[i] = 0;
//    }
//    for (d = 0; d < n; d++) {
//      for (i = 1; i < n; i++) {
//        for (j = 0; j < i; j++) {
//          if (co[i] & BIT(j)) {
//            L.up[i] |= L.up[j];
//            L.lo[j] |= L.lo[i];
//            if (dep[i] < dep[j] + 1) {
//              dep[i] = dep[j] + 1;
//            }
//          }
//        }
//      }
//    }
//    L.lev[0] = 0;
//    for (i = 0, d = 0; i < n; d++) {
//      while (i < n && dep[i] == d) {
//        i++;
//      }
//      L.lev[d + 1] = i;
//    }
//    L.nLev = d + 1;  /* count the level containing B */
//    /* ...finally set the stabiliser */
//    lattice_setStabiliser(L, S, SI);
//// #ifdef DOTEST
////   return lattice_test(L);
//// #else
//    return true;
//    //#endif
//  }


  /*
   * Print the levellised lattice L to stdout.
   */
  void print() {
    final int[] co = new int[Utils.MAXN - 2];
    getCoveringRelation(co);

    System.out.println("depth -1: T");
    int i = 0;
    final StringBuilder sb = new StringBuilder();
    for (int d = 0; d < mNLev - 1; d++) {
      sb.append(String.format("depth %2d: ", d));
      for (i = mLev[d]; i < mLev[d + 1]; i++) {
        sb.append(i).append('[');
        if (co[i] == 0) {
          sb.append('T');
        } else {
          boolean first = true;
          for (int j = 0; j < i; j++) {
            if ((co[i] & Utils.bit(j)) != 0) {
              if (first) {
                sb.append(j);
                first = false;
              } else {
                sb.append(',').append(j);
              }
            }
          }
        }
        sb.append("] ");
      }
      sb.append('\n');
    }
    sb.append(String.format("depth %2d: B[", mNLev - 1));
    if (mNLev == 1) {
      sb.append('T');
    } else {
      boolean first = true;
      for (int j = 0; j < mN; j++) {
        if (mLo[j] == Utils.bit(j)) {
          if (first) {
            sb.append(j);
            first = false;
          } else {
            sb.append(',').append(j);
          }
        }
      }
    }
    sb.append(']');
    System.out.println(sb.toString());
    System.out.printf("stabiliser [%d]:%n", mS.mN);
    PermGrp.printGenerators(mS, 0);
    final int[] si = {mSi};
    final int[] ii = {i};
    while (Utils.extractLSB32(si, ii)) {
      System.out.printf("(%d,%d) implicit%n", ii[0] - 1, ii[0]);
    }
  }


  /**
   * Initialise to the lattice with 2 elements.
   */
  public static Lattice init2() {
    final Lattice l = new Lattice();
    fromString(l, 2, "1", new PermGrp(), 0);
    return l;
  }


  /*
   * Initialise l to the k-fan (the lattice with k elements covered by T and covering B).
   */
  static Lattice initKFan(final Lattice l, final int k) {
    for (int i = 0; i < k; ++i) {
      l.mUp[i] = l.mLo[i] = (int) Utils.bit(i);
    }
    final PermGrp s = new PermGrp();
    final int si = (1 << k) - 2;  /* bits 1,..,(k-1) set */
    l.setStabiliser(s, si);
    l.mLev[0] = 0;
    l.mLev[1] = (byte) k;
    l.mN = (byte) k;
    l.mNLev = 2;
    return l;
  }


//  /*
//   * Return the number of maximal chains (from B to T) in L.
//   */
//  int lattice_numberOfMaximalChains(lattice L) {
//    int[] co = new int[ Constants.MAXN - 2];
//    int mc = 0;
//    int[][] p = new int[2][Constants.MAXN - 2];
//    int i, l;
//
//    lattice_getCoveringRelation(co, L);
//    for (i = 0; i < L.n; i++) {
//      p[0][i] = (L.lo[i] == BIT(i)) ? 1 : 0;
//    }
//    for (l = 1; l < L.nLev; l++) {
//      memset(p[l & 1], 0, L.n * sizeof( int));
//      for (i = 0; i < L.n; i++) {
//        int C = co[i];
//        if (C == 0) {
//          mc += p[(l - 1) & 1][i];
//        } else {
//          int j;
//          while (get_LSB32(C, & j)){
//            C ^= BIT(j);
//            p[l & 1][j] += p[(l - 1) & 1][i];
//          }
//        }
//      }
//    }
//    return mc;
//  }
}
