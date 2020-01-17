package irvine.oeis.a002;

import java.io.IOException;

import irvine.math.graph.Graph;
import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.GraphProcessor;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.DynamicIntArray;
import irvine.util.string.StringUtils;

/**
 * A002887.
 * @author Sean A. Irvine
 */
public class A002887 implements Sequence, GraphProcessor {

  // Only good for first few terms

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 0;
  protected int mM = 0;
  private DynamicIntArray mFirstCuttingCenter = new DynamicIntArray();
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
  public void process(final Graph tree) throws IOException {
    final int[] cc = cuttingCenter(tree);
    if (mFirstCuttingCenter.get(cc[1]) == 0) {
      mFirstCuttingCenter.set(cc[1], mN);
      mFirstCuttingNumber.set(cc[1], cc[0]);
    }
  }

  @Override
  public Z next() {
    ++mM;
    while (mFirstCuttingCenter.get(mM) == 0) {
      ++mN;
      if (mVerbose) {
        StringUtils.message("Generating all trees of order " + mN);
      }
      final GenerateGraphs gg = new GenerateGraphs(1);
      gg.setVertices(mN);
      gg.setMinEdges(mN - 1);
      gg.setMaxEdges(mN - 1);
      gg.setConnectionLevel(1);
      gg.setProcessor(this);
      gg.sanitizeParams();
      try {
        gg.run(false, false, false, 0, 0);
      } catch (final IOException e) {
        throw new RuntimeException(e); // We are not generating output anyway
      }
    }
    if (mVerbose) {
      StringUtils.message("Cutting center size=" + mM + " order=" + mFirstCuttingCenter.get(mM) + " cutting-number=" + mFirstCuttingNumber.get(mM));
    }
    return Z.valueOf(mFirstCuttingCenter.get(mM));
  }
}
