package irvine.oeis.a214;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.a006.A006387;

/**
 * A214823 Number of genus 2 unsensed hypermaps with n darts.
 * @author T. R. S. Walsh
 * @author Sean A. Irvine
 */
public class A214823 extends A006387 {

  protected final boolean[] mCol = new boolean[EMAXP1];
  private final int[] mWall = new int[DIM];
  private final int[] mQPos = new int[DIM];

  /* Stack space for minPos */
  private final int[] mStk = new int[EMAXP1];

  {
    setOffset(1);
  }

  protected void minPos(final int np) {
    mStk[0] = 0;
    int ist = 0;
    mWall[2 * np] = 0;
    for (int i = 2 * np; i > 0; i--) {
      if (mP[i] < 0) {
        // right parenthesis
        mStk[++ist] = mPMate[i]; // push
      } else {
        ist--; // pop
      }
      mWall[i - 1] = mStk[ist];
    }
  }

  protected int colour(final int np) {
    mCol[1] = true; // true = white, false = black
    boolean cl = true; // colour of current vertex
    int iv = 1; // index of current new vertex
    int nw = 1; // number of white vertices
    for (int i = 1; i <= 2 * np; ++i) {
      cl = !cl; // change colour
      if (mP[i] == 0) {
        // left parenthesis, new vertex
        mCol[++iv] = cl;
        if (cl) {
          nw++;
        }
      }
    }
    return nw;
  }

  private boolean hPlace(final int i, final int nq, final int np) {
    final int pl;
    if (mQMate[i] > i) {
      // first occurrence
      if ((mQPos[mQMate[i]] - mQPos[i + 1]) % 2 == 0) {
        pl = mQPos[i + 1] - 1;
      } else {
        // There must be an odd number of parentheses between matching brackets or integers.
        pl = mQPos[i + 1];
      }
      if (pl < mWall[mQPos[mQMate[i]]]) {
        return true; // It would make the forbidden subword.
      }
    } else {
      if (i == 2 * nq - 1) {
        pl = 2 * np; // Put the rightmost bracket or integer in the rightmost slot.
      } else {
        pl = mQPos[i + 1];
      }
      if (pl < 2) {
        return true;
      }
    }
    mQPos[i] = pl;
    return false;
  }

  private boolean hMove(final int i) {
    if (mQMate[i] > i)  {
      // first occurrence
      if (mQPos[i] > mWall[mQPos[mQMate[i]]] + 1) {
        mQPos[i] -= 2;
      } else {
        return true;
      }
    } else {
      if (mQPos[i] > 2) {
        --mQPos[i];
      } else {
        return true;
      }
    }
    return false;
  }

  protected boolean hFirstMix(final int nq, final int np) {
    if (nq == 0) {
      return false;
    }
    int i = 2 * nq - 1;
    boolean flag = hPlace(i, nq, np);
    while (true) {
      if (flag) {
        if (++i >= 2 * nq) {
          return true;
        }
        flag = hMove(i);
      } else {
        if (--i < 0) {
          return false;
        }
        flag = hPlace(i, nq, np);
      }
    }
  }

  protected boolean hNextMix(final int nq, final int np) {
    if (nq == 0) {
      return true;
    }
    int i = 0;
    boolean flag = hMove(i);
    while (true) {
      if (flag) {
        if (++i >= 2 * nq) {
          return true;
        }
        flag = hMove(i);
      } else {
        if (--i < 0) {
          return false;
        }
        flag = hPlace(i, nq, np);
      }
    }
  }

  /* makes a shuffle of parentheses and brackets or integers */
  protected void makeWord(final int nq, final int np) {
    if (nq <= 0) {
      System.arraycopy(mP, 1, mS, 1, 2 * np);
    } else {
      int ip = 1;
      int iq = 0;
      for (int i = 1; i <= 2 * (nq + np); ++i) {
        if (iq < 2 * nq && mQPos[iq] < ip) {
          mS[i] = mQ[iq++];
        } else {
          mS[i] = mP[ip++];
        }
      }
    }
  }

