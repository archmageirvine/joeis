package irvine.oeis.a033;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033446 List of quadruplets of primes with common difference 12.
 * @author Sean A. Irvine
 */
public class A033446 extends Sequence1 {

  private final Z mDiff = Z.valueOf(diff());
  protected final Fast mPrime = new Fast();
  protected Z mP = Z.ONE;
  private int mCount = 0;

  protected int diff() {
    return 12;
  }

  protected boolean is4(Z p) {
    for (int k = 0; k < 3; ++k) {
      final Z q = mPrime.nextPrime(p);
      if (!q.subtract(p).equals(mDiff)) {
        return false;
      }
      p = q;
    }
    return true;
  }

  @Override
  public Z next() {
    if (mCount > 0) {
      mP = mP.add(mDiff);
      --mCount;
      return mP;
    }
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (is4(mP)) {
        mCount = 3;
        return mP;
      }
    }
  }
}

