package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A060585 Write n in base 3, then (working from left to right) if the k-th digit of n is not equal to the digit to its left then the k-th digit of a(n) is 1, otherwise it is 0, and finally read the result as a base-2 number.
 * @author Sean A. Irvine
 */
public class A060585 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    final String s = Long.toString(mN, 3);
    long res = 1;
    for (int k = 1; k < s.length(); ++k) {
      res *= 2;
      if (s.charAt(k) != s.charAt(k - 1)) {
        res += 1;
      }
    }
    return Z.valueOf(res);
  }
}