  private final int[] mStk1 = new int[DIM];
  private final int[] mStk2 = new int[DIM];

  /* Finds the position mSMate[i] of the mate of mS[i]  */
  protected void sPairs(final int e, final int g) {
    mStk1[0] = 0;
    mStk2[0] = 0;
    int ind1 = 0;
    int ind2 = 0;
    if (g > 0) {
      for (int i = 1; i <= e; ++i) {
        mStk2[i] = 0;
      }
    }
    for (int i = 1; i <= 2 * e; ++i) {
      if (mS[i] == OPEN_PAREN) {
        // left parenthesis; push
        mStk1[++ind1] = i;
      } else if (mS[i] == CLOSE_PAREN) {
        // right parenthesis; pop
        mSMate[i] = mStk1[ind1];
        mSMate[mStk1[ind1--]] = i;
      } else {
        // bracket or integer
        if (g == 0) {
          // parenthesis-bracket system
          if (mS[i] == OPEN_BRACKET) {
            // left bracket; push
            mStk2[++ind2] = i;
          } else {
            // right bracket; pop
            mSMate[i] = mStk2[ind2];
            mSMate[mStk2[ind2--]] = i;
          }
        } else {
          // parenthesis-integer system
          if (mStk2[mS[i]] == OPEN_PAREN) {
            mStk2[mS[i]] = i; // first occurrence
          } else {
            // second occurrence
            mSMate[i] = mStk2[mS[i]];
            mSMate[mStk2[mS[i]]] = i;
          }
        }
      }
    }
  }

  protected final long[] mSumSensed = new long[MAX_GENUS];
  protected final long[] mSum = new long[MAX_GENUS];

