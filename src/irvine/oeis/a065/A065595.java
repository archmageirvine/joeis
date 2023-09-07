package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A065595 a(n) = (sum of first n primes)^2 - sum of squares of first n primes.
 * @author Sean A. Irvine
 */
public class A065595 extends A000040 {

  private Z mSumSquares = Z.ZERO;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    final Z p = super.next();
    mSum = mSum.add(p);
    mSumSquares = mSumSquares.add(p.square());
    return mSum.square().subtract(mSumSquares);
  }
}
