package irvine.oeis.a073;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A073237 a(n) = ceiling(Pi^Pi^...^Pi), where Pi appears n times.
 * @author Sean A. Irvine
 */
public class A073237 extends Sequence0 {

  private CR mA = null;

  @Override
  public Z next() {
    mA = mA == null ? CR.ONE : CR.PI.pow(mA);
    return mA.ceil();
  }
}
