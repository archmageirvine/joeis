package irvine.oeis.a038;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038868 If a Fibonacci sequence is formed with first term = number of digits in n and second term = sum of decimal digits in n, then n itself occurs as a term in the sequence after the first two terms.
 * @author Sean A. Irvine
 */
public class A038868 extends Sequence1 {

  private long mN = 15;
  private long mDigits = 2;
  private long mLim = 100;

  private boolean contains(long a, long b, final long n) {
    while (b < n) {
      final long t = a + b;
      a = b;
      b = t;
    }
    return b == n;
  }

  @Override
  public Z next() {
    while (true) {
      if (++mN == mLim) {
        mLim *= 10;
        ++mDigits;
      }
      if (contains(mDigits, Functions.DIGIT_SUM.l(mN), mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
