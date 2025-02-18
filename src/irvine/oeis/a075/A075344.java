package irvine.oeis.a075;

import irvine.math.z.Z;

/**
 * A075344 Number of primes between consecutive terms of A075343 (excluding endpoints).
 * @author Sean A. Irvine
 */
public class A075344 extends A075343 {

  private Z mA = super.next();
  private int mN = 1;

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.subtract(t).subtract(++mN);
  }
}
