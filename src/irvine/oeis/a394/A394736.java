package irvine.oeis.a394;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import irvine.math.graph.Graph;
import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.z.Z;
import irvine.oeis.ParallelGenerateGraphsSequence;
import irvine.oeis.Sequence0;
import irvine.util.string.StringUtils;

/**
 * A394736 allocated for Gordon Hamilton.
 * @author Sean A. Irvine
 */
public class A394736 extends Sequence0 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = -1;
  private final List<List<Graph>> mPrimeGraphs = new ArrayList<>();

  private Collection<Graph> build(final Graph g, final int copies) {
    if (copies == 1) {
      return Collections.singletonList(g);
    }
    final Set<Graph> res = new HashSet<>();
    for (final Graph h : build(g, copies - 1)) {
      res.addAll(GraphUtils.filterConnected(GraphUtils.join(h, g)));
    }
    return res;
  }

  private void build(final Set<Graph> set, final int size, final int copies) {
    for (final Graph g : mPrimeGraphs.get(size)) {
      set.addAll(build(g, copies));
    }
  }

  @Override
  public Z next() {
    if (++mN <= 1) {
      mPrimeGraphs.add(Collections.emptyList());
      return Z.ZERO;
    }
    Set<Graph> composites = new HashSet<>();
    for (int k = 2; k < mN; ++k) {
      if (mN % k == 0) {
        build(composites, k, mN / k);
      }
    }
    if (mVerbose) {
      StringUtils.message("Total number of composites: " + composites.size());
    }
    final List<Graph> primes = Collections.synchronizedList(new ArrayList<>());
    mPrimeGraphs.add(primes);
    new ParallelGenerateGraphsSequence(mN, mN - 1, mN, 0, () -> (g) -> {
      final Graph canon = GraphUtils.canon(g);
      if (!composites.contains(canon)) {
        primes.add(canon);
      }
      return 0;
    }) {
      @Override
      protected void graphGenInit(final GenerateGraphs gg) {
        gg.setVertices(mN);
        gg.setConnectionLevel(1);
        gg.setMinEdges(0);
        gg.setMaxEdges(mN * (mN - 1));
      }
    }.next();
    //System.out.println(primes);
    return Z.valueOf(mPrimeGraphs.get(mN).size());
  }
}
