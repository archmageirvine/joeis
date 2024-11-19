package irvine.oeis.a086;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A086360 The n-th primorial number reduced modulo 9.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A086360 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mP = 1;
  private long mPrimorial = 1;

  @Override
  public Z next() {
    mPrimorial *= mP;
    mPrimorial %= 9;
    mP = mPrime.nextPrime(mP);
    return Z.valueOf(mPrimorial);
  }
}
