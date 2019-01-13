package irvine.oeis.a013;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013916.
 * @author Sean A. Irvine
 */
public class A013916 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mSum = Z.ZERO;
  private Z mP = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mP = mPrime.nextPrime(mP);
      mSum = mSum.add(mP);
      if (mPrime.isPrime(mSum)) {
        return Z.valueOf(mN);
      }
    }
  }
}
