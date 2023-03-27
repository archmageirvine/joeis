package irvine.oeis.a062;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A062313 Factorials of nonprime numbers.
 * @author Sean A. Irvine
 */
public class A062313 extends A000142 {

  private final Fast mPrime = new Fast();
  {
    super.next();
    setOffset(1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z f = super.next();
      if (!mPrime.isPrime(mN)) {
        return f;
      }
    }
  }
}

