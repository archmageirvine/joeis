package irvine.oeis.a045;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045717 For each prime p take the sum of nonprimes &lt; p.
 * @author Sean A. Irvine
 */
public class A045717 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mSum = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    while (!mPrime.isPrime(++mN)) {
      mSum = mSum.add(mN);
    }
    return mSum;
  }
}
