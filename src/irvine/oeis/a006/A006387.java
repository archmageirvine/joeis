package irvine.oeis.a006;

import java.util.Arrays;

import irvine.math.z.Z;

/**
 * A006387.
 * @author T. R. S. Walsh
 * @author Sean A. Irvine
 */
public class A006387 extends A006385 {

  protected static final int EMAXP1 = MAX_EDGES + 1;
  protected static final int MAX_GENUS = 1 + MAX_EDGES / 2;

  private final int[] mDir = new int[EMAXP1];
  private final int[] mQPos1 = new int[EMAXP1];
  private final int[] mQPos2 = new int[EMAXP1];

  protected long mSumSumU = 0;
  protected final long[] mSums = new long[MAX_GENUS];
  protected final long[] mTotalByGenus = new long[MAX_GENUS];

  /**
   * Count.
   * @param rt mode
   * @param e number of edges
   * @param vmn minimum number of vertices
   * @param vmx maximum number of vertices
   * @param lehman true to print the Lehman code
   * @return count
   */
  protected long[] count(final int rt, final int e, final int vmn, final int vmx, final boolean lehman) {
    assert e >= 0 && e <= MAX_EDGES;
    assert vmx >= 1 && vmx <= e + 1;
    assert vmn >= 1 && vmn <= vmx;
    final int[] vert = new int[DIM];
    final int[] next = new int[DIM];
    final int[] code = new int[DIM];
    final int[] prev = new int[DIM];
    final long[] cts = new long[DIM];
    final long[] ctu = new long[DIM];
    final long[] root = new long[MAX_GENUS];
    final long[][] sensed = new long[DIM][MAX_GENUS];
    final long[][] unsensed = new long[DIM][MAX_GENUS];
    mTotal = 0;
    long sumsums = 0;
    final long[] sumu = new long[MAX_GENUS];
    mSumSumU = 0;
    Arrays.fill(mSums, 0);
    Arrays.fill(mTotalByGenus, 0);

    printHeader(e);
    for (int v = vmn; v <= vmx; v++) {
      final int np = v - 1;
      final int nq = e - np;
      Arrays.fill(root, 0);
      long ct = 0;
      firstInt(nq);
      do {
        qPairs(nq);
        final int g = genus(nq);
        firstParenthesis(np);
        do {
          if (parenthesisPairs(np)) {
            throw new RuntimeException("Invalid parenthesis system.");
          }
          firstSys(np, nq);
          do {
            if (reject(e)) {
              continue;
            }
            ct++;
            root[g]++;
            mTotal++;
            mTotalByGenus[g]++;
            if (lehman) {
              System.out.printf("%5d:", ct);
              printLehman(e, g);
            }
            if (rt > 0) {
              decode(e, vert, next);
              boolean max = true;
              for (int r = 2; r <= 2 * e; ++r) {
                if (lehman(e, vert, next, r, code, 1) > 0) {
                  max = false;
                  break;
                }
              }
              if (max) {
                ++cts[v];
                ++sensed[v][g];
                ++sumsums;
                ++mSums[g];
                if (lehman) {
                  System.out.printf(" Sensed map #%d.", sensed[v][g]);
                }
                if (rt > 1) {
                  for (int i = 1; i <= 2 * e; ++i) {
                    prev[next[i]] = i;
                  }
                  for (int r = 1; r <= 2 * e; ++r) {
                    if (lehman(e, vert, prev, r, code, 1) > 0) {
                      max = false;
                      break;
                    }
                  }
                  if (max) {
                    ++ctu[v];
                    ++unsensed[v][g];
                    ++mSumSumU;
                    ++sumu[g];
                    if (lehman) {
                      System.out.printf(" Unsensed map #%d", unsensed[v][g]);
                    }
                  }
                }
              }
            }
            if (lehman) {
              System.out.println();
            }
          } while (nextSys(np, nq));
        } while (nextParenthesis(np));
      } while (nextInt(nq));
      if (mVerbose) {
        System.out.printf("%3d%4d", e, v);
        for (int g = 0; g <= e / 2; ++g) {
          System.out.printf("%12d", root[g]);
        }
        System.out.printf("%12d%n", ct);
      }
    }
    if (mVerbose) {
      System.out.printf("%3d mSum", e);
      for (int g = 0; g <= e / 2; ++g) {
        System.out.printf("%12d", mTotalByGenus[g]);
      }
      System.out.printf("%12d%n", mTotal);
      if (rt > 0) {
        System.out.printf("%nNumber of sensed maps with e edges and v vertices.%n");
        System.out.print("  e   v");
        for (int g = 0; g <= e / 2; ++g) {
          System.out.printf("         g=%1d", g);
        }
        System.out.printf("       all g%n");
        for (int v = vmn; v <= vmx; v++) {
          System.out.printf("%3d%4d", e, v);
          for (int g = 0; g <= e / 2; ++g) {
            System.out.printf("%12d", sensed[v][g]);
          }
          System.out.printf("%12d%n", cts[v]);
        }
        System.out.printf("%3d mSum", e);
        for (int g = 0; g <= e / 2; ++g) {
          System.out.printf("%12d", mSums[g]);
        }
        System.out.printf("%12d%n", sumsums);
      }
      if (rt > 1) {
        System.out.printf("%nNumber of unsensed maps with e edges and v vertices.%n");
        System.out.print("  e   v");
        for (int g = 0; g <= e / 2; ++g) {
          System.out.printf("         g=%1d", g);
        }
        System.out.printf("       all g%n");
        for (int v = vmn; v <= vmx; v++) {
          System.out.printf("%3d%4d", e, v);
          for (int g = 0; g <= e / 2; ++g) {
            System.out.printf("%12d", unsensed[v][g]);
          }
          System.out.printf("%12d%n", ctu[v]);
        }
        System.out.printf("%3d mSum", e);
        for (int g = 0; g <= e / 2; ++g) {
          System.out.printf("%12d", sumu[g]);
        }
        System.out.printf("%12d%n", mSumSumU);
      }
    }
    return sumu;
  }

