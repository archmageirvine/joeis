package irvine.oeis.a003;

import java.io.IOException;

import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.GraphProcessor;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003317.
 * @author Sean A. Irvine
 */
public class A003317 implements Sequence, GraphProcessor {

  // This works but is really slow

  private int mN = 2;
  private long mCount = 0;

  @Override
  public void process(final Graph graph) throws IOException {
    if (graph.isMinimallyBiconnected()) {
      ++mCount;
    }
  }

  @Override
  public Z next() {
    ++mN;
    final GenerateGraphs gg = new GenerateGraphs(1);
    gg.setConnectionLevel(2); // biconnected
    gg.setVertices(mN);
    gg.setMinEdges(mN);
    gg.setMaxEdges(mN * (mN - 1));
    gg.setProcessor(this);
    gg.sanitizeParams();
    mCount = 0;
    try {
      gg.run(false, false, false, 0, 0);
    } catch (final IOException e) {
      throw new RuntimeException(e); // We are not generating output anyway
    }
    return Z.valueOf(mCount);
  }

}

