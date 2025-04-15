package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.a039.A039992;

/**
 * A076730 Maximum number of (distinct) primes that an n-digit number may shelter (i.e., primes contained among all digital substrings' permutations).
 * @author Sean A. Irvine
 */
public class A076730 extends A039992 {

  private long mN = 1;
  private long mLim = 1;
  private Z mMax = Z.ZERO;

  @Override
  public Z next() {
    mLim *= 10;
    while (mN < mLim) {
      final Z c = count(Z.valueOf(mN));
      if (c.compareTo(mMax) > 0) {
        mMax = c;
      }
      ++mN;
    }
    return mMax;
  }
}
