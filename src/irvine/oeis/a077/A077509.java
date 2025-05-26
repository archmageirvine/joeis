package irvine.oeis.a077;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A077509 a(n) = (n+1)*10^d - A077508(n) where d = n - number of digits in n.
 * @author Sean A. Irvine
 */
public class A077509 extends Sequence2 {

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
    final Z t = new Z(sb).add(1);
    return t.subtract(mPrime.prevPrime(t));
  }
}
