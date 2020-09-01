package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034711 Largest number whose base n representation does not repeat a pair of consecutive digits.
 * @author Sean A. Irvine
 */
public class A034711 implements Sequence {

  private int mN = 1;

  static boolean search(final boolean[] seenPairs, final int[] digits, final int pos, final int n) {
    if (pos == digits.length) {
      return true;
    }
    for (int d = n - 1; d >= 0; --d) {
      if (pos == 0) {
        digits[pos] = d;
        if (search(seenPairs, digits, pos + 1, n)) {
          return true;
        }
      } else {
        final int pair = digits[pos - 1] * n + d;
        if (!seenPairs[pair]) {
          digits[pos] = d;
          seenPairs[pair] = true;
          if (search(seenPairs, digits, pos + 1, n)) {
            return true;
          }
          seenPairs[pair] = false;
        }
      }
    }
    return false;
  }

  @Override
  public Z next() {
    final boolean[] seenPairs = new boolean[++mN * mN];
    final int[] digits = new int[mN * mN + 1];
    if (!search(seenPairs, digits, 0, mN)) {
      throw new RuntimeException();
    }
    Z res = Z.ZERO;
    for (final int d : digits) {
      res = res.multiply(mN).add(d);
    }
    return res;
  }
}
