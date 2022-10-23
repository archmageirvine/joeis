package irvine.oeis.a037;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A037049 Smallest number with two distinct prime factors both of length n.
 * @author Sean A. Irvine
 */
public class A037049 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(10);
    final Z p = mPrime.nextPrime(mN);
    return p.multiply(mPrime.nextPrime(p));
  }
}
