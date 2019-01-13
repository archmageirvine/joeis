package irvine.oeis.a014;

import java.io.IOException;

import irvine.math.nauty.GenerateGraphs;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014371.
 * @author Sean A. Irvine
 */
public class A014371 implements Sequence {

  private int mN = -2;

  @Override
  public Z next() {
    mN += 2;
    if (mN == 0) {
      return Z.ONE;
    }
    final GenerateGraphs gg = new GenerateGraphs(1);
    gg.setConnectionLevel(1);
    gg.setVertices(mN);
    gg.setMinEdges(3 * mN / 2);
    gg.setMaxEdges(3 * mN / 2);
    gg.setMinDeg(3);
    gg.setMaxDeg(3);
    gg.sanitizeParams();
    try {
      gg.run(false, false, true, 0, 0);
    } catch (final IOException e) {
      throw new RuntimeException(e);
    }
    return Z.valueOf(gg.totalCount());
  }
}

