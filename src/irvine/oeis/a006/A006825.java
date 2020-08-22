package irvine.oeis.a006;

import java.io.IOException;

import irvine.math.nauty.GenerateGraphs;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006825 Number of connected regular bipartite graphs of degree 5 with 2n nodes.
 * @author Sean A. Irvine
 */
public class A006825 implements Sequence {

  private int mN = 8;

  @Override
  public Z next() {
    mN += 2;
    final GenerateGraphs gg = new GenerateGraphs(1);
    gg.setVertices(mN);
    gg.setMinEdges(0);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.setMinDeg(5);
    gg.setMaxDeg(5);
    gg.setConnectionLevel(1);
    gg.sanitizeParams();
    try {
      gg.run(true /* bipartite */, false, false, 0, 0);
    } catch (final IOException e) {
      throw new RuntimeException(e);
    }
    return Z.valueOf(gg.totalCount());
  }
}
