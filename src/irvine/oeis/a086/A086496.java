package irvine.oeis.a086;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086496 Rearrangement of natural numbers such that every 2n-th partial sum is prime. Every (2n+1)-th term is the smallest number not included earlier.
 * @author Sean A. Irvine
 */
public class A086496 extends Sequence1 {

  private final HashSet<Long> mUsed = new HashSet<>();
  private long mLeastUnused = 1;
  private Z mSum = Z.ZERO;
  private boolean mOdd = false;

  @Override
  public Z next() {
    while (mUsed.remove(mLeastUnused)) {
      ++mLeastUnused;
    }
    mOdd = !mOdd;
    if (mOdd) {
      mSum = mSum.add(mLeastUnused);
      return Z.valueOf(mLeastUnused++);
    } else {
      long k = mLeastUnused;
      while (mUsed.contains(k) || !mSum.add(k).isProbablePrime()) {
        ++k;
      }
      mUsed.add(k);
      mSum = mSum.add(k);
      return Z.valueOf(k);
    }
  }
}

