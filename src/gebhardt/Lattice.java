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


  final int[] mUp = new int[Utils.MAXN-2];
  final int[] mLo = new int[Utils.MAXN-2];
  PermGrp mS;
  int mSi;
  final byte[] mLev = new byte[Utils.MAXN-1];
  byte mN;
  int mNLev;

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
  void getCoveringRelation(int[] co) {
    final int[] j = new int[1];
    for (int i = mN; i-- != 0; ) {
      co[i] = 0;
      int ui = mUp[i] ^ (int) Utils.bit(i);
      while (Utils.getMSB32(ui, j)){
        co[i] |= Utils.bit(j[0]);
        ui &= ~mUp[j[0]];
      }
    }
  }


  /*
   * Set dep[i] to the depth of element i of the lattice on n elements defined by the covering relation co.
   * The array dep must be allocated.
   */
  void lattice_getDepths(int[] dep, int[] co, int n) {
    int l, i, j;

    for (i = 0; i < n; i++) {
      dep[i] = 0;
    }
    for (l = n; l-- != 0; ) {
      for (i = n; i-- != 0; ) {
        for (j = n; j-- != 0; ) {
          if ((co[i] & Utils.bit(j)) != 0) {
            if (dep[i] < dep[j] + 1) {
              dep[i] = dep[j] + 1;
            }
          }
        }
      }
    }

  }


// /*
//  * TEST FUNCTION: Return: true if the levellised lattice L is canonical; false otherwise.
//  */
// boolean lattice_isCanonical(lattice L) {
//   int          i, j, li, lj;
//   permutation  permbuf;
//   int      co[MAXN-2];
//   int      dep[MAXN-2];

// #define COV(i,j)  (co[i] & BIT(j))
//   perm_init(L.n, permbuf);
//   lattice_getCoveringRelation(co, L);
//   lattice_getDepths(dep, co, L.n);
//   while (perm_next(L.nLev, L.lev, permbuf))  /* skip identity */ {
//     for (li=1; li<L.nLev; li++)
//       for (lj=li; lj--;)
//         for (i=L.lev[li]; i<L.n && dep[i]==li; i++)
//           for (j=L.lev[lj+1]; j-- && dep[j]==lj;) {
//             if (!COV(i,j)) {
//               if (COV(permbuf[i],permbuf[j]))
//                 goto next;
//             } else {
//               if (!COV(permbuf[i],permbuf[j]))
//                 return false;
//             }
//           }
//     next:;
//   }

//   return true;
// #undef COV
// }


// /*
//  * TEST FUNCTION: Return true if the data for the lattice L are consistent; false otherwise.
//  */
// boolean lattice_test(lattice L)
// {
//   int           i, j, v, gen;
//   int           _dep[MAXN-2];
//   int       _up[MAXN-2];
//   int       _lo[MAXN-2];
//   int       m;
//   int       co[MAXN-2];

