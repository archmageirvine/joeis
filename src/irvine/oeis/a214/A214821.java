package irvine.oeis.a214;

import irvine.math.z.Z;

/**
 * A214821 Number of genus 0 unsensed hypermaps with n darts.
 * @author T. R. S. Walsh
 * @author Sean A. Irvine
 */
public class A214821 extends A214823 {

  /**
   * Count planar hypermaps.
   * @param rt mode
   * @param e number of edges
   * @param vmn minimum number of vertices
   * @param vmx maximum number of vertices
   * @param lehman true to print the Lehman code
   * @return count
   */
  private long hypermapPlanarCount(final int rt, final int e, final int vmn, final int vmx, final boolean lehman) {
    assert e >= 0 && e <= MAX_EDGES;
    assert vmx >= 1 && vmx <= e + 1;
    assert vmn >= 1 && vmn <= vmx;

    final int[] vert = new int[DIM];
    final int[] next = new int[DIM];
    final int[] code = new int[DIM];
    final int[] prev = new int[DIM];
    final long[] root = new long[DIM];
    final long[][] sensed = new long[DIM][DIM];
    final long[][] unsensed = new long[DIM][DIM];
    long sum = 0;
    long sums = 0;
    long sumu = 0;

    if (mVerbose) {
      System.out.printf("%nNumber of rooted planar hypermaps with d darts, v vertices and e edges.%n");
      System.out.printf("  d   v   e%n");
    }
    for (int v = vmn; v <= vmx; ++v) {
      final int np = v - 1;
      final int nq = e - np;
      for (int i = 0; i <= vmx; ++i) {
        root[i] = 0;
      }
      long ct = 0;
      firstParenthesis(np);
      do {
        if (parenthesisPairs(np)) {
          throw new RuntimeException("Invalid parenthesis system.");
        }
        minPos(np);
        final int nw = colour(np);
        final int nb = v - nw;
        firstBracket(nq);
        do {
          if (bracketPairs(nq)) {
            throw new RuntimeException("Invalid bracket system.");
          }

          boolean flag = hFirstMix(nq, np); /* Mixing these two words in all possible ways. */
          while (!flag) {
            makeWord(nq, np);
            ++ct;
            ++root[nw];
            ++sum;
            if (lehman) {
              System.out.printf("nw=%3d, nb=%3d, ct=%5d:", nw, nb, ct);
              System.out.print(lehman(e));
            }
            if (rt > 0) {
              sPairs(e, 0);
              decode(e, vert, next);
              boolean max = true;
              for (int r = 2; r <= 2 * e; ++r) {
                if (mCol[vert[r]]) {
                  if (alfred(e, v, vert, next, r, code, 1)) {
                    max = false;
                    break;
                  }
                }
              }
              if (max) {
                sensed[v][nw]++;
                sums++;
                if (lehman) {
                  System.out.printf("  Sensed map #%d.", sensed[v][nw]);
                }
                if (rt > 1) {
                  for (int i = 1; i <= 2 * e; ++i) {
                    prev[next[i]] = i;
                  }
                  for (int r = 1; r <= 2 * e; ++r) {
                    if (mCol[vert[r]]) {
                      if (alfred(e, v, vert, prev, r, code, 1)) {
                        max = false;
                        break;
                      }
                    }
                  }
                  if (max) {
                    ++unsensed[v][nw];
                    ++sumu;
                    if (lehman) {
                      System.out.printf(" Unsensed map #%d.", unsensed[v][nw]);
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
        } while (nextBracket(nq));
      } while (nextParenthesis(np));
      if (mVerbose) {
        for (int nw = 1; nw < v; ++nw) {
          System.out.printf("%3d%4d%4d", e, nw, v - nw);
          System.out.printf("%12d%n", root[nw]);
        }
      }
    }
    if (mVerbose) {
      System.out.printf("%3d     mSum", e);
      System.out.printf("%12d%n", sum);
      if (rt > 0) {
        System.out.printf("%nNumber of sensed planar hypermaps with d darts, v vertices and e edges.%n");
        System.out.printf("  d   v   e%n");
        for (int v = vmn; v <= vmx; ++v) {
          for (int nw = 1; nw < v; ++nw) {
            System.out.printf("%3d%4d%4d", e, nw, v - nw);
            System.out.printf("%12d%n", sensed[v][nw]);
          }
        }
        System.out.printf("%3d     mSum", e);
        System.out.printf("%12d%n", sums);
      }
      if (rt > 1) {
        System.out.printf("%nNumber of unsensed planar hypermaps with d darts, v vertices and e edges.%n");
        System.out.printf("  d   v   e%n");
        for (int v = vmn; v <= vmx; ++v) {
          for (int nw = 1; nw < v; ++nw) {
            System.out.printf("%3d%4d%4d", e, nw, v - nw);
            System.out.printf("%12d%n", unsensed[v][nw]);
          }
        }
        System.out.printf("%3d     mSum", e);
        System.out.printf("%12d%n", sumu);
      }
    }
    return sumu;
  }

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(hypermapPlanarCount(2, ++mN, 1, mN + 1, false));
  }
}
