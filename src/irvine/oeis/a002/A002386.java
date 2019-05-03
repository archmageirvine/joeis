package irvine.oeis.a002;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002386 Increasing gaps between primes (lower <code>end)</code>: primes <code>p(k)</code> where <code>p(k+1) - p(k)</code> exceeds <code>p(j+1) - p(j)</code> for all j <code>&lt</code>; k.
 * @author Sean A. Irvine
 */
public class A002386 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = Z.TWO;
  private Z mGap = Z.ZERO;
  protected long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z a = mP;
      mP = mPrime.nextPrime(a);
      ++mN;
      final Z diff = mP.subtract(a);
      if (diff.compareTo(mGap) > 0) {
        mGap = diff;
        return a;
      }
    }
  }
}

