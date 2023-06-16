package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A007663 Fermat quotients: (2^(p-1)-1)/p, where p=prime(n).
 * @author Sean A. Irvine
 */
public class A007663 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private long mP = 2;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    return Z.ONE.shiftLeft(mP - 1).subtract(1).divide(mP);
  }
}
