package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013888 a(n) = 18^(5*n + 3).
 * @author Sean A. Irvine
 */
public class A013888 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(5832) : mA.multiply(1889568);
    return mA;
  }
}
