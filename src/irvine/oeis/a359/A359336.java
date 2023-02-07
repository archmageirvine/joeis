package irvine.oeis.a359;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A359336 allocated for Valentin Bakoev.
 * @author Sean A. Irvine
 */
public class A359336 extends Sequence1 {

  // Probably not the best way of dealing with 1s, but gets the job done

  private long mN = 0;

  private boolean search(final int ones, final String s, final long n) {
    if (n == 1) {
      return StringUtils.isPalindrome(s);
    }
    for (long k = 2; k <= n; ++k) {
      if (n % k == 0) {
        final String t = s + k;
        for (int j = 0; j < ones; ++j) {
          if (search(ones, t + "1".repeat(j), n / k)) {
            return true;
          }
        }
      }
    }
    return false;
  }

  private boolean is(final long n) {
    int ones = 0;
    long t = 1;
    while (t <= n) {
      ++ones;
      t *= 10;
    }
    for (int k = 0; k < ones; ++k) {
      if (search(ones, "1".repeat(k), n)) {
        return false;
      }
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
