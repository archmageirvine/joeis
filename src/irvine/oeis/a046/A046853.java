package irvine.oeis.a046;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a002.A002385;

/**
 * A046853 Denominator of sum of reciprocals of first n palindromic primes.
 * @author Sean A. Irvine
 */
public class A046853 extends A002385 {

  private Q mSum = Q.ZERO;

  @Override
  public Z next() {
    mSum = mSum.add(new Q(Z.ONE, super.next()));
    return mSum.den();
  }
}
