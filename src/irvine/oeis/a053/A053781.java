package irvine.oeis.a053;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053781 Numbers k that divide the sum of the first k composite numbers.
 * @author Sean A. Irvine
 */
public class A053781 extends Sequence1 {

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

