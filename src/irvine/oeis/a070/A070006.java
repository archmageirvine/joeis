package irvine.oeis.a070;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070006 Composite numbers that are not a prime power and whose distinct prime divisors' arithmetic mean is a prime.
 * @author Sean A. Irvine
 */
public class A070006 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 20;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      final int omega = fs.omega();
      if (omega > 1) {
        final Z[] t = fs.sopf().divideAndRemainder(omega);
        if (t[1].isZero() && mPrime.isPrime(t[0])) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
