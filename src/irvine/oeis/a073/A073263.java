package irvine.oeis.a073;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073263 Integer quotients of partial sum of first n composite and n (see A053781).
 * @author Sean A. Irvine
 */
public class A073263 extends Sequence1 {

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
        return mSum.divide(mN);
      }
    }
  }
}

