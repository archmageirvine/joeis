package irvine.oeis.a387;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A387069 Numbers whose representation in base b are their representation in base b+1 with a "0" added at the end for some b.
 * @author Sean A. Irvine
 */
public class A387069 extends Sequence1 {

  private long mN = 0;

  private boolean is(final long n, final long b) {
    if (n % b != 0) {
      return false;
    }
    long r = n / b;
    long s = n;
    while (r != 0) {
      if (r % b != s % (b + 1)) {
        return false;
      }
      r /= b;
      s /= b + 1;
    }
    return s == 0;
  }

  private boolean is(final long n) {
    int len = Functions.DIGIT_LENGTH.i(2, n);
    for (long b = 2; b <= n; ++b) {
      final int lb = Functions.DIGIT_LENGTH.i(b + 1, n);
      if (lb == len) {
        return false;
      }
      if (lb + 1 == len && is(n, b)) {
        return true;
      }
      len = lb;
    }
    return false;
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
