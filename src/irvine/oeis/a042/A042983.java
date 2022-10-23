package irvine.oeis.a042;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A042983 Numbers n &gt; 99 with following property: form a sequence whose initial terms are the t digits of n, later terms given by rule b(i+1) = b(i) + product of t-1 previous terms; then n itself appears in the sequence.
 * @author Sean A. Irvine
 */
public class A042983 extends Sequence1 {

  private long mN = 204;
  private long mT = 1000;
  private int mLen = 3;

  private boolean is(final long n, final int t) {
    final long[] digits = new long[t];
    long m = n;
    for (int k = digits.length - 1; k >= 0; --k) {
      digits[k] = m % 10;
      m /= 10;
    }
    while (true) {
      long prod = 1;
      for (int k = 0; k < t - 1; ++k) {
        prod *= digits[k];
        if (prod > n) {
          return false;
        }
      }
      prod += digits[t - 1];
      if (prod == 0) {
        return false;
      }
      if (prod >= n) {
        return prod == n;
      }
      System.arraycopy(digits, 1, digits, 0, digits.length - 1);
      digits[t - 1] = prod;
    }
  }

  @Override
  public Z next() {
    while (true) {
      if (++mN == mT) {
        mT *= 10;
        ++mLen;
      }
      if (is(mN, mLen)) {
        return Z.valueOf(mN);
      }
    }
  }
}
