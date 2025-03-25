package irvine.oeis.a076;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence3;
import irvine.oeis.a006.A006882;

/**
 * A076198 a(n)=least s&gt;0 such that n!!-s is prime.
 * @author Sean A. Irvine
 */
public class A076198 extends Sequence3 {

  private final Sequence mA = new A006882().skip(3);

  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    final Z df = mA.next();
    return df.subtract(mPrime.prevPrime(df));
  }
}
