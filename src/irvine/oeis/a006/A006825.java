package irvine.oeis.a006;

import irvine.math.nauty.GenerateGraphs;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A006825 Number of connected regular bipartite graphs of degree 5 with 2n nodes.
 * @author Sean A. Irvine
 */
public class A006825 extends AbstractSequence {

  /** Construct the sequence. */
  public A006825() {
    super(5);
  }

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
    gg.run(GenerateGraphs.BIPARTITE, 0, 0);
    return Z.valueOf(gg.totalCount());
  }
}
