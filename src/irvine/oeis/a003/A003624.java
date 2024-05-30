package irvine.oeis.a003;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A003624 Duffinian numbers: composite numbers k relatively prime to sigma(k).
 * @author Sean A. Irvine
 */
public class A003624 extends Sequence1 {

  private long mN = 3;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (!mPrime.isPrime(mN)) {
        final Z sigma = Functions.SIGMA1.z(mN);
        if (Functions.GCD.l(mN, sigma) == 1) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
