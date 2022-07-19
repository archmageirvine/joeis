package irvine.oeis.a058;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A058028 Sum of the terms of the continued fraction for the sum of the reciprocals of the first n primes.
 * @author Sean A. Irvine
 */
public class A058028 extends A000040 {

  private Q mA = Q.ZERO;

  @Override
  public Z next() {
    mA = mA.add(new Q(Z.ONE, super.next()));
    return A058027.continuedFractionSum(mA);
  }
}
