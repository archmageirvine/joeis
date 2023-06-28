package irvine.oeis.a064;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A064297 Triangle of self-avoiding rook paths joining opposite corners of n X k board.
 * @author Ruben Gr&oslash;nning Spaans
 * @author Sean A. Irvine (Java port)
 */
public class A064297 extends Sequence1 {

  // Cf. https://github.com/stubbscroll/OEIS/blob/master/A064297.c

  private static final int MAX = 32;
  private static final int[] SWAP = {0, 4, 8, 12, 1, 5, 9, 13, 2, 6, 10, 14, 3, 7, 11, 15};
  private static final long MAX_PRIME = 4611686018427387847L; // largest 62 bit prime

  private final long[][][] mDp = new long[2][MAX][MAX];

  /* calculate the number of states (and partial states) for rank/unrank */
  /* the sequence dp[1][0][n] is actually A002026 */
  {
    mDp[0][0][0] = 1;
    for (int i = 0; i < MAX - 1; ++i) {
      for (int k = 0; k < 2; ++k) {
        for (int j = 0; j < MAX - 1; ++j) {
          if (mDp[k][j][i] != 0) {
            mDp[k][j][i + 1] += mDp[k][j][i];
            if (k == 0 && j == 0) {
              mDp[1][j][i + 1] += mDp[k][j][i];
            }
            if (j != 0) {
              mDp[k][j - 1][i + 1] += mDp[k][j][i];
            }
            mDp[k][j + 1][i + 1] += mDp[k][j][i];
          }
        }
      }
    }
  }

  /* convert from integer rank to representation in linear time */
  private long unrank(int i, long r) {
    int j = 0;
    long mask = 0;
    while (i-- != 0) {
      long c0 = mDp[1][j][i];
      if (r < c0) {
        mask <<= 2;
      } else {
        r -= c0;
        c0 = (j == 0) ? mDp[0][0][i] : 0;
        if (r < c0) {
          mask = (mask << 2) + 1;
          while (i-- != 0) {
            c0 = mDp[0][j][i];
            if (r < c0) {
              mask <<= 2;
            } else {
              r -= c0;
              c0 = (j != 0) ? mDp[0][j - 1][i] : 0;
              if (r < c0) {
                mask = (mask << 2) + 2;
                --j;
              } else {
                r -= c0;
                mask = (mask << 2) + 3;
                ++j;
              }
            }
          }
          return mask;
        } else {
          r -= c0;
          c0 = (j != 0) ? mDp[1][j - 1][i] : 0;
          if (r < c0) {
            mask = (mask << 2) + 2;
            --j;
          } else {
            r -= c0;
            mask = (mask << 2) + 3;
            ++j;
          }
        }
      }
    }
    return mask;
  }

  /* convert from representation to integer rank in linear time */
  private long rank(int i, final long mask) {
    int j = 0;
    long r = 0;
    while (i-- != 0) {
      int cur = (int) ((mask >>> (i << 1)) & 3);
      if (cur == 2) {
        r += mDp[1][j][i];
        --j;
      } else if (cur == 3) {
        r += mDp[1][j][i] + (j != 0 ? mDp[1][j - 1][i] : mDp[0][0][i]);
        ++j;
      } else if (cur != 0) {
        r += mDp[1][j][i];
        while (i-- != 0) {
          cur = (int) ((mask >>> (i << 1)) & 3);
          if (cur == 2) {
            r += mDp[0][j][i];
            --j;
          } else if (cur == 3) {
            r += mDp[0][j][i];
            if (j != 0) {
              r += mDp[0][j - 1][i];
            }
            ++j;
          }
        }
        return r;
      }
    }
    return r;
  }

  private void add(final long[] current, final int ix, final long c, final long mod) {
    current[ix] += c;
    if (current[ix] >= mod) {
      current[ix] -= mod;
    }
  }

