package gebhardt;

import irvine.math.ByteUtils;

/**
 * Permutations.
 * @author Volker Gebhardt
 * @author Sean A. Irvine (Java port)
 */
public class permutation {

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


// typedef elt  permutation[MAXN-2];


// #ifdef HARDCODE_MAXN_22
// #if MAXN != 22
// #error "HARDCODE_MAXN_22 conflicts with setting for MAXN in file build.h"
// #endif
// #define UNROLL(a,b,c) { \
// 		a 0 b 0 c; \
// 		a 1 b 1 c; \
// 		a 2 b 2 c; \
// 		a 3 b 3 c; \
// 		a 4 b 4 c; \
// 		a 5 b 5 c; \
// 		a 6 b 6 c; \
// 		a 7 b 7 c; \
// 		a 8 b 8 c; \
// 		a 9 b 9 c; \
// 		a 10 b 10 c; \
// 		a 11 b 11 c; \
// 		a 12 b 12 c; \
// 		a 13 b 13 c; \
// 		a 14 b 14 c; \
// 		a 15 b 15 c; \
// 		a 16 b 16 c; \
// 		a 17 b 17 c; \
// 		a 18 b 18 c; \
// 		a 19 b 19 c; \
// }
// #endif


  /*
   * Initialise p to the identity permutation.
   */
  static void perm_init(int n, byte[] p) {
// #ifdef HARDCODE_MAXN_22
// 	((unsigned long long*)p)[0] = 0x0706050403020100;
// 	((unsigned long long*)p)[1] = 0x0f0e0d0c0b0a0908;
// 	((unsigned int*)p)[4] = 0x13121110;
// #else
// 	elt  i;
//
// #ifdef DOTEST
// 	for (i=n; i<MAXN-2; i++)
// 		p[i] = -1;
// #endif
// 	for (int i=0; i<n; i++)
// 		p[i] = (byte) i;
// #endif
    ByteUtils.identity(p, n);
  }


// void perm_print(elt n, permutation p, elt offset);
// /*
//  * TEST FUNCTION:  Print p (in array notation) with first point being offset.
//  */


  // #ifndef HARDCODE_MAXN_22
  /*
   * Resize p from n to m by adding trivial action on the points n..m-1.
   */
  static void perm_resize(int n, int m, byte[] p) {
    int i;

// #ifdef DOTEST
// 	for (i=n; i<m; i++)
// 		if (p[i] != -1 && p[i] != i) {
// 			printf("BAD PERMUTATION [perm_resize]: unexpected data at position %d in ", i);
// 			perm_print(MAXN, p, 0);
// 			erri(-4);
// 		}
// #endif
    for (i = n; i < m; i++)
      p[i] = (byte) i;
  }
// #endif


// bool perm_next(elt nLev, elt* lev, permutation p);
// /*
//  * Advance p to the next permutation fixing the levels
//  * {0..lev[1]-1},..,{lev[nLev-2]..lev[nLev-1]-1}.
//  *
//  * Return value: 1 if success; 0 if no further permutation exists.
//  */

  /*
   * Copy p to r.
   */
  static void perm_cpy(int n, byte[] p, byte[] r) {
// #ifdef HARDCODE_MAXN_22
// 	((unsigned long long*)r)[0] = ((unsigned long long*)p)[0];
// 	((unsigned long long*)r)[1] = ((unsigned long long*)p)[1];
// 	((unsigned int*)r)[4] = ((unsigned int*)p)[4];
// #else
// #ifdef DOTEST
// 	memcpy(r, p, sizeof(permutation));
// #else
// #endif
// 	memcpy(r, p, n*sizeof(elt));
// #endif
    System.arraycopy(p, 0, r, 0, n);
  }

