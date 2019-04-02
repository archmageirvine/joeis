package irvine.oeis.a000;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.DynamicArray;

/**
 * A000230 Smallest prime p such that there is a gap of 2n between p and next prime.
 * @author Sean A. Irvine
 */
public class A000230 implements Sequence {

  private Z mP = Z.TWO;
  private int mGapSize = -2;
  private final DynamicArray<Z> mLeastPrime = new DynamicArray<>();
  private final Fast mPrime = new Fast();

  private Z leastGap(final int gap) {
    final int g = gap / 2;
    final Z r = mLeastPrime.get(g);
    if (r != null) {
      return r;
    }
    while (true) {
      final Z old = mP;
      mP = mPrime.nextPrime(mP);
      final int delta = mP.subtract(old).intValue() / 2;
      if (mLeastPrime.get(delta) == null) {
        mLeastPrime.set(delta, old);
      }
      if (delta == g) {
        return old;
      }
    }
  }


  @Override
  public Z next() {
    mGapSize += 2;
    return leastGap(mGapSize);
  }

}

