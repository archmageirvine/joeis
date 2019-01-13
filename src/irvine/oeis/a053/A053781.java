package irvine.oeis.a053;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053781.
 * @author Sean A. Irvine
 */
public class A053781 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mC = 3;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      do {
        ++mC;
      } while (mPrime.isPrime(mC));
      mSum = mSum.add(mC);
      if (mSum.mod(++mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

