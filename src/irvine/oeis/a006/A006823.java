package irvine.oeis.a006;

import java.io.IOException;

import irvine.math.nauty.GenerateGraphs;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006823 Number of connected trivalent bipartite graphs with 2n nodes.
 * @author Sean A. Irvine
 */
public class A006823 implements Sequence {

  private int mN = 4;

  @Override
  public Z next() {
    mN += 2;
    final GenerateGraphs gg = new GenerateGraphs(1);
    gg.setVertices(mN);
    gg.setMinEdges(0);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setMinDeg(3);
    gg.setMaxDeg(3);
    gg.setConnectionLevel(1);
    gg.sanitizeParams();
    try {
      gg.run(true /* bipartite */, false, false, 0, 0);
    } catch (final IOException e) {
      throw new RuntimeException(e); // We are not generating output anyway
    }
    return Z.valueOf(gg.totalCount());
  }
}
