package irvine.oeis.a064;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A046995.
 * @author Ruben Gr&oslash;nning Spaans
 * @author Sean A. Irvine (Java port)
 */
public class A064297 extends Sequence1 {

  // Cf. https://github.com/stubbscroll/OEIS/blob/master/A064297.c

/* define the number of bits! 64-bits compared to 16-bits is expected
   to be 4 times faster, using 4 times as much memory */
//#define BITS64

  private static final int MAX = 32;
  private final long[][][] dp = new long[2][MAX][MAX];

  /* calculate the number of states (and partial states) for rank/unrank */
  /* the sequence dp[1][0][n] is actually A002026 */
  {
    int i, j, k;
    for (k = 0; k < 2; k++) {
      for (i = 0; i < MAX; i++) {
        for (j = 0; j < MAX; j++) {
          dp[k][i][j] = 0;
        }
      }
    }
    dp[0][0][0] = 1;
    for (i = 0; i < MAX - 1; i++) {
      for (k = 0; k < 2; k++) {
        for (j = 0; j < MAX - 1; j++) {
          if (dp[k][j][i] != 0) {
            dp[k][j][i + 1] += dp[k][j][i];
            if (k == 0 && j == 0) {
              dp[1][j][i + 1] += dp[k][j][i];
            }
            if (j != 0) {
              dp[k][j - 1][i + 1] += dp[k][j][i];
            }
            if (j < MAX - 1) {
              dp[k][j + 1][i + 1] += dp[k][j][i];
            }
          }
        }
      }
    }
  }

  /* convert from integer rank to representation in linear time */
  long unrank(int i, long r) {
    int j = 0;
    long c0, mask = 0;
    while (i-- != 0) {
      c0 = dp[1][j][i];
      if (r < c0) {
        mask <<= 2;
      } else {
        r -= c0;
        c0 = (j == 0) ? dp[0][0][i] : 0;
        if (r < c0) {
          mask = (mask << 2) + 1;
          while (i-- != 0) {
            c0 = dp[0][j][i];
            if (r < c0) {
              mask <<= 2;
            } else {
              r -= c0;
              c0 = (j != 0) ? dp[0][j - 1][i] : 0;
              if (r < c0) {
                mask = (mask << 2) + 2;
                j--;
              } else {
                r -= c0;
                mask = (mask << 2) + 3;
                j++;
              }
            }
          }
          return mask;
        } else {
          r -= c0;
          c0 = (j != 0) ? dp[1][j - 1][i] : 0;
          if (r < c0) {
            mask = (mask << 2) + 2;
            j--;
          } else {
            r -= c0;
            mask = (mask << 2) + 3;
            j++;
          }
        }
      }
    }
    return mask;
  }

  /* convert from representation to integer rank in linear time */
  long rank(int i, long mask) {
    int j = 0, cur;
    long r = 0;
    while (i-- != 0) {
      cur = (int) ((mask >> (i << 1)) & 3);
      if (cur == 2) {
        r += dp[1][j][i];
        j--;
      } else if (cur == 3) {
        r += dp[1][j][i] + (j != 0 ? dp[1][j - 1][i] : dp[0][0][i]);
        j++;
      } else if (cur != 0) {
        r += dp[1][j][i];
        while (i-- != 0) {
          cur = (int) ((mask >> (i << 1)) & 3);
          if (cur == 2) {
            r += dp[0][j][i];
            j--;
          } else if (cur == 3) {
            r += dp[0][j][i];
            if (j != 0) {
              r += dp[0][j - 1][i];
            }
            j++;
          }
        }
        return r;
      }
    }
    return r;
  }

  private static final int[] SWAP = {0, 4, 8, 12, 1, 5, 9, 13, 2, 6, 10, 14, 3, 7, 11, 15};
  private static final long MAX_PRIME = 4611686018427387847L; // largest 62 bit prime

  long[] prev, cur;

  private void ADD(final int ix, final long c, final long mod) {
    cur[ix] += c;
    if (cur[ix] >= mod) {
      cur[ix] -= mod;
    }
  }


