package irvine.oeis.a000;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000101 Increasing gaps between primes (upper end) (compare A002386, which gives lower ends of these gaps).
 * @author Sean A. Irvine
 */
public class A000101 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = Z.TWO;
  private Z mGap = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z a = mP;
      mP = mPrime.nextPrime(a);
      final Z diff = mP.subtract(a);
      if (diff.compareTo(mGap) > 0) {
        mGap = diff;
        return mP;
      }
    }
  }
}

