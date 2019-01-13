package irvine.oeis.a117;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A117273.
 * @author Sean A. Irvine
 */
public class A117273 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mPiN = 0;
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final long pi = mPiN;
      if (mPrime.isPrime(++mN)) {
        ++mPiN;
      }
      if (LongUtils.digitProduct(mN) == pi) {
        return Z.valueOf(mN);
      }
    }
  }
}
