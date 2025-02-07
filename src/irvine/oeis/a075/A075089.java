package irvine.oeis.a075;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A075078.
 * @author Sean A. Irvine
 */
public class A075089 extends A002808 {

  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    final long m = super.next().longValue();
    long p = 1;
    while (true) {
      p = mPrime.nextPrime(p);
      if (p % m == 1) {
        return Z.valueOf(p);
      }
    }
  }
}

