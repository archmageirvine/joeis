package irvine.oeis.a077;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A077505 a(n) = A077504(n) - n*10^d where d = n - number of digits in n.
 * @author Sean A. Irvine
 */
public class A077505 extends Sequence2 {

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
    final Z t = new Z(sb);
    return mPrime.nextPrime(t).subtract(t);
  }
}
