package irvine.oeis.a002;

import irvine.math.graph.Graph;
import irvine.math.graph.GraphUtils;
import irvine.math.nauty.Counter;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.GraphProcessor;
import irvine.math.z.Z;
import irvine.oeis.ParallelGenerateGraphsSequence;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicIntArray;
import irvine.util.string.StringUtils;

/**
 * A002887 The minimum number of nodes of a tree with a cutting center of n nodes.
 * @author Sean A. Irvine
 */
public class A002887 extends Sequence1 implements GraphProcessor {

  // Only good for first few terms

  private static final int MAX_TERM = 10;
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 0;
  protected int mM = 0;
  private final DynamicIntArray mFirstCuttingCenter = new DynamicIntArray();
  protected DynamicIntArray mFirstCuttingNumber = new DynamicIntArray();

  private int[] cuttingCenter(final Graph graph) {
    int cn = 0;
    int count = 0;
    for (int v = 0; v < graph.order(); ++v) {
      if (graph.degree(v) > 1) {
        final int cnv = GraphUtils.cuttingNumber(graph, v);
        if (cnv >= cn) {
          if (cnv > cn) {
            cn = cnv;
            count = 1;
          } else {
            ++count;
          }
        }
      }
    }
    return new int[] {cn, count};
  }

  @Override
  public void process(final Graph tree) {
    final int[] cc = cuttingCenter(tree);
    if (cc[1] >= mM && cc[1] <= MAX_TERM) {
      synchronized (this) {
        if (mFirstCuttingCenter.get(cc[1]) == 0) {
          mFirstCuttingCenter.set(cc[1], mN);
          mFirstCuttingNumber.set(cc[1], cc[0]);
        }
      }
    }
  }

  @Override
  public Z next() {
    if (++mM >= MAX_TERM) {
      throw new UnsupportedOperationException();
    }
    while (mFirstCuttingCenter.get(mM) == 0) {
      ++mN;
      if (mVerbose) {
        StringUtils.message("Generating all trees of order " + mN);
      }
      final ParallelGenerateGraphsSequence gg = new ParallelGenerateGraphsSequence(mN - 1, 1, 0, () -> Counter.ONE) {
        @Override
        protected void graphGenInit(final GenerateGraphs gg) {
          gg.setVertices(mN);
          gg.setMinEdges(mN - 1);
          gg.setMaxEdges(mN - 1);
          gg.setConnectionLevel(1);
          gg.setProcessor(A002887.this);
        }
      };
      gg.next();
    }
    if (mVerbose) {
      StringUtils.message("Cutting center size=" + mM + " order=" + mFirstCuttingCenter.get(mM) + " cutting-number=" + mFirstCuttingNumber.get(mM));
    }
    return Z.valueOf(mFirstCuttingCenter.get(mM));
  }
}
