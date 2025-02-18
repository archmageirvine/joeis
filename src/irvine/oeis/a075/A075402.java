package irvine.oeis.a075;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000217;

/**
 * A075402 Smallest number such that a(n) + T(n) is a prime, where T(n) is the n-th triangular number.
 * @author Sean A. Irvine
 */
public class A075402 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final Sequence mTriangular = new A000217().skip();

  @Override
  public Z next() {
    final Z t = mTriangular.next();
    return mPrime.nextPrime(t.subtract(1)).subtract(t);
  }
}
