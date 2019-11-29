package irvine.oeis.a027;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027706 n-th prime has odd number of <code>1</code>'s in binary expansion and <code>(n+1)st</code> prime has even number of <code>1</code>'s.
 * @author Sean A. Irvine
 */
public class A027706 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mP = mPrime.nextPrime(mP);
      if ((mP.bitCount() & 1) == 1 && (mPrime.nextPrime(mP).bitCount() & 1) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
