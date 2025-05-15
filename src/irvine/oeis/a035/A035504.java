package irvine.oeis.a035;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A035504 Numbers that eventually reach 1 under "x -&gt; sum of cubes of digits of x".
 * @author Sean A. Irvine
 */
public class A035504 extends Sequence1 {

  private long mN = 0;
  private final long[] mCache = new long[1000000]; // Remembers the result for small values
  private final HashSet<Long> mSeen = new HashSet<>();

  private long cubeDigitSum(final long n) {
    if (n < mCache.length) {
      final long r = mCache[(int) n];
      if (r != 0) {
        return r;
      }
    }
    final long s = Functions.DIGIT_SUM_CUBES.l(n);
    if (n < mCache.length) {
      mCache[(int) n] = s;
    }
    return s;
  }

  protected boolean isCubicHappy(long n) {
    mSeen.clear();
    while (true) {
      if (n == 1) {
        return true;
      }
      if (!mSeen.add(n)) {
        return false; // cycles
      }
      n = cubeDigitSum(n);
    }
  }

  @Override
  public Z next() {
    while (true) {
      if (isCubicHappy(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
