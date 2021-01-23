package irvine.oeis.a014;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014521 Nearest integer to Gamma(n+1/2).
 * @author Sean A. Irvine
 */
public class A014521 implements Sequence {

  private static final CR SQRT_PI = CR.SQRT_PI;
  private Z mF = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(2L * mN - 1);
    }
    return CR.valueOf(new Q(mF, Z.ONE.shiftLeft(mN))).multiply(SQRT_PI).round();
  }
}
