package irvine.oeis.a080;

import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.ParallelGenerateGraphsSequence;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicIntArray;
import irvine.util.string.StringUtils;

/**
 * A080803 Number of vertices of minimal graph with an automorphism group of order n.
 * @author Sean A. Irvine
 */
public class A080803 extends Sequence1 {

  // todo this seems to lock up

  private static final long LIMIT = 1000; // Way more than we can do
  private final LongDynamicIntArray mOrders = new LongDynamicIntArray(); // stores orders + 1
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private long mS = 0;
  private int mM = -1;

  @Override
  public Z next() {
    if (++mS >= 7 && Predicates.PRIME.is(mS)) {
      return Z.valueOf(2 * mS);
    }
    while (mOrders.get(mS) == 0) {
      ++mM;
      if (mVerbose) {
        StringUtils.message("Generating all graphs with " + mM + " vertices");
      }
      new ParallelGenerateGraphsSequence(mM - 1, 0, 0, () -> graph -> {
        final Z aut = GraphUtils.automorphismSize(graph);
        if (aut.compareTo(LIMIT) < 0) {
          final long s = aut.longValue();
          synchronized (mOrders) {
            if (mOrders.get(s) == 0) {
              mOrders.set(s, mM + 1);
              if (mVerbose) {
                StringUtils.message(s + " is achieved by a " + mM + " vertex graph: " + graph);
              }
            }
          }
        }
        return 1;
      }) {
        @Override
        protected void graphGenInit(final GenerateGraphs gg) {
          gg.setVertices(mN);
          gg.setMinEdges(0);
          gg.setMaxEdges(mN * (mN - 1) / 2);
          gg.setMinDeg(0);
          gg.setMaxDeg(mN - 1);
          gg.setConnectionLevel(0);
        }
      }.next();
    }
    return Z.valueOf(mOrders.get(mS) - 1);
  }
}
