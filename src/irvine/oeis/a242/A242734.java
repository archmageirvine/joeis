package irvine.oeis.a242;

import irvine.factor.prime.Fast;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A242734 a(n) = (smallest prime &gt; (3/2)^n) - floor((3/2)^n).
 * @author Sean A. Irvine
 */
public class A242734 extends Sequence1 {

  private static final Q C = new Q(3, 2);
  private final Fast mPrime = new Fast();
  private Q mA = Q.ONE;

  @Override
  public Z next() {
    mA = mA.multiply(C);
    final Z t = mA.toZ();
    return mPrime.nextPrime(t).subtract(t);
  }
}
