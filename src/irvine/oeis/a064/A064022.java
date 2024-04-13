package irvine.oeis.a064;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064022 a(n) is the smallest value of m such that prod(m) = n*length(m)*sum(m) where prod(m) is the product of the digits of m, length(m) is the number of digits of m, sum(m) is the sum of the digits of m; or 0 if no such m exists.
 * @author Sean A. Irvine
 */
public class A064022 extends Sequence1 {

  private long mN = 0;

  private boolean isSevenSmooth(long n) {
    while ((n & 1) == 0) {
      n >>= 1;
    }
    while (n % 3 == 0) {
      n /= 3;
    }
    while (n % 5 == 0) {
      n /= 5;
    }
    while (n % 7 == 0) {
      n /= 7;
    }
    return n == 1;
  }

  @Override
  public Z next() {
    if (!isSevenSmooth(++mN)) {
      return Z.ZERO;
    }
    long len = 1;
    long lim = 10;
    long m = 0;
    while (true) {
      if (++m == lim) {
        lim *= 10;
        ++len;
      }
      if (Functions.DIGIT_PRODUCT.l(m) == len * mN * Functions.DIGIT_SUM.l(m)) {
        return Z.valueOf(m);
      }
    }
  }
}
