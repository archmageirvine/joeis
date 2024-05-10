package irvine.oeis.a069;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069639 Smallest composite k such that phi(k) &gt; k*(1-1/n^2).
 * @author Sean A. Irvine
 */
public class A069639 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mPrime.nextPrime(mN.square()).square();
  }
}
