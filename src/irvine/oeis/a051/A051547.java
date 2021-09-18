package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a000.A000010;

/**
 * A051547 a(n) = lcm{ phi(1), ..., phi(n) }, where phi is Euler's totient function A000010.
 * @author Sean A. Irvine
 */
public class A051547 extends A000010 {

  private Z mLcm = Z.ONE;

  @Override
  public Z next() {
    mLcm = mLcm.lcm(super.next());
    return mLcm;
  }
}
