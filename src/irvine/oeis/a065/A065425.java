package irvine.oeis.a065;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A065425 Smallest odd prime greater than n such that the decimal expansion of its base n conversion is also prime.
 * @author Sean A. Irvine
 */
public class A065425 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private int mN = 1;

  @Override
  public Z next() {
    long p = ++mN;
    while (true) {
      p = mPrime.nextPrime(p);
      final StringBuilder sb = new StringBuilder();
      long q = p;
      while (q != 0) {
        sb.insert(0, q % mN);
        q /= mN;
      }
      if (new Z(sb).isProbablePrime()) {
        return Z.valueOf(p);
      }
    }
  }
}
