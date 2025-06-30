package irvine.oeis.a077;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A077504 Smallest n-digit prime beginning with n.
 * @author Sean A. Irvine
 */
public class A077504 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    final StringBuilder sb = new StringBuilder();
    sb.append(mN);
    while (sb.length() < mN) {
      sb.append(0);
    }
    return mPrime.nextPrime(new Z(sb));
  }
}
