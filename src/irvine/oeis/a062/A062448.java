package irvine.oeis.a062;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A062448 Prime numbers at large subscripts: a(n) = prime(n^n).
 * @author Sean A. Irvine
 */
public class A062448 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mP = 2;
  private long mM = 1;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.TWO;
    }
    final long lim = Z.valueOf(mN).pow(mN).longValueExact();
    while (mM < lim) {
      ++mM;
      mP = mPrime.nextPrime(mP);
    }
    return Z.valueOf(mP);
  }
}
