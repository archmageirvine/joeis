package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a006.A006995;

/**
 * A061851 Digital representation of n contains only 1's and 0's, is palindromic and contains no singleton 1's or 0's.
 * @author Sean A. Irvine
 */
public class A061851 extends A006995 {

  private boolean is(final Z n) {
    if (n.isZero()) {
      return false;
    }
    long prev = -1;
    long cnt = 2;
    for (int k = 0; k < n.bitLength(); ++k) {
      final long bit = n.testBit(k) ? 1 : 0;
      if (bit != prev) {
        if (cnt == 1) {
          return false;
        }
        prev = bit;
        cnt = 1;
      } else {
        ++cnt;
      }
    }
    return cnt != 1;
  }

  @Override
  public Z next() {
    while (true) {
      final Z palin = super.next();
      if (is(palin)) {
        return new Z(palin.toString(2));
      }
    }
  }
}