  long calc(int n, int m, long mod) {
    long num = dp[1][0][n + 1], z, mask, nz, newmask;
    int i, j, left, up, k, w = n + 1, l, o, look;
    long c, r = 0;
    // todo handle num > Integer.MAX_VALUE
    //System.out.println("SAI: num=" + num);
    prev = new long[(int) num];
    cur = new long[(int) num];
	/* force first edge to go down. the rest of the paths can be obtained by flipping
	   along the diagonal. hence, count the first case only and multiply by 2 */
    prev[(int) rank(w, 1)] = 1;
    if (m != n) {
      prev[(int) rank(w, 4)] = 1;  /* cannot use symmetry if non-square */
    }
    for (i = 0; i < m; i++) {
      for (j = 0; j < n; j++) {
        if (i == 0 && j == 0) {
          continue;
        } else if (i < m - 1 && j < n - 1) {
          /* regular cell */
          for (z = 0; z < num; z++) {
            if ((c = prev[(int) z]) != 0) {
              mask = unrank(w, z);
              left = (int) ((mask >> (j << 1)) & 3);
              up = (int) ((mask >> ((j << 1) + 2)) & 3);
              if (left == 3 && up == 2) {
                /* join, easy case: 32 => 00 */
                nz = rank(w, mask & (~(15L << (j << 1))));
                ADD((int) nz, c, mod);
              } else if (left == 2 && up == 2) {
                /* join 22: find mate of right 2, change it from 3 to 2 */
                for (k = j + 2, l = 1; ; k++) {
                  o = (int) ((mask >> (k << 1)) & 3);
                  if (o == 2) {
                    l++;
                  } else if (o == 3) {
                    l--;
                    if (l == 0) {
                      break;
                    }
                  }
                }
                newmask = mask & (~(15L << (j << 1)));
                newmask = newmask ^ (1L << (k << 1));
                nz = rank(w, newmask);
                ADD((int) nz, c, mod);
              } else if (left == 3 && up == 3) {
                /* join 33: find mate of left 3, change it from 2 to 3 */
                for (k = j - 1, l = 1; ; k--) {
                  o = (int) ((mask >> (k << 1)) & 3);
                  if (o == 3) {
                    l++;
                  } else if (o == 2) {
                    l--;
                    if (l == 0) {
                      break;
                    }
                  }
                }
                newmask = mask & (~(15L << (j << 1)));
                newmask = newmask ^ (1L << (k << 1));
                nz = rank(w, newmask);
                ADD((int) nz, c, mod);
              } else if (left == 1 && up != 0) {
                /* we have 12, find up's mate, change it from 3 to 1 */
                for (k = j + 2, l = 1; ; k++) {
                  o = (int) ((mask >> (k << 1)) & 3);
                  if (o == 2) {
                    l++;
                  } else if (o == 3) {
                    l--;
                    if (l == 0) {
                      break;
                    }
                  }
                }
                nz = rank(w, mask & (~(15L << (j << 1))) & (~(2L << (k << 1))));
                ADD((int) nz, c, mod);
              } else if (left != 0 && up == 1) {
                /* we have 31, find left's mate, change it from 2 to 1 */
                for (k = j - 1, l = 1; ; k--) {
                  o = (int) ((mask >> (k << 1)) & 3);
                  if (o == 3) {
                    l++;
                  } else if (o == 2) {
                    l--;
                    if (l == 0) {
                      break;
                    }
                  }
                }
                newmask = mask & (~(15L << (j << 1)));
                newmask = newmask ^ (3L << (k << 1));
                nz = rank(w, newmask);
                ADD((int) nz, c, mod);
              } else if (left != 0) { /* extend single edge, case 1 */
                /* extend down: no change in mask */
                ADD((int) z, c, mod);
					/* extend to the right: x0 becomes 0x, but only if next
					   cell isn't 2 */
                look = (int) ((mask >> ((j << 1) + 4)) & 3);
                if (left != 2 || look != 3) {
                  nz = rank(w, (mask & (~(15L << (j << 1)))) | ((long) SWAP[left] << (j << 1)));
                  ADD((int) nz, c, mod);
                }
              } else if (up != 0) { /* extend single edge, case 2 */
                /* extend down: 0x becomes x0 */
                nz = rank(w, (mask & (~(15L << (j << 1)))) | ((long) SWAP[up << 2] << (j << 1)));
                ADD((int) nz, c, mod);
                /* extend to the right: no change in mask */
                look = (int) ((mask >> ((j << 1) + 4)) & 3);
                if (up != 2 || look != 3) {
                  ADD((int) z, c, mod);
                }
              } else if ((up | left) == 0) { /* no edge */
                /* place nothing */
                ADD((int) z, c, mod);
                /* place 23 */
                nz = rank(w, mask | (14L << (j << 1)));
                ADD((int) nz, c, mod);
              } else {
                throw new RuntimeException("error uncatched regular " + left + " " + up);
              }
            }
          }
        } else if (i < m - 1 && j == n - 1) {
          /* right column: edges cannot go to the right, mask<<2 */
          for (z = 0; z < num; z++) {
            if ((c = prev[(int) z]) != 0) {
              mask = unrank(w, z);
              left = (int) ((mask >> (j << 1)) & 3);
              up = (int) ((mask >> ((j << 1) + 2)) & 3);
              if (left == 3 && up == 3) {
                /* join 33: find mate of left 3, change it from 2 to 3 */
                for (k = j - 1, l = 1; ; k--) {
                  o = (int) ((mask >> (k << 1)) & 3);
                  if (o == 3) {
                    l++;
                  } else if (o == 2) {
                    l--;
                    if (l == 0) {
                      break;
                    }
                  }
                }
                newmask = mask & (~(15L << (j << 1)));
                newmask = newmask ^ (1L << (k << 1));
                nz = rank(w, newmask << 2);
                ADD((int) nz, c, mod);
              } else if (left == 1 && up != 0) {
                /* we have 12, find up's mate, change it from 3 to 1 */
                for (k = j + 2, l = 1; ; k++) {
                  o = (int) ((mask >> (k << 1)) & 3);
                  if (o == 2) {
                    l++;
                  } else if (o == 3) {
                    l--;
                    if (l == 0) {
                      break;
                    }
                  }
                }
                nz = rank(w, (mask & (~(15L << (j << 1))) & (~(2L << (k << 1)))) << 2);
                ADD((int) nz, c, mod);
              } else if (left != 0 && up == 1) {
                /* we have 31, find left's mate, change it from 2 to 1 */
                for (k = j - 1, l = 1; ; k--) {
                  o = (int) ((mask >> (k << 1)) & 3);
                  if (o == 3) {
                    l++;
                  } else if (o == 2) {
                    l--;
                    if (l == 0) {
                      break;
                    }
                  }
                }
                newmask = mask & (~(15L << (j << 1)));
                newmask = newmask ^ (3L << (k << 1));
                nz = rank(w, newmask << 2);
                ADD((int) nz, c, mod);
              } else if (left != 0) { /* extend single edge, case 1 */
                /* extend down */
                newmask = mask << 2;
                nz = rank(w, newmask);
                ADD((int) nz, c, mod);
              } else if (up != 0) { /* extend single edge, case 2 */
                /* extend down: 0x becomes x0 */
                nz = rank(w, ((mask & (~(15L << (j << 1)))) | ((long) SWAP[up << 2] << (j << 1))) << 2);
                ADD((int) nz, c, mod);
              } else if ((up | left) == 0) { /* no edge */
                /* place nothing */
                newmask = mask << 2;
                nz = rank(w, newmask);
                ADD((int) nz, c, mod);
              } else {
                throw new RuntimeException("error uncatched regular " + left + " " + up);
              }
            }
          }
        } else if (i == m - 1 && j < n - 1) {
          /* lower row_ edges cannot go down */
          for (z = 0; z < num; z++) {
            if ((c = prev[(int) z]) != 0) {
              mask = unrank(w, z);
              left = (int) ((mask >> (j << 1)) & 3);
              up = (int) ((mask >> ((j << 1) + 2)) & 3);
              if (left == 3 && up == 2) {
                /* join, easy case: 32 => 00 */
                nz = rank(w, mask & (~(15L << (j << 1))));
                ADD((int) nz, c, mod);
              } else if (left == 2 && up == 2) {
                /* join 22: find mate of right 2, change it from 3 to 2 */
                for (k = j + 2, l = 1; ; k++) {
                  o = (int) ((mask >> (k << 1)) & 3);
                  if (o == 2) {
                    l++;
                  } else if (o == 3) {
                    l--;
                    if (l == 0) {
                      break;
                    }
                  }
                }
                newmask = mask & (~(15L << (j << 1)));
                newmask = newmask ^ (1L << (k << 1));
                nz = rank(w, newmask);
                ADD((int) nz, c, mod);
              } else if (left == 3 && up == 3) {
                /* join 33: find mate of left 3, change it from 2 to 3 */
                for (k = j - 1, l = 1; ; k--) {
                  o = (int) ((mask >> (k << 1)) & 3);
                  if (o == 3) {
                    l++;
                  } else if (o == 2) {
                    l--;
                    if (l == 0) {
                      break;
                    }
                  }
                }
                newmask = mask & (~(15L << (j << 1)));
                newmask = newmask ^ (1L << (k << 1));
                nz = rank(w, newmask);
                ADD((int) nz, c, mod);
              } else if (left == 1 && up != 0) {
                /* we have 12, find up's mate, change it from 3 to 1 */
                for (k = j + 2, l = 1; ; k++) {
                  o = (int) ((mask >> (k << 1)) & 3);
                  if (o == 2) {
                    l++;
                  } else if (o == 3) {
                    l--;
                    if (l == 0) {
                      break;
                    }
                  }
                }
                nz = rank(w, mask & (~(15L << (j << 1))) & (~(2L << (k << 1))));
                ADD((int) nz, c, mod);
              } else if (left != 0 && up == 1) {
                /* we have 31, find left's mate, change it from 2 to 1 */
                for (k = j - 1, l = 1; ; k--) {
                  o = (int) ((mask >> (k << 1)) & 3);
                  if (o == 3) {
                    l++;
                  } else if (o == 2) {
                    l--;
                    if (l == 0) {
                      break;
                    }
                  }
                }
                newmask = mask & (~(15L << (j << 1)));
                newmask = newmask ^ (3L << (k << 1));
                nz = rank(w, newmask);
                ADD((int) nz, c, mod);
              } else if (left != 0) { /* extend single edge, case 1 */
					/* extend to the right: x0 becomes 0x, but only if next
					   cell isn't 2 */
                look = (int) ((mask >> ((j << 1) + 4)) & 3);
                if (left != 2 || look != 3) {
                  nz = rank(w, (mask & (~(15L << (j << 1)))) | ((long) SWAP[left] << (j << 1)));
                  ADD((int) nz, c, mod);
                }
              } else if (up != 0) { /* extend single edge, case 2 */
                /* extend to the right: no change in mask */
                look = (int) ((mask >> ((j << 1) + 4)) & 3);
                if (up != 2 || look != 3) {
                  ADD((int) z, c, mod);
                }
              } else if ((up | left) == 0) { /* no edge */
                /* place nothing */
                ADD((int) z, c, mod);
              } else {
                throw new RuntimeException("error uncatched regular " + left + " " + up);
              }
            }
          }
        } else if (i == m - 1 && j == n - 1) {
          /* lower right corner, just take the sum */
          for (z = 0; z < num; z++) {
            if ((c = prev[(int) z]) != 0) {
              r += c;
              if (r >= mod) {
                r -= mod;
              }
            }
          }
        }
        final long[] t = prev;
        prev = cur;
        cur = t;
        //memset(cur,0,sizeof(long)*num);
        Arrays.fill(cur, 0);
      }
    }
//    free(cur);
//    free(prev);
    if (n == m) {
      r = (r * 2) % mod;
    }
    return r;
  }

