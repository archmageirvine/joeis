package irvine.oeis.a005;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005867 a(0) = 1; for n &gt; 0, a(n) = (prime(n)-1)*a(n-1).
 * @author Sean A. Irvine
 */
public class A005867 extends Sequence0 {

  private Z mA = Z.ONE;
  private long mP = 0;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    if (mP == 0) {
      mP = 1;
    } else {
      mP = mPrime.nextPrime(mP);
      mA = mA.multiply(mP - 1);
    }
    return mA;
  }
}
