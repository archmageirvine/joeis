package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061854 Nondiving binary sequences: numbers which in base 2 have at least the same number of 1's as 0's and reading the binary expansion from left (msb) to right (least significant bit), the number of 0's never exceeds the number of 1's.
 * @author Sean A. Irvine
 */
public class A061854 extends Sequence1 {

  private long mN = 0;

  private boolean is(final long n) {
    final String s = Long.toBinaryString(n);
    int zeros = 0;
    int ones = 0;
    for (int k = 0; k < s.length(); ++k) {
      if (s.charAt(k) == '1') {
        ++ones;
      } else if (++zeros > ones) {
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