  /* solve a set of modular equations using chinese remainder theorem */
/* n: number of equations of the form
   x = a[i] mod b[i] */
//  void chinese(int n,long *a,long *b,Z x) {
//    int i;
//    Z N,temp,t2,n2,bi;
//    mpz_init(temp);
//    mpz_init(n2);
//    mpz_init(bi);
//    mpz_init(t2);
//    mpz_set_si(x,0);
//    mpz_init_set_si(N,1);
//    for(i=0;i<n;i++) {
//      mpz_set_long(temp,b[i]);
//      mpz_mul(N,N,temp);
//    }
//    for(i=0;i<n;i++) {
//      mpz_set_long(temp,a[i]);
//      mpz_set_long(bi,b[i]);
//      mpz_tdiv_q(n2,N,bi);
//      mpz_mul(temp,temp,n2);
//      mpz_tdiv_r(t2,n2,bi);
//      mpz_invert(t2,t2,bi);
//      mpz_mul(temp,temp,t2);
//      mpz_add(x,x,temp);
//      mpz_tdiv_r(x,x,N);
//    }
//    mpz_clear(N);
//    mpz_clear(temp);
//    mpz_clear(n2);
//    mpz_clear(bi);
//    mpz_clear(t2);
//  }

  static long[] res = new long[500], prim = new long[500];