  private long calc(final int n, final int m, final long mod) {
    final int num = (int) mDp[1][0][n + 1];
    long[] prev = new long[num];
    long[] cur = new long[num];
    int k, l;
    final int w = n + 1;
    long c, r = 0;
    /* force first edge to go down. the rest of the paths can be obtained by flipping
     along the diagonal. hence, count the first case only and multiply by 2 */
    prev[(int) rank(w, 1)] = 1;
    if (m != n) {
      prev[(int) rank(w, 4)] = 1;  /* cannot use symmetry if non-square */
    }
    for (int i = 0; i < m; ++i) {
      for (int j = 0; j < n; ++j) {
        if (i == 0 && j == 0) {
          continue;
        } else if (i < m - 1 && j < n - 1) {
          /* regular cell */
          for (int z = 0; z < num; ++z) {
            if ((c = prev[z]) != 0) {
              final long mask = unrank(w, z);
              final int left = (int) ((mask >>> (j << 1)) & 3);
              final int up = (int) ((mask >>> ((j << 1) + 2)) & 3);
              if (left == 3 && up == 2) {
                /* join, easy case: 32 => 00 */
                add(cur, (int) rank(w, mask & (~(15L << (j << 1)))), c, mod);
              } else if (left == 2 && up == 2) {
                /* join 22: find mate of right 2, change it from 3 to 2 */
                for (k = j + 2, l = 1; ; ++k) {
                  final int o = (int) ((mask >>> (k << 1)) & 3);
                  if (o == 2) {
                    ++l;
                  } else if (o == 3) {
                    if (--l == 0) {
                      break;
                    }
                  }
                }
                long newmask = mask & (~(15L << (j << 1)));
                newmask = newmask ^ (1L << (k << 1));
                add(cur, (int) rank(w, newmask), c, mod);
              } else if (left == 3 && up == 3) {
                /* join 33: find mate of left 3, change it from 2 to 3 */
                for (k = j - 1, l = 1; ; --k) {
                  final int o = (int) ((mask >>> (k << 1)) & 3);
                  if (o == 3) {
                    ++l;
                  } else if (o == 2) {
                    if (--l == 0) {
                      break;
                    }
                  }
                }
                long newmask = mask & (~(15L << (j << 1)));
                newmask = newmask ^ (1L << (k << 1));
                add(cur, (int) rank(w, newmask), c, mod);
              } else if (left == 1 && up != 0) {
                /* we have 12, find up's mate, change it from 3 to 1 */
                for (k = j + 2, l = 1; ; ++k) {
                  final int o = (int) ((mask >>> (k << 1)) & 3);
                  if (o == 2) {
                    ++l;
                  } else if (o == 3) {
                    if (--l == 0) {
                      break;
                    }
                  }
                }
                add(cur, (int) rank(w, mask & (~(15L << (j << 1))) & (~(2L << (k << 1)))), c, mod);
              } else if (left != 0 && up == 1) {
                /* we have 31, find left's mate, change it from 2 to 1 */
                for (k = j - 1, l = 1; ; --k) {
                  final int o = (int) ((mask >>> (k << 1)) & 3);
                  if (o == 3) {
                    ++l;
                  } else if (o == 2) {
                    if (--l == 0) {
                      break;
                    }
                  }
                }
                long newmask = mask & (~(15L << (j << 1)));
                newmask = newmask ^ (3L << (k << 1));
                add(cur, (int) rank(w, newmask), c, mod);
              } else if (left != 0) { /* extend single edge, case 1 */
                /* extend down: no change in mask */
                add(cur, z, c, mod);
                /* extend to the right: x0 becomes 0x, but only if next cell isn't 2 */
                final int look = (int) ((mask >>> ((j << 1) + 4)) & 3);
                if (left != 2 || look != 3) {
                  add(cur, (int) rank(w, (mask & (~(15L << (j << 1)))) | ((long) SWAP[left] << (j << 1))), c, mod);
                }
              } else if (up != 0) { /* extend single edge, case 2 */
                /* extend down: 0x becomes x0 */
                add(cur, (int) rank(w, (mask & (~(15L << (j << 1)))) | ((long) SWAP[up << 2] << (j << 1))), c, mod);
                /* extend to the right: no change in mask */
                final int look = (int) ((mask >>> ((j << 1) + 4)) & 3);
                if (up != 2 || look != 3) {
                  add(cur, z, c, mod);
                }
              } else { /* no edge */
                /* place nothing */
                add(cur, z, c, mod);
                /* place 23 */
                add(cur, (int) rank(w, mask | (14L << (j << 1))), c, mod);
              }
            }
          }
        } else if (i < m - 1 && j == n - 1) {
          /* right column: edges cannot go to the right, mask<<2 */
          for (int z = 0; z < num; ++z) {
            if ((c = prev[z]) != 0) {
              final long mask = unrank(w, z);
              final int left = (int) ((mask >>> (j << 1)) & 3);
              final int up = (int) ((mask >>> ((j << 1) + 2)) & 3);
              if (left == 3 && up == 3) {
                /* join 33: find mate of left 3, change it from 2 to 3 */
                for (k = j - 1, l = 1; ; --k) {
                  final int o = (int) ((mask >>> (k << 1)) & 3);
                  if (o == 3) {
                    ++l;
                  } else if (o == 2) {
                    if (--l == 0) {
                      break;
                    }
                  }
                }
                long newmask = mask & (~(15L << (j << 1)));
                newmask = newmask ^ (1L << (k << 1));
                add(cur, (int) rank(w, newmask << 2), c, mod);
              } else if (left == 1 && up != 0) {
                /* we have 12, find up's mate, change it from 3 to 1 */
                for (k = j + 2, l = 1; ; ++k) {
                  final int o = (int) ((mask >>> (k << 1)) & 3);
                  if (o == 2) {
                    ++l;
                  } else if (o == 3) {
                    if (--l == 0) {
                      break;
                    }
                  }
                }
                add(cur, (int) rank(w, (mask & (~(15L << (j << 1))) & (~(2L << (k << 1)))) << 2), c, mod);
              } else if (left != 0 && up == 1) {
                /* we have 31, find left's mate, change it from 2 to 1 */
                for (k = j - 1, l = 1; ; --k) {
                  final int o = (int) ((mask >>> (k << 1)) & 3);
                  if (o == 3) {
                    ++l;
                  } else if (o == 2) {
                    if (--l == 0) {
                      break;
                    }
                  }
                }
                long newmask = mask & (~(15L << (j << 1)));
                newmask = newmask ^ (3L << (k << 1));
                add(cur, (int) rank(w, newmask << 2), c, mod);
              } else if (left != 0) { /* extend single edge, case 1 */
                /* extend down */
                final long newmask = mask << 2;
                add(cur, (int) rank(w, newmask), c, mod);
              } else if (up != 0) { /* extend single edge, case 2 */
                /* extend down: 0x becomes x0 */
                add(cur, (int) rank(w, ((mask & (~(15L << (j << 1)))) | ((long) SWAP[up << 2] << (j << 1))) << 2), c, mod);
              } else { /* no edge */
                /* place nothing */
                final long newmask = mask << 2;
                add(cur, (int) rank(w, newmask), c, mod);
              }
            }
          }
        } else if (i == m - 1 && j < n - 1) {
          /* lower row edges cannot go down */
          for (int z = 0; z < num; ++z) {
            if ((c = prev[z]) != 0) {
              final long mask = unrank(w, z);
              final int left = (int) ((mask >>> (j << 1)) & 3);
              final int up = (int) ((mask >>> ((j << 1) + 2)) & 3);
              if (left == 3 && up == 2) {
                /* join, easy case: 32 => 00 */
                add(cur, (int) rank(w, mask & (~(15L << (j << 1)))), c, mod);
              } else if (left == 2 && up == 2) {
                /* join 22: find mate of right 2, change it from 3 to 2 */
                for (k = j + 2, l = 1; ; ++k) {
                  final int o = (int) ((mask >>> (k << 1)) & 3);
                  if (o == 2) {
                    ++l;
                  } else if (o == 3) {
                    if (--l == 0) {
                      break;
                    }
                  }
                }
                long newmask = mask & (~(15L << (j << 1)));
                newmask = newmask ^ (1L << (k << 1));
                add(cur, (int) rank(w, newmask), c, mod);
              } else if (left == 3 && up == 3) {
                /* join 33: find mate of left 3, change it from 2 to 3 */
                for (k = j - 1, l = 1; ; --k) {
                  final int o = (int) ((mask >>> (k << 1)) & 3);
                  if (o == 3) {
                    ++l;
                  } else if (o == 2) {
                    if (--l == 0) {
                      break;
                    }
                  }
                }
                long newmask = mask & (~(15L << (j << 1)));
                newmask = newmask ^ (1L << (k << 1));
                add(cur, (int) rank(w, newmask), c, mod);
              } else if (left == 1 && up != 0) {
                /* we have 12, find up's mate, change it from 3 to 1 */
                for (k = j + 2, l = 1; ; ++k) {
                  final int o = (int) ((mask >>> (k << 1)) & 3);
                  if (o == 2) {
                    ++l;
                  } else if (o == 3) {
                    if (--l == 0) {
                      break;
                    }
                  }
                }
                add(cur, (int) rank(w, mask & (~(15L << (j << 1))) & (~(2L << (k << 1)))), c, mod);
              } else if (left != 0 && up == 1) {
                /* we have 31, find left's mate, change it from 2 to 1 */
                for (k = j - 1, l = 1; ; --k) {
                  final int o = (int) ((mask >>> (k << 1)) & 3);
                  if (o == 3) {
                    ++l;
                  } else if (o == 2) {
                    if (--l == 0) {
                      break;
                    }
                  }
                }
                long newmask = mask & (~(15L << (j << 1)));
                newmask = newmask ^ (3L << (k << 1));
                add(cur, (int) rank(w, newmask), c, mod);
              } else if (left != 0) { /* extend single edge, case 1 */
                /* extend to the right: x0 becomes 0x, but only if next cell isn't 2 */
                final int look = (int) ((mask >>> ((j << 1) + 4)) & 3);
                if (left != 2 || look != 3) {
                  add(cur, (int) rank(w, (mask & (~(15L << (j << 1)))) | ((long) SWAP[left] << (j << 1))), c, mod);
                }
              } else if (up != 0) { /* extend single edge, case 2 */
                /* extend to the right: no change in mask */
                final int look = (int) ((mask >>> ((j << 1) + 4)) & 3);
                if (up != 2 || look != 3) {
                  add(cur, z, c, mod);
                }
              } else { /* no edge */
                /* place nothing */
                add(cur, z, c, mod);
              }
            }
          }
        } else if (i == m - 1 && j == n - 1) {
          /* lower right corner, just take the sum */
          for (int z = 0; z < num; ++z) {
            if ((c = prev[z]) != 0) {
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
        Arrays.fill(cur, 0);
      }
    }
    if (n == m) {
      r = (r * 2) % mod;
    }
    return r;
  }


  /* m,n: dimensions of rectangle with n*m internal cells */
  /* when solving A007764, invoke with n+1,n+1 */
  protected Z solve(int n, int m) {
    final long[] res = new long[500];
    final long[] prim = new long[500];
    long prime = MAX_PRIME;
    int o = 0;
    /* upper bound proved by Bousquet-Melou et al */
    /* TODO find a better upper bound, it will improve run time by a lot */
    final double bound = Math.pow(1.782, (n + 1) * (m + 1));
    if (n > m) {
      final int t = n;
      n = m;
      m = t;
    }
    if (n == 1) {
      return Z.ONE;
    }
    if (n >= MAX - 2) {
      throw new UnsupportedOperationException("grid is too large");
    }
    Z mul = Z.ONE;
    /* require n<=m, frontier width is n+1 */
    do {
      while (true) {
        final int tries = n < 10 ? 30 : 300;
        /* we want to be REALLY sure */
        if (Z.valueOf(prime).isProbablePrime(tries)) {
          break;
        }
        prime -= 2;
      }
      res[o] = calc(n, m, prime);
      prim[o++] = prime;
      mul = mul.multiply(prime);
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
