package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A054271 Difference between prime(n)^2 and the previous prime.
 * @author Sean A. Irvine
 */
public class A054271 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next().square();
    return p.subtract(mPrime.prevPrime(p));
  }
}
