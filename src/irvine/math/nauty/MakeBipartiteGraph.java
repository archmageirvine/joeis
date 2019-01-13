package irvine.math.nauty;

import irvine.math.graph.Graph;
import irvine.math.graph.SmallGraph;

/**
 * Make X-format graph of different colour graph.
 * @author Sean A. Irvine
 */
class MakeBipartiteGraph implements MakeH {
  @Override
  public void makeH(final Graph g, final int[] h) {
    long restv = 0;
    int xseen1, xseen2;
    int i;

    for (i = 0; i < g.order(); ++i) {
      restv |= GenerateGraphs.BIT[i];
    }

    long seen1 = 0;
    long seen2 = 0;
    long expanded = 0;

    while (true) {
      long w;
      if ((w = (seen1 | seen2) & ~expanded) == 0) {
        xseen1 = 0;
        w = seen1;
        while (w != 0) {
          i = Long.numberOfLeadingZeros(w);
          w ^= GenerateGraphs.BIT[i];
          xseen1 |= GenerateGraphs.XBIT[i];
        }
        xseen2 = 0;
        w = seen2;
        while (w != 0) {
          i = Long.numberOfLeadingZeros(w);
          w ^= GenerateGraphs.BIT[i];
          xseen2 |= GenerateGraphs.XBIT[i];
        }

        w = seen1;
        while (w != 0) {
          i = Long.numberOfLeadingZeros(w);
          w ^= GenerateGraphs.BIT[i];
          h[i] = xseen2;
        }
        w = seen2;
        while (w != 0) {
          i = Long.numberOfLeadingZeros(w);
          w ^= GenerateGraphs.BIT[i];
          h[i] = xseen1;
        }

        restv &= ~(seen1 | seen2);
        if (restv == 0) {
          return;
        }
        i = Long.numberOfLeadingZeros(restv);
        seen1 = GenerateGraphs.BIT[i];
        seen2 = 0;
      } else {
        i = Long.numberOfLeadingZeros(w);
      }

      expanded |= GenerateGraphs.BIT[i];
      final long gi = ((SmallGraph) g).getEdgeVector(i);
      if ((GenerateGraphs.BIT[i] & seen1) != 0) {
        seen2 |= gi;
      } else {
        seen1 |= gi;
      }
    }
  }
}
