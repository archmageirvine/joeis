package irvine.oeis.a384;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A384508 Nonnegative integers k such that the digits of k include the digits of the digital sum of k as a (not necessarily contiguous) subsequence.
 * @author Sean A. Irvine
 */
public class A384508 extends Sequence1 {

  private long mN = -1;

  private boolean is(long n) {
    long d = Functions.DIGIT_SUM.l(n);
    while (d != 0) {
      if (n % 10 == d % 10) {
        d /= 10;
      }
      if (n == 0) {
        return false;
      }
      n /= 10;
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

