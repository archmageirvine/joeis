package irvine.oeis.a308;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A308430 Number of 0's minus number of 1's among the edge truncated binary representations of the first n prime numbers.
 * @author Sean A. Irvine
 */
public class A308430 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mSum = Z.ZERO;
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    if (Z.FIVE.compareTo(mP) <= 0) {
      mSum = mSum.add(mP.bitLength() - 2 * mP.bitCount() + 2);
    }
    return mSum;
  }
}
