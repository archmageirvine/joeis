package irvine.oeis.a084;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084048 Integers m such that the base-10 digit concatenation 2 m 3 m 5 m ... prime(49) m prime(50) is prime.
 * @author Sean A. Irvine
 */
public class A084048 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 95;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final StringBuilder sb = new StringBuilder("2");
      long p = 3;
      while (p <= 229) {
        sb.append(mN).append(p);
        p = mPrime.nextPrime(p);
      }
      if (new Z(sb).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

