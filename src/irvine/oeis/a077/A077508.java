package irvine.oeis.a077;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A077508 Largest n-digit prime beginning with n.
 * @author Sean A. Irvine
 */
public class A077508 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    final StringBuilder sb = new StringBuilder();
    sb.append(mN);
    while (sb.length() < mN) {
      sb.append(9);
    }
    return mPrime.prevPrime(new Z(sb).add(1));
  }
}
