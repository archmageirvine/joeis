package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060146 Take the first 2n integers and using each integer once and only once as either a numerator or a denominator, construct n fractions whose sum is an integer; a(n) = number of distinct solutions for n.
 * @author Sean A. Irvine
 */
public class A060146 extends Sequence1 {

  // Simple exhaustive search.
  // Avoids using Q directly.
  // The "den" part could safely to done as long for mN <= 20

  private int mN = 0;
  private long mCount = 0;
  private boolean[] mUsed = null;

  private void search(final Z num, final Z den, final int prevNum, final int usedCount) {
    if (usedCount == mN) {
      if (num.mod(den).isZero()) {
        ++mCount;
      }
      return;
    }
    for (int numerator = prevNum + 1; numerator <= mN; ++numerator) {
      if (!mUsed[numerator]) {
        mUsed[numerator] = true;
        for (int denominator = 1; denominator <= mN; ++denominator) {
          if (!mUsed[denominator]) {
            mUsed[denominator] = true;
            search(num.multiply(denominator).add(den.multiply(numerator)), den.multiply(denominator), numerator, usedCount + 2);
            mUsed[denominator] = false;
          }
        }
        mUsed[numerator] = false;
      }
    }
  }

  @Override
  public Z next() {
    mN += 2;
    mCount = 0;
    mUsed = new boolean[mN + 1]; // position 0 not used
    search(Z.ZERO, Z.ONE, 0, 0);
    return Z.valueOf(mCount);
  }
}
