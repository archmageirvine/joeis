package irvine.oeis.a165;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A165906 Sum of first n primes divided by the n-th prime, rounded up to the nearest integer.
 * @author Sean A. Irvine
 */
public class A165906 extends A000040 {

  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    final Z prime = super.next();
    mSum = mSum.add(prime);
    return new Q(mSum, prime).ceiling();
  }
}
