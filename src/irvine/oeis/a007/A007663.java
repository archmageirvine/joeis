package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007663 Fermat quotients: <code>(2^(p-1)-1)/p</code>, where <code>p=prime(n)</code>.
 * @author Sean A. Irvine
 */
public class A007663 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mP = 2;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    return Z.ONE.shiftLeft((int) (mP - 1)).subtract(1).divide(mP);
  }
}