  /**
   * Count.
   * @param rt mode
   * @param e number of edges
   * @param vmn minimum number of vertices
   * @param vmx maximum number of vertices
   * @param lehman true to print the Lehman code
   * @return count
   */
  protected long[] hypermapCount(final int rt, final int e, final int vmn, final int vmx, final boolean lehman) {
    assert e >= 0 && e <= MAX_EDGES;
    assert vmx >= 1 && vmx <= e + 1;
    assert vmn >= 1 && vmn <= vmx;

    final int[] vert = new int[DIM];
    final int[] next = new int[DIM];
    final int[] code = new int[DIM];
    final int[] prev = new int[DIM];
    final long[][] cts = new long[DIM][DIM];
    final long[][] ctu = new long[DIM][DIM];
    final long[][] root = new long[MAX_GENUS][DIM];
    final long[][][] sensed = new long[DIM][MAX_GENUS][DIM];
    final long[][][] unsensed = new long[DIM][MAX_GENUS][DIM];
    long sumsum = 0;
    long sumsums = 0;
    final long[] sumu = new long[MAX_GENUS];
    final long[] ctr = new long[DIM];
    Arrays.fill(mSum, 0);
    Arrays.fill(mSumSensed, 0);
    mSumSumU = 0;

    printHeader(e);
    for (int v = vmn; v <= vmx; v++) {
      final int np = v - 1;
      final int nq = e - np;
      long ct = 0;
      firstParenthesis(np);
      do {
        if (parenthesisPairs(np)) {
          throw new RuntimeException("Invalid parenthesis system.");
        }
        minPos(np);
        final int nw = colour(np);
        final int nb = v - nw;
        firstInt(nq);
        do {
          qPairs(nq);
          final int g = genus(nq);
          boolean flag = hFirstMix(nq, np); // Mixing these two words in all possible ways.
          while (!flag) {
            makeWord(nq, np);
            ++ct;
            ++ctr[nw];
            ++root[g][nw];
            ++mSum[g];
            ++sumsum;
            if (lehman) {
              System.out.printf("nw=%3d, nb=%3d, ct=%5d:", nw, nb, ct);
              printLehman(e, g);
            }
            if (rt > 0) {
              sPairs(e, 1);
              decode(e, vert, next);
              boolean max = true;
              for (int r = 2; r <= 2 * e; r++) {
                if (mCol[vert[r]]) {
                  if (lehman(e, vert, next, r, code, 1) > 0) {
                    max = false;
                    break;
                  }
                }
              }
              if (max) {
                ++cts[v][nw];
                ++sensed[v][g][nw];
                ++mSumSensed[g];
                ++sumsums;
                if (lehman) {
                  System.out.printf("  Sensed map #%d.", sensed[v][g][nw]);
                }
                if (rt > 1) {
                  for (int i = 1; i <= 2 * e; ++i) {
                    prev[next[i]] = i;
                  }
                  for (int r = 1; r <= 2 * e; r++) {
                    if (mCol[vert[r]]) {
                      if (lehman(e, vert, prev, r, code, 1) > 0) {
                        max = false;
                        break;
                      }
                    }
                  }
                  if (max) {
                    ++ctu[v][nw];
                    ++unsensed[v][g][nw];
                    ++sumu[g];
                    ++mSumSumU;
                    if (lehman) {
                      System.out.printf(" Unsensed map #%d.", unsensed[v][g][nw]);
                    }
                  }
                }
              }
            }
            if (lehman) {
              System.out.println();
            }
            flag = hNextMix(nq, np);
          }
        } while (nextInt(nq));
      } while (nextParenthesis(np));
      if (mVerbose) {
        for (int nw = 1; nw < v; nw++) {
          System.out.printf("%3d%4d%4d", e, nw, v - nw);
          for (int g = 0; g <= (e - 1) / 2; ++g) {
            System.out.printf("%12d", root[g][nw]);
          }
          System.out.printf("%12d%n", ctr[nw]);
        }
      }
    }
    if (mVerbose) {
      System.out.printf("%3d     mSum", e);
      for (int g = 0; g <= (e - 1) / 2; ++g) {
        System.out.printf("%12d", mSum[g]);
      }
      System.out.printf("%12d%n", sumsum);
      if (rt > 0) {
        dumpTable("Number of sensed hypermaps with d darts, v vertices and e edges.", e, vmn, vmx, cts, sensed, mSumSensed, sumsums);
      }
      if (rt > 1) {
        dumpTable("Number of unsensed hypermaps with d darts, v vertices and e edges.", e, vmn, vmx, ctu, unsensed, sumu, mSumSumU);
      }
    }
    return sumu;
  }

  private void dumpTable(final String header, final int e, final int vmn, final int vmx, final long[][] ct, final long[][][] counts, final long[] sums, final long total) {
    System.out.println();
    System.out.println(header);
    System.out.print("  d   v   e");
    for (int g = 0; g <= (e - 1) / 2; ++g) {
      System.out.printf("         g=%1d", g);
    }
    System.out.printf("        all g%n");
    for (int v = vmn; v <= vmx; v++) {
      for (int nw = 1; nw < v; nw++) {
        System.out.printf("%3d%4d%4d", e, nw, v - nw);
        for (int g = 0; g <= (e - 1) / 2; ++g) {
          System.out.printf("%12d", counts[v][g][nw]);
        }
        System.out.printf("%12d%n", ct[v][nw]);
      }
    }
    System.out.printf("%3d     mSum", e);
    for (int g = 0; g <= (e - 1) / 2; ++g) {
      System.out.printf("%12d", sums[g]);
    }
    System.out.printf("%12d%n", total);
  }

  private void printHeader(final int e) {
    if (mVerbose) {
      System.out.printf("%nNumber of darts = %d%n", e);
      System.out.printf("%nNumber of rooted hypermaps with d darts, v vertices and e edges.%n");
      System.out.print("  d   v   e");
      for (int g = 0; g <= (e - 1) / 2; ++g) {
        System.out.printf("         g=%1d", g);
      }
      System.out.printf("       all g%n");
    }
  }

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(hypermapCount(2, ++mN, 1, mN + 1, false)[2]);
  }
}