  static byte[] perm_inv(final int n, final byte[] perm) {
    final byte[] inv = new byte[n];
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
  static void perm_inv(int n, byte[] p, byte[] r) {
// #ifdef HARDCODE_MAXN_22
// 	UNROLL( r[p[ , ]] = , );  /* r[p[i]] = i; */
// #else
// 	elt  i;
//
// #ifdef DOTEST
// 	for (i=n; i<MAXN-2; i++)
// 		r[i] = -1;
// #endif
    for (int i = 0; i < n; i++)
      r[p[i]] = (byte) i;
// #endif
  }


  /*
   * Store the product p*q in r.  (p is applied first.)
   *
   * r can be p, but r must not be q.
   */
  static void perm_mult(int n, byte[] p, byte[] q, byte[] r) {
// #ifdef HARDCODE_MAXN_22
// 	UNROLL( r[ , ] = q[p[ , ]] );  /* r[i] = q[p[i]]; */
// #else
// 	elt  i;
//
// #ifdef DOTEST
// 	for (i=n; i<MAXN-2; i++)
// 		r[i] = -1;
// #endif
    for (int i = 0; i < n; i++)
      r[i] = q[p[i]];
// #endif
  }


  /*
   * Store the product l*p*q in r.  (l is applied first.)
   */
  static void perm_mult3(int n, byte[] l, byte[] p, byte[] q, byte[] r) {
// #ifdef HARDCODE_MAXN_22
// 	UNROLL( r[ , ] = q[p[l[ , ]]] );  /* r[i] = q[p[l[i]]]; */
// #else
// 	elt  i;
//
// #ifdef DOTEST
// 	for (i=n; i<MAXN-2; i++)
// 		r[i] = -1;
// #endif
    for (int i = 0; i < n; i++)
      r[i] = q[p[l[i]]];
// #endif
  }


  /*
   * Store the product p^-1*q in r.  (p^-1 is applied first.)
   *
   * r must not be either p or q.
   */
  static void perm_ldiv(int n, byte[] p, byte[] q, byte[] r) {
// #ifdef HARDCODE_MAXN_22
// 	UNROLL( r[p[ , ]] = q[ , ] );  /* r[p[i]] = q[i]; */
// #else
// #ifdef DOTEST
// 	for (i=n; i<MAXN-2; i++)
// 		r[i] = -1;
// #endif
    for (int i = 0; i < n; i++)
      r[p[i]] = q[i];
// #endif
  }


  /*
   * Store l^-1*p*q in r.  (l^-1 is applied first.)
   *
   * r must not be either l or p or q.
   */
  static void perm_ldiv_mult(int n, byte[] l, byte[] p, byte[] q, byte[] r) {
// #ifdef HARDCODE_MAXN_22
// 	UNROLL( r[l[ , ]] = q[p[ , ]] );  /* r[l[i]] = q[p[i]]; */
// #else
// 	elt  i;
//
// #ifdef DOTEST
// 	for (i=n; i<MAXN-2; i++)
// 		r[i] = -1;
// #endif
    for (int i = 0; i < n; i++)
      r[l[i]] = q[p[i]];
// #endif
  }


  /*
   * Store the product (l*p)^-1 in r.  (l is applied first.)
   */
  static void perm_mult_inv(int n, byte[] l, byte[] p, byte[] r) {
// #ifdef HARDCODE_MAXN_22
// 	UNROLL( r[p[l[ , ]]] = , );  /* r[p[l[i]]] = i; */
// #else
// 	elt  i;
//
// #ifdef DOTEST
// 	for (i=n; i<MAXN-2; i++)
// 		r[i] = -1;
// #endif
    for (int i = 0; i < n; i++)
      r[p[l[i]]] = (byte) i;
// #endif
  }


  /*
   * Store the product (l*p*q)^-1 in r.  (l is applied first.)
   */
  static void perm_mult3_inv(int n, byte[] l, byte[] p, byte[] q, byte[] r) {
// #ifdef HARDCODE_MAXN_22
// 	UNROLL( r[q[p[l[ , ]]]] = , );  /* r[q[p[l[i]]]] = i; */
// #else
// 	elt  i;
//
// #ifdef DOTEST
// 	for (i=n; i<MAXN-2; i++)
// 		r[i] = -1;
// #endif
    for (int i = 0; i < n; i++)
      r[q[p[l[i]]]] = (byte) i;
// #endif
  }


  /*
   * Store the product (l*p)^-1*q in r.  (l is applied first.)
   */
  static void perm_mult_ldiv(int n, byte[] l, byte[] p, byte[] q, byte[] r) {
// #ifdef HARDCODE_MAXN_22
// 	UNROLL( r[p[l[ , ]]] = q[ , ] );  /* r[p[l[i]]] = q[i]; */
// #else
// 	elt  i;
//
// #ifdef DOTEST
// 	for (i=n; i<MAXN-2; i++)
// 		r[i] = -1;
// #endif
    for (int i = 0; i < n; i++)
      r[p[l[i]]] = q[i];
    //#endif
  }


  /*
   * Store the product (l*p*q)^-1*r in s.  (l is applied first.)
   */
  static void perm_mult3_ldiv(int n, byte[] l, byte[] p, byte[] q, byte[] r, byte[] s) {
// #ifdef HARDCODE_MAXN_22
// 	UNROLL(s[q[p[l[,]]]] = r[,]);  /* s[q[p[l[i]]]] = r[i]; */
// #else
// 	elt  i;
//
// #ifdef DOTEST
// 	for (i=n; i<MAXN-2; i++)
// 		s[i] = -1;
// #endif
    for (int i = 0; i < n; i++)
      s[q[p[l[i]]]] = r[i];
// #endif
  }


  /*
   * The smallest point in the support of p, or n if p is the identity.
   */
  static int perm_minSupport(int n, byte[] p) {
// #ifdef HARDCODE_MAXN_22
// 	unsigned long long  l;
// 	elt                 s;
//
// 	if ((l = ((unsigned long long*)p)[0] ^ 0x0706050403020100)) {
// 		s = 0x07;  /* s = 7; */
// 		if (l & 0x00000000ffffffff) {
// 			s &= 0xfb;  /* s -= 4; */
// 			l &= 0x00000000ffffffff;
// 		}
// 		if (l & 0x0000ffff0000ffff) {
// 			s &= 0xfd;  /* s -= 2; */
// 			l &= 0x0000ffff0000ffff;
// 		}
// 		if (l & 0x00ff00ff00ff00ff) {
// 			s &= 0xfe;  /* s -= 1; */
// 		}
// 		return s;
// 	}
// 	if ((l = ((unsigned long long*)p)[1] ^ 0x0f0e0d0c0b0a0908)) {
// 		s = 0x0f;  /* s = 15; */
// 		if (l & 0x00000000ffffffff) {
// 			s &= 0xfb;  /* s -= 4; */
// 			l &= 0x00000000ffffffff;
// 		}
// 		if (l & 0x0000ffff0000ffff) {
// 			s &= 0xfd;  /* s -= 2; */
// 			l &= 0x0000ffff0000ffff;
// 		}
// 		if (l & 0x00ff00ff00ff00ff) {
// 			s &= 0xfe;  /* s -= 1; */
// 		}
// 		return s;
// 	}
// 	if ((l = ((unsigned int*)p)[4] ^ 0x13121110)) {
// 		s = 0x13;  /* s = 19; */
// 		if (l & 0x0000ffff) {
// 			s &= 0xfd;  /* s -= 2; */
// 			l &= 0x0000ffff;
// 		}
// 		if (l & 0x00ff00ff) {
// 			s &= 0xfe;  /* s -= 1; */
// 		}
// 		return s;
// 	}
// 	return 20;
// #else
// 	elt  i;
//
// #ifdef DOTEST
// 	for (i=n; i<MAXN-2; i++)
// 		if (p[i] != -1) {
// 			printf("BAD PERMUTATION [perm_minSupport]: unexpected data at position %d in ", i);
// 			perm_print(MAXN-2, p, 0);
// 			erri(-4);
// 		}
// #endif
    int i;
    for (i = 0; i < n && (p[i] == i); i++)
      ;
    return i;
// #endif
  }


  static boolean perm_isId(int n, byte[] p)
    /*
     * Return TRUE is p acts trivially on 0..(n-1), and return FALSE otherwise
     */ {
// #ifdef HARDCODE_MAXN_22
// 	return (((unsigned long long*)p)[0] == 0x0706050403020100)
// 			&& (((unsigned long long*)p)[1] == 0x0f0e0d0c0b0a0908)
// 			&& (((unsigned int*)p)[4] == 0x13121110);
// #else
// #ifdef DOTEST
// 	for (i=n; i<MAXN-2; i++)
// 		if (p[i] != -1) {
// 			printf("BAD PERMUTATION [perm_isId]: unexpected data at position %d in ", i);
// 			perm_print(MAXN-2, p, 0);
// 			erri(-4);
// 		}
// #endif
    for (int i = 0; i < n; i++)
      if (p[i] != i)
        return false;
    return true;
// #endif
  }


  static int perm_cmp(int n, byte[] p, byte[] q)
    /*
     * Lexicographically compare the permutations p and q (viewed as arrays).
     *
     * Return value: <0 if p[i] < q[i] and p[j] = p[j] for j<i
     *               0  if A = B
     *               >0 if p[i] > q[i] and p[j] = q[j] for j<i
     */ {
// #ifdef HARDCODE_MAXN_22
// 	return (((unsigned long long*)p)[0] != ((unsigned long long*)q)[0])
// 			|| (((unsigned long long*)p)[1] != ((unsigned long long*)q)[1])
// 			|| (((unsigned int*)p)[4] != ((unsigned int*)q)[4]);
// #else
// 	elt  i, d;
//
// #ifdef DOTEST
// 	for (i=n; i<MAXN-2; i++) {
// 		if (p[i] != -1) {
// 			printf("BAD PERMUTATION [perm_cmp]: unexpected data at position %d in ", i);
// 			perm_print(MAXN-2, p, 0);
// 			erri(-4);
// 		}
// 		if (q[i] != -1) {
// 			printf("BAD PERMUTATION [perm_cmp]: unexpected data at position %d in ", i);
// 			perm_print(MAXN-2, q, 0);
// 			erri(-4);
// 		}
// 	}
// #endif
    for (int i = 0; i < n; i++) {
      int d;
      if ((d = p[i] - q[i]) != 0)
        return d;
    }
    return 0;
// #endif
  }


  /*
   * Return an integer in {0..n!-1} that uniquely identifies the permutation p.
   */
  static long perm_toInteger(int n, byte[] p) {
    long k, m;
    int i;

    k = 0;
    m = 1;
    byte[] pos = ByteUtils.identity(new byte[n]);
    byte[] elems = ByteUtils.identity(new byte[n]);
    for (i = 0; i < n - 1; i++) {
      k += m * pos[p[i]];
      m *= n - i;
      pos[elems[n - i - 1]] = pos[p[i]];
      elems[pos[p[i]]] = elems[n - i - 1];
    }
    return k;
  }


// #endif /* PERMUTATION_H_ */

// void perm_print(elt n, permutation p, elt offset)
// /*
//  * TEST FUNCTION:  Print p (in array notation).
//  */
// {
// 	elt  i;

// 	printf("%d", p[0]+offset);
// 	for (i=1; i<n; i++)
// 		printf(", %d", p[i]+offset);
// 	printf("\n");
// }


  /*
   * Advance p to the next permutation fixing the levels
   * {0..lev[1]-1},..,{lev[nLev-2]..lev[nLev-1]-1}.
   *
   * Return value: 1 if success; 0 if no further permutation exists.
   */
  static boolean perm_next(int nLev, int[] lev, byte[] p) {
    int lpos, thislev, i, j;

    boolean tt = false;  /* initialisation value unused; just to prevent warning */
    lpos = 0;
    thislev = 0;
    while (true) {
      /* advance to next non-trivial level */
      while (lev[lpos] == thislev + 1) {
        thislev++;
        if (++lpos == nLev) {
          return false;
        }
      }
      for (i = thislev + 1; i < lev[lpos] && !(tt = (p[i - 1] < p[i])); i++) {
      }
      if (!tt) {
        /* set current level to id & advance to next level */
        for (i = thislev; i < lev[lpos]; i++) {
          p[i] = (byte) i;
        }
        thislev = lev[lpos];
        if (++lpos == nLev) {
          return false;
        }
        continue;
      }
      for (j = thislev; !(p[j] < p[i]); j++) {
      }
      /* swap entries i and j */
      byte t = p[i];
      p[i] = p[j];
      p[j] = t;
      /* reverse level up to position i-1 */
      i--;
      j = thislev;
      while (j < i) {
        t = p[i];
        p[i] = p[j];
        p[j] = t;
        i--;
        j++;
      }
      break;
    }
    return true;
  }
}
