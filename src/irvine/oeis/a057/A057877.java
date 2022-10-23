package irvine.oeis.a057;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A057877 a(n) = smallest n-digit prime in A057876.
 * @author Sean A. Irvine
 */
public class A057877 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private Z mN = Z.ONE;

  @Override
  public Z next() {
    mN = mN.multiply(10);
    Z p = mN.multiply(10).subtract(1).divide(9).subtract(1);
    while (true) {
      p = mPrime.nextPrime(p);
      if (A057876.is(String.valueOf(p))) {
        return p;
      }
    }
  }
}

