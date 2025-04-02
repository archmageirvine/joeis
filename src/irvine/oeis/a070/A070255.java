package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070255 Numbers which divided into two substrings by breaking at any digit then one of them divides the other (0 is not to be considered a substring, multiples of 10 are excluded).
 * @author Sean A. Irvine
 */
public class A070255 extends Sequence1 {

  private static final long[] POW10 = {1L, 10L, 100L, 1000L,
    10000L,
    100000L,
    1000000L,
    10000000L,
    100000000L,
    1000000000L,
    10000000000L,
    100000000000L,
    1000000000000L,
    10000000000000L};
  private long mN = 10;

  private static boolean is(final long n) {
    if (n % 10 == 0) {
      return false;
    }
    int k = 1;
    while (POW10[k] < n) {
      final long a = n / POW10[k];
      final long b = n % POW10[k];
      if (a % b != 0 && b % a != 0) {
        return false;
      }
      ++k;
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
