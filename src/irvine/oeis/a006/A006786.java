package irvine.oeis.a006;

import irvine.math.nauty.GenerateGraphs;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006786 Number of squarefree graphs on n vertices.
 * @author Sean A. Irvine
 */
public class A006786 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final GenerateGraphs gg = new GenerateGraphs(1);
    gg.setVertices(++mN);
    gg.setMinEdges(0);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.sanitizeParams();
    gg.run(false, true, false, 0, 0);
    return Z.valueOf(gg.totalCount());
  }
}
