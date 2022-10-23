package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013763 a(n) = 18^(3*n + 2).
 * @author Sean A. Irvine
 */
public class A013763 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(324) : mA.multiply(5832);
    return mA;
  }
}
