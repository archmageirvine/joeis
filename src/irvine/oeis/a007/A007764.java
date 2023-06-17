package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.util.array.LongDynamicArray;

/**
 * A007764 Number of nonintersecting (or self-avoiding) rook paths joining opposite corners of an n X n grid.
 * @author Ruben Spaans (C)
 * @author Sean A. Irvine (Java port)
 */
public class A007764 extends AbstractSequence {

  /** Construct the sequence. */
  public A007764() {
    super(1);
  }

  /*
   * The algorithm here is essentially the same as the C version, but
   * with a few notable differences.  The original does computations
   * modulo a prime, and the results from multiple runs can then later
   * be combined with the CRT to get the final here.  Here instead we
   * simply use Z arithmetic.  This might be somewhat slower, but avoids
   * the CRT complication.
   *
   * A Java threading mechanism is used in place of pthread.
   *
   * Some of the diagnostics of the original have been disabled to give
   * clean output.  Variables and methods have been renamed to match the
   * conventions of this project.
   *
   * The original C algorithm description follows.
   */

  /* Efficient and parallel version of a program that calculates
   * terms of the sequence A007764 (and related sequences such as
   * A064297). This program is stand-alone. Warning, the code is written entirely
   * with optimization in mind, don't expect it to be easy to read and
   * understand. Programmed by Ruben Spaans in september-october 2012.
   *
   * This program was used to calculate n=22, 23, 24 (as well as verifying
   * all lower n correctly), it took around a CPU-month on a machine with
   * 4 eight-core CPUs and 1 TB RAM (huge thanks to Rune Jensen and Q2S at
   * the Norwegian University of Science and Technology for letting me run
   * the program on their computer) (n=24 required around 700 GB).
   * this program only calculates the answer modulo a large prime (just
   * below 2^63). Enough runs were done so that the product of all
   * primes used exceeded a guaranteed upper bound for the answer, then
   * CRT was used to obtain the final answer. (The CRT bit was done with
   * an external program). See the bottom of this file to see how to use the
   * program.
   *
   * A paper was under preparation, but has been on hold for several years
   * (as of september 2014). With luck, it might see the face of the earth.
   * don't hold your breath.
   */

  /*
   * Find the number of simple paths along the edges of an n*n grid between the
   * opposite corners.
   * equivalently: find the number of simple paths along the cells of an
   * (n+1)*(n+1) grid, from cell (0, 0) to cell (n,n). cells are 4-connected.
   *
   * Algorithm: dynamic programming. state representation is the same as in
   * M. Bousquet-Melou, A. J. Guttmann and I. Jensen:
   * "Self-avoiding walks crossing a square". when scanning cells row by row
   * from left to right, we have a frontier between processed and unprocessed
   * cells:
   *
   * ******
   * ****** <- * denotes scanned cells
   * **....    . denotes unscanned cells
   * ......
   *
   * Given a grid of n*n internal cells, the frontier consists of (n+1)
   * cell boundaries. each cell boundary can contain a crossing edge or none.
   * The crossing edge can belong to the path from (0, 0), or it can be an
   * "incoming" or "outgoing" edge belonging to a segment having two ends
   * going through the frontier. Assuming we scan the frontier from left to
   * right, the first loose end belonging to a segment with loose ends is
   * the incoming edge, and the second loose end of the same segment is the
   * outgoing edge. Let's use this encoding: 0=no edge, 1=loose end from
   * upper left, 2=incoming edge, 3=outgoing edge. A base-4 number with (n+1)
   * bits can represent all such boundaries. We can then store all partial
   * states in a hashmap with this base-4 number as a key, and the number of
   * ways to reach this partial state as the value. Notice that we don't need to
   * store the current (x,y)-position in the state, as this is implicitly known
   * via the i,j iteration variables. Whenever we process a given cell we only
   * have two hashmaps simultaneously in memory: the one we read from and the one
   * we write new values to (for the next iteration).
   *
   * We can improve the representation by making a mapping from the base-4 number
   * to integers 0..(m-1) where m is the number of base-4 numbers that represent
   * legal states. Then we can store the values in a regular array and ditch the
   * hashmap. This is implemented in the current version.
   *
   * Further speedup: pthreads with 30 threads (running on a machine with 32
   * physical cores), 22x speedup achieved.
   */

  /* parallel variables */
  /* please let MUTEX be a power of two */
  /* please tune this value to the target machine */
  private static final int MUTEX = 1 << 21;

  private static final int THREADS = Integer.parseInt(System.getProperty("oeis.threads",
    String.valueOf(Runtime.getRuntime().availableProcessors())));

  private static final int MAX = 32;