  protected void printLehman(final int e, final int g) {
    for (int i = 1; i <= 2 * e; ++i) {
      if (mS[i] == 0) {
        System.out.print("  (");
      } else if (mS[i] == -1) {
        System.out.print("  )");
      } else {
        System.out.printf("%3d", mS[i]);
      }
    }
    System.out.printf("  genus = %d", g);
  }

  private void printHeader(final int e) {
    if (mVerbose) {
      System.out.print("  e   v");
      for (int g = 0; g <= e / 2; ++g) {
        System.out.printf("         g=%1d", g);
      }
      System.out.printf("       all g%n");
    }
  }

  /* Constructs the Lehman code for the map defined by vert and next rooted at r. */
  protected int lehman(final int e, final int[] vert, final int[] next, final int r, final int[] code, final int c) {
    final int[] el = new int[DIM];
    final int[] vl = new int[DIM];
    int d = r;
    int ec = 0;
    vl[vert[d]] = 1;
    for (int i = 1; i <= 2 * e; ++i) {
      if (el[d] == 0) {
        // The edge containing d is seen for the first time.
        if (vl[vert[2 * e + 1 - d]] == 0) {
          // The vertex at the other end of this edge not yet seen.
          el[d] = -1;
          el[2 * e + 1 - d] = -1; // Put this edge in the tree.
          code[i] = 0; // left parenthesis
          vl[vert[2 * e + 1 - d]] = 1; // Now we've seen this vertex.
        } else {
          // The vertex at the other end of this edge has already been seen.
          el[d] = ++ec;
          el[2 * e + 1 - d] = ec; // Put this edge in the cotree.
          code[i] = ec;
        }
      } else {
        code[i] = el[d]; // The edge containing d is seen for the second time.
      }
      if (c > 0) {
        // We're testing the code mS, decoded by vert and next, for maximality.
        if (code[i] > mS[i]) {
          return d; // The map rooted at d has a bigger code than mS.
        } else if (code[i] < mS[i]) {
          return 0; // The map rooted at d has a smaller code than mS.
        }
      }
      if (code[i] <= 0) {
        d = next[2 * e + 1 - d]; // Go to the other end of the edge containing d and rotate.
      } else {
        d = next[d]; // Just rotate.
      }
    }
    return 0;
  }

  protected void qPairs(final int n) {
    for (int i = 1; i <= n; ++i) {
      mQMate[mQPos1[i]] = mQPos2[i];
      mQMate[mQPos2[i]] = mQPos1[i];
    }
  }

  protected int genus(final int n) {
    final boolean[] newx = new boolean[2 * n];
    int f = 0;
    Arrays.fill(newx, true);
    for (int i = 0; i < 2 * n; ++i) {
      if (newx[i]) {
        int j = i;
        do {
          newx[j] = false;
          final int t = mQ[j];
          if (j == mQPos2[t]) {
            j = mQPos1[t];
          } else {
            j = mQPos2[t];
          }
          if (j == 2 * n - 1) {
            j = 0;
          } else {
            ++j;
          }
        } while (j != i);
        ++f;
      }
    }
    return (1 + n - f) / 2;
  }

  protected void firstInt(final int n) {
    int i;
    mQ[2 * n] = 0;
    for (i = 1; i <= n; ++i) {
      mQ[2 * i - 2] = i;
      mQPos1[i] = 2 * i - 2;
      mQ[2 * i - 1] = i;
      mQPos2[i] = 2 * i - 1;
      mDir[i] = 1;
    }
  }

  protected boolean nextInt(final int n) {
    int i = 1;
    while (i < n) {
      final int qp = mQPos2[i];
      if (mDir[i] > 0) {
        final int t = mQ[qp + 1];
        if (t < i) {
          mDir[i++] = -1;
        } else {
          mQ[qp + 1] = i;
          mQ[qp] = t;
          ++mQPos2[i];
          if (mQPos2[i] == mQPos1[t]) {
            --mQPos1[t];
          } else {
            --mQPos2[t];
          }
          return true;
        }
      } else {
        final int t = mQ[qp - 1];
        if (t == i) {
          mDir[i++] = 1;
        } else {
          mQ[qp - 1] = i;
          mQ[qp] = t;
          --mQPos2[i];
          if (mQPos2[i] == mQPos1[t]) {
            ++mQPos1[t];
          } else {
            ++mQPos2[t];
          }
          return true;
        }
      }
    }
    return false;
  }

  @Override
  public Z next() {
    return Z.valueOf(count(2, ++mN, 1, mN + 1, false)[1]);
  }
}
