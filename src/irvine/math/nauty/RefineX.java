package irvine.math.nauty;

import irvine.math.graph.Graph;
import irvine.math.graph.SmallGraph;

/**
 * Custom refine.
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
final class RefineX {

  private RefineX() { }

  /*
   * Custom version of refine() which can exit quickly if required.
   *
   * Only use at level==0.
   * @param goodRet  whether to do an early return for code 1
   * code := -1 for n-1 not max, 0 for maybe, 1 for definite
   */
  static int refineX(final Graph g, final int[] lab, final int[] ptn, final int[] numCells,
                     final int[] count, final NautySet active, final boolean goodRet) {
    final int n = g.order();
    if (n == 1) {
      return 1;
    }

    final int[] workperm = new int[GenerateGraphs.MAXN];
    final int[] bucket = new int[GenerateGraphs.MAXN + 2];
    long lact = active.getBlock(0);
    int code = 0;

    while (numCells[0] < n && lact != 0) {
      final int split1 = Long.numberOfLeadingZeros(lact);
      lact ^= GenerateGraphs.BIT[split1];
      int split2;
      for (split2 = split1; ptn[split2] > 0; ++split2) {
        // do nothing
      }
      if (split1 == split2) {      // trivial splitting cell
        final int gptr = lab[split1];
        int cell2;
        for (int cell1 = 0; cell1 < n; cell1 = cell2 + 1) {
          for (cell2 = cell1; ptn[cell2] > 0; ++cell2) {
          }
          if (cell1 == cell2) {
            continue;
          }

          int c1 = cell1;
          int c2 = cell2;
          while (c1 <= c2) {
            final int labc1 = lab[c1];
            if (g.isAdjacent(gptr, labc1)) {
              ++c1;
            } else {
              lab[c1] = lab[c2];
              lab[c2] = labc1;
              --c2;
            }
          }
          if (c2 >= cell1 && c1 <= cell2) {
            ptn[c2] = 0;
            ++numCells[0];
            lact |= GenerateGraphs.BIT[c1];
          }
        }
      } else {       // nontrivial splitting cell
        long workset = 0;
        for (int i = split1; i <= split2; ++i) {
          workset |= GenerateGraphs.BIT[lab[i]];
        }
        int cell2;
        for (int cell1 = 0; cell1 < n; cell1 = cell2 + 1) {
          for (cell2 = cell1; ptn[cell2] > 0; ++cell2) {
          }
          if (cell1 == cell2) {
            continue;
          }
          int i = cell1;
          int cnt = (int) (long) Long.bitCount(workset & ((SmallGraph) g).getEdgeVector(lab[i]));
          int bmin = cnt;
          int bmax = cnt;
          count[i] = cnt;
          bucket[cnt] = 1;
          while (++i <= cell2) {
            cnt = (int) (long) Long.bitCount(workset & ((SmallGraph) g).getEdgeVector(lab[i]));
            while (bmin > cnt) {
              bucket[--bmin] = 0;
            }
            while (bmax < cnt) {
              bucket[++bmax] = 0;
            }
            ++bucket[cnt];
            count[i] = cnt;
          }
          if (bmin == bmax) {
            continue;
          }
          int c1 = cell1;
          for (i = bmin; i <= bmax; ++i) {
            if (bucket[i] != 0) {
              final int c2 = c1 + bucket[i];
              bucket[i] = c1;
              if (c1 != cell1) {
                lact |= GenerateGraphs.BIT[c1];
                ++numCells[0];
              }
              if (c2 <= cell2) {
                ptn[c2 - 1] = 0;
              }
              c1 = c2;
            }
          }
          for (i = cell1; i <= cell2; ++i) {
            workperm[bucket[count[i]]++] = lab[i];
          }
          System.arraycopy(workperm, cell1, lab, cell1, cell2 - cell1 + 1);
        }
      }

      if (ptn[n - 2] == 0) {
        if (lab[n - 1] == n - 1) {
          code = 1;
          if (goodRet) {
            return 1;
          }
        } else {
          return -1;
        }
      } else {
        int i = n - 1;
        while (true) {
          if (lab[i] == n - 1) {
            break;
          }
          if (ptn[--i] == 0) {
            return -1;
          }
        }
      }
    }
    return code;
  }
}
