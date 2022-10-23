package irvine.oeis.a000;

import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.GraphProcessor;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A000066 Smallest number of vertices in trivalent graph with girth (shortest cycle) = n.
 * @author Sean A. Irvine
 */
public class A000066 extends Sequence3 implements GraphProcessor {

  private int mN = 2;
  private int mM = 2;
  private boolean mSolved = false;

  @Override
  public void process(final Graph graph) {
    if (graph.girth() == mN) {
      mSolved = true;
    }
  }

  @Override
  public Z next() {
    ++mN;
    mSolved = false;
    while (true) {
      mM += 2;
      final GenerateGraphs gg = new GenerateGraphs(1);
      gg.setConnectionLevel(1);
      gg.setVertices(mM);
      gg.setMinEdges(mM - 1);
      gg.setMaxEdges(mM * (mM - 1));
      gg.setMinDeg(3);
      gg.setMaxDeg(3);
      gg.setProcessor(this);
      gg.sanitizeParams();
      gg.run(false, false, false, 0, 0);
      if (mSolved) {
        return Z.valueOf(mM);
      }
    }
  }
}