  private final long[][][] mDP = new long[2][MAX][MAX];
  private final Object[] mMutex = new Object[MUTEX];

  {
    // Calculate the number of states (and partial states) for rank/unrank
    // the sequence mDP[1][0][n] is actually A002026
    mDP[0][0][0] = 1;
    for (int i = 0; i < MAX - 1; ++i) {
      for (int k = 0; k < 2; ++k) {
        for (int j = 0; j < MAX - 1; ++j) {
          if (mDP[k][j][i] != 0) {
            mDP[k][j][i + 1] += mDP[k][j][i];
            if (k == 0 && j == 0) {
              mDP[1][j][i + 1] += mDP[k][j][i];
            }
            if (j != 0) {
              mDP[k][j - 1][i + 1] += mDP[k][j][i];
            }
            mDP[k][j + 1][i + 1] += mDP[k][j][i];
          }
        }
      }
    }

    // Initialize locks for synchronizing on
    for (int k = 0; k < mMutex.length; ++k) {
      mMutex[k] = new Object();
    }
  }

  /* convert from integer rank to representation in linear time */
  private long unrank(int i, long r) {
    int j = 0;
    long mask = 0;
    while (i-- != 0) {
      long c0 = mDP[1][j][i];
      if (r < c0) {
        mask <<= 2;
      } else {
        r -= c0;
        c0 = (j == 0) ? mDP[0][0][i] : 0;
        if (r < c0) {
          mask = (mask << 2) + 1;
          while (i-- != 0) {
            c0 = mDP[0][j][i];
            if (r < c0) {
              mask <<= 2;
            } else {
              r -= c0;
              c0 = (j != 0) ? mDP[0][j - 1][i] : 0;
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
          c0 = (j != 0) ? mDP[1][j - 1][i] : 0;
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
      long cur = (mask >>> (i << 1)) & 3;
      if (cur == 2) {
        r += mDP[1][j--][i];
      } else if (cur == 3) {
        r += mDP[1][j][i] + (j != 0 ? mDP[1][j - 1][i] : mDP[0][0][i]);
        ++j;
      } else if (cur != 0) {
        r += mDP[1][j][i];
        while (i-- != 0) {
          cur = (mask >>> (i << 1)) & 3;
          if (cur == 2) {
            r += mDP[0][j--][i];
          } else if (cur == 3) {
            r += mDP[0][j][i];
            if (j != 0) {
              r += mDP[0][j - 1][i];
            }
            ++j;
          }
        }
        return r;
      }
    }
    return r;
  }

  private final Z[] mPartialAnswers = new Z[64];
  private LongDynamicArray<Z> mPrev;
  private LongDynamicArray<Z> mCur;

  private void add(final long ix, final Z c) {
    synchronized (mMutex[(int) (ix & (MUTEX - 1))]) {
      mCur.set(ix, mCur.get(ix).add(c));
    }
  }

  private static final int[] SWAP = {0, 4, 8, 12, 1, 5, 9, 13, 2, 6, 10, 14, 3, 7, 11, 15};
  private final long[] mPstart = new long[64];
  private final long[] mPend = new long[64];

  private int mGlobalI;
  private int mGlobalJ;
  private int mGlobalN;
  private int mGlobalM;
  private int mGlobalW;

  private final class CountingThread extends Thread {

    private final int mId;

    private CountingThread(final int id) {
      mId = id;
    }

    @Override
    public void run() {
      final int i = mGlobalI;
      final int j = mGlobalJ;
      final int n = mGlobalN;
      final int m = mGlobalM;
      final int w = mGlobalW;
      if (i < m - 1 && j < n - 1) {
        // regular cell
        regularCell(j, w);
      } else if (i < m - 1 && j == n - 1) {
        // right column: edges cannot go to the right, mask<<2
        rightColumn(j, w);
      } else if (i == m - 1 && j < n - 1) {
        // lower row edges cannot go down
        lowerRow(j, w);
      } else if (i == m - 1 && j == n - 1) {
        // lower right corner, just take the sum
        Z r = Z.ZERO;
        for (long z = mPstart[mId]; z < mPend[mId]; ++z) {
          r = r.add(mPrev.get(z));
        }
        mPartialAnswers[mId] = r;
      }
    }

    private void rightColumn(final int j, final int w) {
      for (long z = mPstart[mId]; z < mPend[mId]; ++z) {
        final Z c;
        if ((c = mPrev.get(z)).signum() != 0) {
          final long mask = unrank(w, z);
          final int left = (int) (mask >>> (j << 1)) & 3;
          final int up = (int) (mask >>> ((j << 1) + 2)) & 3;
          if (left == 3 && up == 3) {
            // join 33: find mate of left 3, change it from 2 to 3
            add(rank(w, (getMask(j, mask) ^ (1L << (getK(j, mask) << 1))) << 2), c);
          } else if (left == 1 && up != 0) {
            // we have 12, find up's mate, change it from 3 to 1
            add(rank(w, (getMask(j, mask) & (~(2L << (getK2(j, mask) << 1)))) << 2), c);
          } else if (left != 0 && up == 1) {
            // we have 31, find left's mate, change it from 2 to 1
            add(rank(w, (getMask(j, mask) ^ (3L << (getK(j, mask) << 1))) << 2), c);
          } else if (left != 0) { // extend single edge, case 1
            // extend down
            add(rank(w, mask << 2), c);
          } else if (up != 0) { // extend single edge, case 2
            // extend down: 0x becomes x0
            add(rank(w, (getMask(j, mask) | ((long) SWAP[up << 2] << (j << 1))) << 2), c);
          } else { // no edge
            // place nothing
            add(rank(w, mask << 2), c);
          }
        }
      }
    }

    private int getK(final int j, final long mask) {
      int k;
      int l;
      for (k = j - 1, l = 1; ; --k) {
        final long o = (mask >>> (k << 1)) & 3;
        if (o == 3) {
          ++l;
        } else if (o == 2 && --l == 0) {
          return k;
        }
      }
    }

    private int getK2(final int j, final long mask) {
      int k;
      int l;
      for (k = j + 2, l = 1; ; ++k) {
        final long o = (mask >>> (k << 1)) & 3;
        if (o == 2) {
          ++l;
        } else if (o == 3 && --l == 0) {
          break;
        }
      }
      return k;
    }

    private void case22(final int j, final int w, final Z c, final long mask) {
      // join 22: find mate of right 2, change it from 3 to 2
      add(rank(w, getMask(j, mask) ^ (1L << (getK2(j, mask) << 1))), c);
    }

    private void case12(final int j, final int w, final Z c, final long mask) {
      // we have 12, find up's mate, change it from 3 to 1
      add(rank(w, getMask(j, mask) & (~(2L << (getK2(j, mask) << 1)))), c);
    }

    private void case31(final int j, final int w, final Z c, final long mask) {
      // we have 31, find left's mate, change it from 2 to 1
      add(rank(w, getMask(j, mask) ^ (3L << (getK(j, mask) << 1))), c);
    }

    private void case33(final int j, final int w, final Z c, final long mask) {
      // join 33: find mate of left 3, change it from 2 to 3
      add(rank(w, getMask(j, mask) ^ (1L << (getK(j, mask) << 1))), c);
    }

    private void lowerRow(final int j, final int w) {
      for (long z = mPstart[mId]; z < mPend[mId]; ++z) {
        final Z c;
        if ((c = mPrev.get(z)).signum() != 0) {
          final long mask = unrank(w, z);
          final int left = (int) (mask >>> (j << 1)) & 3;
          final int up = (int) (mask >>> ((j << 1) + 2)) & 3;
          if (left == 3 && up == 2) {
            // join, easy case: 32 => 00
            add(rank(w, getMask(j, mask)), c);
          } else if (left == 2 && up == 2) {
            case22(j, w, c, mask);
          } else if (left == 3 && up == 3) {
            case33(j, w, c, mask);
          } else if (left == 1 && up != 0) {
            case12(j, w, c, mask);
          } else if (left != 0 && up == 1) {
            case31(j, w, c, mask);
          } else if (left != 0) { // extend single edge, case 1
            // extend to the right: x0 becomes 0x, but only if next cell isn't 2
            final int look = (int) (mask >>> ((j << 1) + 4)) & 3;
            if (left != 2 || look != 3) {
              add(rank(w, getMask(j, mask) | ((long) SWAP[left] << (j << 1))), c);
            }
          } else if (up != 0) { // extend single edge, case 2
            // extend to the right: no change in mask
            final int look = (int) (mask >>> ((j << 1) + 4)) & 3;
            if (up != 2 || look != 3) {
              add(z, c);
            }
          } else { // no edge
            // place nothing
            add(z, c);
          }
        }
      }
    }

    private void regularCell(final int j, final int w) {
      for (long z = mPstart[mId]; z < mPend[mId]; ++z) {
        final Z c;
        if ((c = mPrev.get(z)).signum() != 0) {
          final long mask = unrank(w, z);
          final int left = (int) (mask >>> (j << 1)) & 3;
          final int up = (int) (mask >>> ((j << 1) + 2)) & 3;
          if (left == 3 && up == 2) {
            // join, easy case: 32 => 00
            add(rank(w, getMask(j, mask)), c);
          } else if (left == 2 && up == 2) {
            case22(j, w, c, mask);
          } else if (left == 3 && up == 3) {
            case33(j, w, c, mask);
          } else if (left == 1 && up != 0) {
            case12(j, w, c, mask);
          } else if (left != 0 && up == 1) {
            // we have 31, find left's mate, change it from 2 to 1
            add(rank(w, getMask(j, mask) ^ (3L << (getK(j, mask) << 1))), c);
          } else if (left != 0) { // extend single edge, case 1
            // extend down: no change in mask
            add(z, c);
            // extend to the right: x0 becomes 0x, but only if next cell isn't 2
            final int look = (int) (mask >>> ((j << 1) + 4)) & 3;
            if (left != 2 || look != 3) {
              add(rank(w, getMask(j, mask) | ((long) SWAP[left] << (j << 1))), c);
            }
          } else if (up != 0) { // extend single edge, case 2
            // extend down: 0x becomes x0
            add(rank(w, getMask(j, mask) | ((long) SWAP[up << 2] << (j << 1))), c);
            // extend to the right: no change in mask
            final int look = (int) (mask >>> ((j << 1) + 4)) & 3;
            if (up != 2 || look != 3) {
              add(z, c);
            }
          } else { // no edge
            // place nothing
            add(z, c);
            // place 23
            add(rank(w, mask | (14L << (j << 1))), c);
          }
        }
      }
    }
  }

  private long getMask(final int j, final long mask) {
    return mask & (~(15L << (j << 1)));
  }

  private final class DeletionThread extends Thread {

    private final int mId;

    private DeletionThread(final int id) {
      mId = id;
    }

    @Override
    public void run() {
      for (long u = mPstart[mId]; u < mPend[mId]; ++u) {
        mCur.set(u, Z.ZERO);
      }
    }
  }

  private Z calc(final int n, final int m) {
    final long num = mDP[1][0][n + 1];
    final int w = n + 1;
    mPrev = new LongDynamicArray<>();
    mCur = new LongDynamicArray<>();
    for (long k = 0; k < num; ++k) {
      mPrev.set(k, Z.ZERO);
      mCur.set(k, Z.ZERO);
    }
    // Force starting edge to go down. the exact number of paths is twice the answer we get.
    mPrev.set(rank(w, 1), Z.ONE);
    if (m != n) {
      mPrev.set(rank(w, 4), Z.ONE);  // cannot use symmetry if non-square
    }
    mGlobalN = n;
    mGlobalM = m;
    mGlobalW = w;
    final long inc = num / THREADS;
    for (int k = 0; k < THREADS; ++k) {
      mPstart[k] = k * inc;
      mPend[k] = (k + 1) * inc;
    }
    mPend[THREADS - 1] = num;
    // We are not worried about creating 2 million mutexes and creating/tearing
    // down threads n^2 times, as the time for doing this is insignificant
    // compared to the calculation for large n
    for (int i = 0; i < m; ++i) {
      for (int j = 0; j < n; ++j) {
        //    System.out.println("[" + i + " " + j + "]");
        if (i == 0 && j == 0) {
          continue;
        }
        mGlobalI = i;
        mGlobalJ = j;
        final Thread[] threads = new Thread[THREADS];
        for (int k = 0; k < THREADS; ++k) {
          threads[k] = new CountingThread(k);
          threads[k].start();
        }
        for (final Thread thread : threads) {
          try {
            thread.join();
          } catch (final InterruptedException e) {
            throw new RuntimeException(e);
          }
        }
        final LongDynamicArray<Z> t = mPrev;
        mPrev = mCur;
        mCur = t;
        if (i != m - 1 || j != n - 1) {
          // delete array with threads
          for (int k = 0; k < THREADS; ++k) {
            threads[k] = new DeletionThread(k);
            threads[k].start();
          }
          for (final Thread thread : threads) {
            try {
              thread.join();
            } catch (final InterruptedException e) {
              throw new RuntimeException(e);
            }
          }
        }
      }
    }
    Z r = Z.ZERO;
    for (int i = 0; i < THREADS; ++i) {
      r = r.add(mPartialAnswers[i]);
    }
    if (n == m) {
      r = r.multiply2();
    }
    return r;
  }

  /* m,n: dimensions of rectangle with n*m internal cells */
  /* when solving A007764, invoke with n+1,n+1 */
  private Z solve(int n, int m) {
    if (n > m) {
      final int t = n;
      n = m;
      m = t;
    }
    // require n<=m, frontier width is n+1
    return calc(n, m);
  }

  private int mN = 0; // one larger than actual board size

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    return solve(mN, mN);
  }
}
