package irvine.oeis.a027;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A027708 n-th prime has odd number of 1's in binary expansion and (n+1)st prime also has odd number of 1's.
 * @author Sean A. Irvine
 */
public class A027708 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mP = mPrime.nextPrime(mP);
      if ((mP.bitCount() & 1) == 1 && (mPrime.nextPrime(mP).bitCount() & 1) == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
