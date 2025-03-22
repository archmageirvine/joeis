package irvine.oeis.a075;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import irvine.math.graph.Graph;
import irvine.math.graph.GraphUtils;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.GraphProcessor;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075094 Triangle of the sorted orders of graph automorphism groups for the simple graphs.
 * @author Sean A. Irvine
 */
public class A075094 extends Sequence1 implements GraphProcessor {

  private final List<Z> mA = new ArrayList<>();
  private int mN = 0;
  private int mM = 0;

  @Override
  public void process(final Graph graph) {
    mA.add(GraphUtils.automorphismSize(graph));
  }

  @Override
  public Z next() {
    if (++mM >= mA.size()) {
      mA.clear();
      mM = 0;
      final GenerateGraphs gg = new GenerateGraphs(1);
      gg.setProcessor(this);
      gg.setVertices(++mN);
      gg.setMinEdges(0);
      gg.setMaxEdges(mN * (mN - 1) / 2);
      gg.setMinDeg(0);
      gg.setMaxDeg(mN);
      gg.setConnectionLevel(0);
      gg.sanitizeParams();
      gg.run(false, false, false, false, 0, 0);
      Collections.sort(mA);
    }
    return mA.get(mM);
  }
}
