package irvine.oeis.a056;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056743 a(n) = phi(2^prime(n) - 1)/prime(n); a(0) = 0 by convention.
 * @author Sean A. Irvine
 */
public class A056743 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mP = 0;
  private Z mN = null;

  @Override
  public Z next() {
    if (mN == null) {
      mN = Z.ONE;
      return Z.ZERO;
    } else {
      final long q = mP;
      mP = mPrime.nextPrime(mP);
      mN = mN.shiftLeft((int) (mP - q));
    }
    return Jaguar.factor(mN.subtract(1)).phi().divide(mP);
  }
}
