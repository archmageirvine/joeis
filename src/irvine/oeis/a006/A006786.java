package irvine.oeis.a006;

import java.io.IOException;

import irvine.math.nauty.GenerateGraphs;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006786.
 * @author Sean A. Irvine
 */
public class A006786 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    final GenerateGraphs gg = new GenerateGraphs(1);
    gg.setVertices(++mN);
    gg.setMinEdges(0);
    gg.setMaxEdges(mN * (mN - 1) / 2);
    gg.sanitizeParams();
    try {
      gg.run(false, true, false, 0, 0);
    } catch (final IOException e) {
      throw new RuntimeException(e);
    }
    return Z.valueOf(gg.totalCount());
  }
}
