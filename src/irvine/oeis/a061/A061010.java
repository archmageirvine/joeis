package irvine.oeis.a061;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061010 Number of digits in (10^n)!.
 * @author Sean A. Irvine
 */
public class A061010 extends Sequence0 {

  private static final CR LOG10 = CR.TEN.log();
  private static final CR LOG_PI_2 = CR.PI.log().add(CR.TWO.log());
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final CR a = CR.valueOf(Z.TEN.pow(mN).multiply2());
    return LOG_PI_2.subtract(a).add(LOG10.multiply(mN).multiply(a.add(CR.ONE))).divide(LOG10).divide(CR.TWO).floor().add(1);
  }
}

