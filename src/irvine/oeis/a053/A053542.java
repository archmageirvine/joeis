package irvine.oeis.a053;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A053542 Distance from n-th composite number (A002808) to next prime.
 * @author Sean A. Irvine
 */
public class A053542 extends A002808 {

  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    final Z c = super.next();
    return mPrime.nextPrime(c).subtract(c);
  }
}
