package irvine.oeis.a084;

import irvine.math.z.Z;

/**
 * A084040 Primes obtained as the product of successive terms of A084039 + 1, i.e., a(n) = A084039(n)*A084039(n+1) + 1.
 * @author Sean A. Irvine
 */
public class A084040 extends A084039 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.multiply(t).add(1);
  }
}

