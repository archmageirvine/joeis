package irvine.oeis.a003;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003624 Duffinian numbers: composite numbers k relatively prime to sigma(k).
 * @author Sean A. Irvine
 */
public class A003624 implements Sequence {

  private long mN = 3;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (!mPrime.isPrime(mN)) {
        final Z sigma = Jaguar.factor(mN).sigma();
        if (LongUtils.gcd(mN, sigma.longValueExact()) == 1) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
