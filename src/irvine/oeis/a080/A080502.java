package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080502 a(1) = 1, a(n) = smallest multiple of n that can be obtained by inserting digits anywhere in a(n-1) if necessary.
 * @author Sean A. Irvine
 */
public class A080502 extends Sequence1 {

  private Z mA = Z.ONE;
  private long mN = 0;

  private Z try1Digit(final String s) {
    Z min = null;
    for (int k = 0; k <= s.length(); ++k) {
      final String left = s.substring(0, k);
      final String right = s.substring(k);
      for (int d = k == 0 ? 1 : 0; d < 10; ++d) {
        final Z t = new Z(left + d + right);
        if (t.mod(mN) == 0 && (min == null || t.compareTo(min) < 0)) {
          min = t;
        }
      }
    }
    return min;
  }

  private Z try2Digits(final String s) {
    Z min = null;
    for (int k = 0; k <= s.length(); ++k) {
      final String left = s.substring(0, k);
      for (int j = k; j <= s.length(); ++j) {
        final String mid = s.substring(k, j);
        final String right = s.substring(j);
        for (int d1 = k == 0 ? 1 : 0; d1 < 10; ++d1) {
          for (int d2 = 0; d2 < 10; ++d2) {
            final Z t = new Z(left + d1 + mid + d2 + right);
            if (t.mod(mN) == 0 && (min == null || t.compareTo(min) < 0)) {
              min = t;
            }
          }
        }
      }
    }
    return min;
  }

  @Override
  public Z next() {
    if (++mN > 1 && mA.mod(mN) != 0) {
      final String s = mA.toString();
      mA = try1Digit(s);
      if (mA == null) {
        mA = try2Digits(s);
        if (mA == null) {
          throw new RuntimeException("Two digits was not enough");
        }
      }
    }
    return mA;
  }
}

