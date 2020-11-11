package gebhardt;

import irvine.math.ByteUtils;

/**
 * Permutations.
 * @author Volker Gebhardt
 * @author Sean A. Irvine (Java port)
 */
final class Permutation {

  // Original header:

  /*
   * permutation.c
   *
   * Created on: 22 Mar 2014
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

  private Permutation() { }

  /** Create an empty pemutation. */
  static byte[] create() {
    return new byte[Utils.MAXN - 2];
  }

  /*
   * Initialise p to the identity permutation.
   */
  static void init(final int n, final byte[] p) {
    ByteUtils.identity(p, n);
  }


  /*
   * Resize p from n to m by adding trivial action on the points n..m-1.
   */
  static void resize(final int n, final int m, final byte[] p) {
    for (int i = n; i < m; ++i) {
      p[i] = (byte) i;
    }
  }

  /*
   * Copy p to r.
   */
  static void copy(final int n, final byte[] p, final byte[] r) {
    System.arraycopy(p, 0, r, 0, n);
  }

  static byte[] inverse(final int n, final byte[] perm) {
    final byte[] inv = Permutation.create();
    for (int k = 0; k < n; ++k) {
      inv[perm[k]] = (byte) k;
    }
    return inv;
  }

  /*
   * Store the inverse of p in r.
   *
   * r must not be p.
   */
  static void inverse(final int n, final byte[] p, final byte[] r) {
    for (int i = 0; i < n; ++i) {
      r[p[i]] = (byte) i;
    }
  }


  /*
   * Store the product p*q in r.  (p is applied first.)
   *
   * r can be p, but r must not be q.
   */
  static void multiply(final int n, final byte[] p, final byte[] q, final byte[] r) {
    for (int i = 0; i < n; ++i) {
      r[i] = q[p[i]];
    }
  }


  /*
   * Store the product l*p*q in r.  (l is applied first.)
   */
  static void multiply(final int n, final byte[] l, final byte[] p, final byte[] q, final byte[] r) {
    for (int i = 0; i < n; ++i) {
      r[i] = q[p[l[i]]];
    }
  }


  /*
   * Store the product p^-1*q in r.  (p^-1 is applied first.)
   *
   * r must not be either p or q.
   */
  static void leftDivide(final int n, final byte[] p, final byte[] q, final byte[] r) {
    for (int i = 0; i < n; ++i) {
      r[p[i]] = q[i];
    }
  }


  /*
   * Store l^-1*p*q in r.  (l^-1 is applied first.)
   *
   * r must not be either l or p or q.
   */
  static void leftDivideMultiply(final int n, final byte[] l, final byte[] p, final byte[] q, final byte[] r) {
    for (int i = 0; i < n; ++i) {
      r[l[i]] = q[p[i]];
    }
  }


  /*
   * Store the product (l*p)^-1 in r.  (l is applied first.)
   */
  static void multiplyInverse(final int n, final byte[] l, final byte[] p, final byte[] r) {
    for (int i = 0; i < n; ++i) {
      r[p[l[i]]] = (byte) i;
    }
  }


  /*
   * Store the product (l*p*q)^-1 in r.  (l is applied first.)
   */
  static void multiplyInverse(final int n, final byte[] l, final byte[] p, final byte[] q, final byte[] r) {
    for (int i = 0; i < n; ++i) {
      r[q[p[l[i]]]] = (byte) i;
    }
  }


  /*
   * Store the product (l*p)^-1*q in r.  (l is applied first.)
   */
  static void multiplyLeftDivide(final int n, final byte[] l, final byte[] p, final byte[] q, final byte[] r) {
    for (int i = 0; i < n; ++i) {
      r[p[l[i]]] = q[i];
    }
  }


  /*
   * Store the product (l*p*q)^-1*r in s.  (l is applied first.)
   */
  static void multiplyLeftDivide(final int n, final byte[] l, final byte[] p, final byte[] q, final byte[] r, final byte[] s) {
    for (int i = 0; i < n; ++i) {
      s[q[p[l[i]]]] = r[i];
    }
  }


  /*
   * The smallest point in the support of p, or n if p is the identity.
   */
  static int minSupport(final int n, final byte[] p) {
    int i;
    for (i = 0; i < n && (p[i] == i); ++i) {
    }
    return i;
  }

  /*
   * Return TRUE is p acts trivially on 0..(n-1), and return FALSE otherwise
   */
  static boolean isIdentity(final int n, final byte[] p) {
    for (int i = 0; i < n; ++i) {
      if (p[i] != i) {
        return false;
      }
    }
    return true;
  }

  /*
   * Lexicographically compare the permutations p and q (viewed as arrays).
   *
   * Return value: <0 if p[i] < q[i] and p[j] = p[j] for j<i
   *               0  if A = B
   *               >0 if p[i] > q[i] and p[j] = q[j] for j<i
   */
  static int compare(final int n, final byte[] p, final byte[] q) {
    for (int i = 0; i < n; ++i) {
      final int d = Byte.compare(p[i], q[i]);
      if (d != 0) {
        return d;
      }
    }
    return 0;
  }

  /*
   * Return an integer in {0..n!-1} that uniquely identifies the permutation p.
   */
  static long toInteger(final int n, final byte[] p) {
    long k = 0;
    long m = 1;
    final byte[] pos = ByteUtils.identity(Permutation.create());
    final byte[] elems = ByteUtils.identity(Permutation.create());
    for (int i = 0; i < n - 1; ++i) {
      k += m * pos[p[i]];
      m *= n - i;
      pos[elems[n - i - 1]] = pos[p[i]];
      elems[pos[p[i]]] = elems[n - i - 1];
    }
    assert k <= Integer.MAX_VALUE;
    return k;
  }

  /*
   * TEST FUNCTION:  Print p (in array notation).
   */
 static void print(final int n, final byte[] p, final int offset) {
   System.out.printf("%d", p[0] + offset);
   for (int i = 1; i < n; ++i) {
     System.out.printf(", %d", p[i] + offset);
   }
   System.out.println();
 }

  /*
   * Advance p to the next permutation fixing the levels
   * {0..lev[1]-1},..,{lev[nLev-2]..lev[nLev-1]-1}.
   *
   * Return value: true if success; false if no further permutation exists.
   */
  static boolean next(final int nLev, final int[] lev, final byte[] p) {
    int i, j;
    boolean tt = false;  /* initialisation value unused; just to prevent warning */
    int lpos = 0;
    int thislev = 0;
    while (true) {
      /* advance to next non-trivial level */
      while (lev[lpos] == thislev + 1) {
        thislev++;
        if (++lpos == nLev) {
          return false;
        }
      }
      for (i = thislev + 1; i < lev[lpos] && !(tt = (p[i - 1] < p[i])); ++i) {
      }
      if (!tt) {
        /* set current level to id & advance to next level */
        for (i = thislev; i < lev[lpos]; ++i) {
          p[i] = (byte) i;
        }
        thislev = lev[lpos];
        if (++lpos == nLev) {
          return false;
        }
        continue;
      }
      for (j = thislev; !(p[j] < p[i]); ++j) {
      }
      /* swap entries i and j */
      byte t = p[i];
      p[i] = p[j];
      p[j] = t;
      /* reverse level up to position i-1 */
      --i;
      j = thislev;
      while (j < i) {
        t = p[i];
        p[i] = p[j];
        p[j] = t;
        --i;
        ++j;
      }
      break;
    }
    return true;
  }
}
