package irvine.oeis.a084;

import irvine.math.z.Z;

/**
 * A084403 Primes arising in A084402. a(n) = n-th partial product of A084402 - 1.
 * @author Sean A. Irvine
 */
public class A084403 extends A084402 {

  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mA = mA.multiply(super.next());
    return mA.subtract(1);
  }
}
