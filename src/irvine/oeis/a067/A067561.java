package irvine.oeis.a067;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A067561 Radii n of circles with integer radius that can approximately be squared integrally: the floor or ceiling of Pi*n^2 is an integer square.
 * @author Sean A. Irvine
 */
public class A067561 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final CR m = CR.PI.multiply(Z.valueOf(++mN).square());
      if (m.floor().isSquare() || m.ceil().isSquare()) {
        return Z.valueOf(mN);
      }
      if (mVerbose && mN % 10000000 == 0) {
        StringUtils.message("Search completed to " + mN);
      }
    }
  }
}