// #define COV(i,j)  (co[i] & BIT(j))
//   if (L.nLev < 1 || L.lev[L.nLev-1] != L.n) {
//     printf(">>> basic levels\n");
//     return false;
//   }
//   for (i=0; i<L.n; i++) {
//     _up[i] = _lo[i] = BIT(i);
//     _dep[i] = 0;
//   }
//   lattice_getCoveringRelation(co, L);
//   for (v=L.nLev; v--; )
//     for (i=L.n; i--; )
//       for (j=L.n; j--; )
//         if (COV(i,j)) {
//           _up[i] |= _up[j];
//           _lo[j] |= _lo[i];
//           if (_dep[i] < _dep[j]+1)
//             _dep[i] = _dep[j]+1;
//         }
//   for (i=0,v=-1; i<L.n; i++) {
//     if (i == L.lev[v+1])
//       v++;
//     if (_dep[i] != v) {
//       printf(">>> levels\n");
//       return false;
//     }
//   }
//   if (memcmp(_up, L.up, L.n*sizeof(int))) {
//     printf(">>> upper sets\n");
//     for (i=0; i<L.n; i++)
//       printf("%i: %d [%d]\n", i, L.up[i], _up[i]);
//     return false;
//   }
//   if (memcmp(_lo, L.lo, L.n*sizeof(int))) {
//     printf(">>> lower sets\n");
//     for (i=0; i<L.n; i++)
//       printf("%i: %d [%d]\n", i, L.lo[i], _lo[i]);
//     return false;
//   }
//   for (i=L.n; i--;)
//     for (j=i; j--;) {
//       m = L.lo[i] & L.lo[j];
//       if (get_LSB32(m,&v) && m != (m & L.lo[v])) {
//         printf(">>> meet(%d,%d) [%d]", i, j, v);
//         return false;
//       }
//       m = L.up[i] & L.up[j];
//       if (get_MSB32(m,&v) && m != (m & L.up[v])) {
//         printf(">>> join(%d,%d) [%d]", i, j, v);
//         return false;
//       }
//     }
//   for (gen=L.S.ngens; gen--;)
//     for (i=0; i<L.n; i++)
//       for (j=L.lev[_dep[i]]; j--;)
//         if (!COV(i,j)) {
//           if (COV(L.S.perm[gen][i],L.S.perm[gen][j])) {
//             printf(">>> bad stabiliser generator ");
//             perm_print(L.S.n, L.S.perm[gen], 0);
//             return false;
//           }
//         } else {
//           if (!COV(L.S.perm[gen][i],L.S.perm[gen][j])) {
//             printf(">>> bad stabiliser generator ");
//             perm_print(L.S.n, L.S.perm[gen], 0);
//             return false;
//           }
//         }
//   m = L.SI;
//   while (extract_MSB32(&m, &v)) {
//     if (v > L.n || _dep[v-1] != _dep[v]) {
//       printf(">>> bad implicit stabiliser generator (%d,%d)\n", v-1, v);
//       return false;
//     }
//     for (i=0; i<L.n; i++) {
//       if ((COV(i,v-1) && !COV(i,v)) || (!COV(i,v-1) && COV(i,v))) {
//         printf(">>> bad implicit stabiliser generator (%d,%d)\n", v-1, v);
//         return false;
//       }
//       if ((COV(v-1,i) && !COV(v,i)) || (!COV(v-1,i) && COV(v,i))) {
//         printf(">>> bad implicit stabiliser generator (%d,%d)\n", v-1, v);
//         return false;
//       }
//     }
//   }
// // #ifdef FILTER_GRADED
// //   for (v=1; v<L.nLev-1; v++) {
// //     m = 0;
// //     for (i=L.lev[v]; i<L.lev[v+1]; i++)
// //       m |= co[i];
// //     if (m != BIT(L.lev[v])-BIT(L.lev[v-1])) {
// //       printf(">>> not graded (%d)\n", v);
// //       return false;
// //     }
// //   }
// // #endif
//   return true;
//         //#undef COV
// }


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
    int i, j;
    int[] co = new int[ Utils.MAXN - 2];

    getCoveringRelation(co);
    for (i = 0; i < mN; i++) {
      sb.append((co[i] == 0) ? '1' : '.');              /* i \prec T ? */
      for (j = 0; j < i; j++) {
        sb.append((co[i] & Utils.bit(j)) != 0 ? '1' : '.');  /* i \prec j ? */
      }
    }
    sb.append((mNLev == 1) ? '1' : '.');            /* B \prec T ? */
    for (j = 0; j < mN; j++) {
      sb.append((mLo[j] == Utils.bit(j)) ? '1' : '.');  /* B \prec j ? */
    }
    return sb.toString();
  }


  /*
   * Generate data for a levellised lattice on n elements (including upper and lower bounds) from
   * the string representation s of its covering relation [see above] and the stabiliser S, and
   * write the data to L.  L must point to an allocated block of memory.  Return whether successful.
   * The reference count of *S is incremented.
   */
  static boolean lattice_fromString(Lattice L, int n, String s, PermGrp S, int SI) {
    int d, i, j;
    int pos;
    int[] co = new int[ Utils.MAXN - 2];
    int[] dep = new int[ Utils.MAXN - 2];

    if (s.length() != (n * (n - 1)) / 2) {
// #ifdef DOTEST
//     printf("BAD PARAMETERS in lattice_fromString: given string doesn't match lattice size!\n");
//     erri(-1);
// #endif
      return false;
    }
    n -= 2;  /* We don't store the upper and lower bounds. */
    //memset(L, 0, sizeof(lattice)); // todo this clear is not being done!
    //memset(co, 0, n * sizeof( int));
    L.mN = (byte) n;
    /* first extract covering relation... */
    pos = 0;
    for (i = 0; i < n; i++) {
      pos++;                    /* i \prec T ? (ignored) */
      for (j = 0; j < i; j++) {
        if (s.charAt(pos++) == '1') {
          co[i] |= Utils.bit(j);  /* i \prec j ? */
        }
      }
    }                             /* B \prec j ? (ignored) */
    /* ...then use it to generate the remaining data, except for the stabiliser... */
    for (i = 0; i < n; i++) {
      L.mUp[i] = L.mLo[i] = (int) Utils.bit(i);
      dep[i] = 0;
    }
    for (d = 0; d < n; d++) {
      for (i = 1; i < n; i++) {
        for (j = 0; j < i; j++) {
          if ((co[i] & Utils.bit(j)) != 0) {
            L.mUp[i] |= L.mUp[j];
            L.mLo[j] |= L.mLo[i];
            if (dep[i] < dep[j] + 1) {
              dep[i] = dep[j] + 1;
            }
          }
        }
      }
    }
    L.mLev[0] = 0;
    for (i = 0, d = 0; i < n; d++) {
      while (i < n && dep[i] == d) {
        i++;
      }
      L.mLev[d + 1] = (byte) i;
    }
    L.mNLev = d + 1;  /* count the level containing B */
    /* ...finally set the stabiliser */
    L.setStabiliser(S, SI);
// #ifdef DOTEST
//   return lattice_test(L);
// #else
    return true;
    //#endif
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
  static void lattice_print(Lattice L) {
    int d, i=0, j;
    int[] co = new int[Utils.MAXN - 2];
    boolean first;

    L.getCoveringRelation(co);

    System.out.println("depth -1: T");
    for (d = 0; d < L.mNLev - 1; d++) {
      System.out.printf("depth %2d: ", d);
      for (i = L.mLev[d]; i < L.mLev[d + 1]; i++) {
        System.out.printf("%d[", i);
        if (co[i] == 0) {
          System.out.print("T");
        } else {
          for (j = 0, first = true; j < i; j++) {
            if ((co[i] & Utils.bit(j)) != 0) {
              if (first) {
                System.out.printf("%d", j);
                first = false;
              } else {
                System.out.printf(",%d", j);
              }
            }
          }
        }
        System.out.print("] ");
      }
      System.out.println();
    }
    System.out.printf("depth %2d: B[", L.mNLev - 1);
    if (L.mNLev == 1) {
      System.out.print("T");
    } else {
      for (j = 0, first = true; j < L.mN; j++) {
        if (L.mLo[j] == Utils.bit(j)) {
          if (first) {
            System.out.printf("%d", j);
            first = false;
          } else {
            System.out.printf(",%d", j);
          }
        }
      }
    }
    System.out.println("]");
    System.out.printf("stabiliser [%d]:\n", L.mS.mN);
    PermGrp.printGenerators(L.mS, 0);
    final int[] SI = {L.mSi};
    final int[] ii = {i};
    while (Utils.extractLSB32(SI, ii)) {
      System.out.printf("(%d,%d) implicit\n", ii[0] - 1, ii[0]);
    }
  }


  /**
   * Initialise L to the lattice with 2 elements.
   */
  public static Lattice lattice_init_2() {
    final Lattice L = new Lattice();
    PermGrp S;

    S = new PermGrp();
    lattice_fromString(L, 2, "1", S, 0);
    //PermGrp.permgrp_delete(S);
    return L;
  }


  /*
   * Initialise L to the k-fan (the lattice with k elements covered by T and covering B).
   */
  static void lattice_init_kFan(Lattice L, int k) {
    for (int i = 0; i < k; i++) {
      L.mUp[i] = L.mLo[i] = (int) Utils.bit(i);
    }
    final PermGrp S = new PermGrp();
    final int SI = (1 << k) - 2;  /* bits 1,..,(k-1) set */
    L.setStabiliser(S, SI);
    //PermGrp.permgrp_delete(S);
    L.mLev[0] = 0;
    L.mLev[1] = (byte) k;
    L.mN = (byte) k;
    L.mNLev = 2;
  }


//  /*
//   * Return the number of maximal chains (from B to T) in L.
//   */
//  int lattice_numberOfMaximalChains(lattice L) {
//    int[] co = new int[ Constants.MAXN - 2];
//    int mc = 0;
//    int[][] p = new int[ 2][Constants.MAXN - 2];
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
