package irvine.oeis.a075;

import irvine.factor.prime.Fast;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075442 Slowest-growing sequence of primes whose reciprocals sum to 1.
 * @author Sean A. Irvine
 */
public class A075442 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Q mA = Q.ONE;

  @Override
  public Z next() {
    final Z p = mPrime.nextPrime(mA.reciprocal().add(1).ceiling().subtract(1));
    mA = mA.subtract(new Q(1, p));
    return p;
  }
}
