package irvine.oeis.a005;

import java.io.IOException;

import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.GraphProcessor;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005964 Number of trivalent connected (or cubic) planar graphs with <code>2n</code> nodes.
 * @author Sean A. Irvine
 */
public class A005964 implements Sequence, GraphProcessor {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 0;
  private long mGenCount = 0;
  private long mPlanarCount = 0;

  @Override
  public void process(final Graph graph) {
    ++mGenCount;
    if (graph.isPlanar()) {
      ++mPlanarCount;
    }
  }

  @Override
  public Z next() {
    mN += 2;
    final GenerateGraphs gg = new GenerateGraphs(1);
    gg.setVertices(mN);
    gg.setMinEdges(3 * mN / 2);
    gg.setMaxEdges(3 * mN / 2);
    gg.setConnectionLevel(1);
    gg.setMaxDeg(3);
    gg.setMinDeg(3);
    gg.setProcessor(this);
    gg.sanitizeParams();
    mGenCount = 0;
    mPlanarCount = 0;
    try {
      gg.run(false, false, false, 0, 0);
    } catch (final IOException e) {
      throw new RuntimeException(e); // We are not generating output anyway
    }
    if (mVerbose) {
      System.out.println("Undirected generated count was " + mGenCount);
    }
    return Z.valueOf(mPlanarCount);
  }
}