  /* m,n: dimensions of rectangle with n*m internal cells */
  /* when solving A007764, invoke with n+1,n+1 */
  Z solve(int n, int m) {
    long prime = MAX_PRIME;
    int o = 0, tries;
    /* upper bound proved by Bousquet-Melou et al */
    /* TODO find a better upper bound, it will improve run time by a lot */
    double bound = Math.pow(1.782, (n + 1) * (m + 1));
    if (n > m) {
      final int t = n;
      n = m;
      m = t;
    }
    if (n == 1) {
      return Z.ONE;
    }
    if (n >= MAX - 2) {
      throw new RuntimeException("grid is too large");
    }
    Z mul = Z.ONE;
    Z temp;
    /* require n<=m, frontier width is n+1 */
    do {
      while (true) {
        if (n < 10) {
          tries = 30;
        } else {
          tries = 200;
        }
        temp = Z.valueOf(prime);
        /* we want to be REALLY sure */
        if (temp.isProbablePrime(tries)) {
          break;
        }
        prime -= 2;
      }
      res[o] = calc(n, m, prime);
      prim[o++] = prime;
      mul = mul.multiply(temp);
      /* if mul > upper bound, then break */
      prime -= 2;
    } while (mul.doubleValue() < bound);
    /* glue together result with chinese remainder theorem */
    final Z[] rr = new Z[o];
    final Z[] pp = new Z[o];
    for (int k = 0; k < o; ++k) {
      rr[k] = Z.valueOf(res[k]);
      pp[k] = Z.valueOf(prim[k]);
    }
    return ZUtils.chineseRemainderTheorem(rr, pp);
  }

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return solve(mN + 1, mM + 1);
  }
}
