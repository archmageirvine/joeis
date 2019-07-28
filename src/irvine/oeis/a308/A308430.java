package irvine.oeis.a308;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A308430 Number of <code>0</code>'s minus number of <code>1</code>'s among the edge truncated binary representations of the first n prime numbers.
 * @author Sean A. Irvine
 */
public class A308430 implements Sequence {

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
