package irvine.oeis.a391;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A391636 Integers k such that the sum of the products of each digit of k and the number obtained by removing that digit is equal to k.
 * @author Sean A. Irvine
 */
public class A391636 extends Sequence1 {

  private long mN = 35;

  private boolean is(final long n) {
    final String s = String.valueOf(n);
    long sum = 0;
    for (int k = 0; k < s.length(); ++k) {
      final int c = s.charAt(k) - '0';
      if (c != 0) {
        final long v = Long.parseLong(s.substring(0, k) + s.substring(k + 1));
        sum += c * v;
        if (sum > n) {
          return false;
        }
      }
    }
    return sum == n;
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
