package irvine.oeis.a006;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006988 a(n) = (10^n)-th prime.
 * @author Sean A. Irvine
 */
public class A006988 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mT = 1;
  private long mN = 1;
  private Z mP = Z.ONE;

  protected long base() {
    return 10;
  }

  @Override
  public Z next() {
    for (long m = mN; m > 0; --m) {
      mP = mPrime.nextPrime(mP);
    }
    mN = mT * (base() - 1);
    mT *= base();
    return mP;
  }
}
