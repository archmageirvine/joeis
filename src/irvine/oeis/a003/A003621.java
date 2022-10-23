package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A003621 Number of iterations until n reaches 1 or 4 under x goes to sum of squares of digits map.
 * @author Sean A. Irvine
 */
public class A003621 extends Sequence1 {

  private static final long[] DIGIT_SQUARES = {0, 1, 4, 9, 16, 25, 36, 49, 64, 81};
  private long mN = 0;

  private long digitSquareSum(long n) {
    long s = 0;
    while (n != 0) {
      s += DIGIT_SQUARES[(int) (n % 10)];
      n /= 10;
    }
    return s;
  }

  @Override
  public Z next() {
    long count = 0;
    long m = ++mN;
    while (m != 1 && m != 4) {
      m = digitSquareSum(m);
      ++count;
    }
    return Z.valueOf(count);
  }
}
