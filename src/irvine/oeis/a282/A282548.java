package irvine.oeis.a282;

import irvine.math.z.Z;
import irvine.oeis.a013.A013959;

/**
 * A013959 a(n) = sigma_11(n), the sum of the 11th powers of the divisors of n.
 * @author Sean A. Irvine
 */
public class A282548 extends A013959 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ZERO;
    }
    return super.next().multiply(mN);
  }
}
