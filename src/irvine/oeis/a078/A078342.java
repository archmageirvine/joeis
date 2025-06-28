package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078342 Number of positive integers less than n that are coprime to all primes less than or equal to the square root of n.
 * @author Sean A. Irvine
 */
public class A078342 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    return Z.ONE.add(Functions.PRIME_PI.l(mN - 1)).subtract(Functions.PRIME_PI.l(Functions.SQRT.l(mN)));
  }
}

