package irvine.oeis.a060;

import irvine.math.z.Z;

/**
 * A060589.
 * @author Sean A. Irvine
 */
public class A060586 extends A060583 {

  @Override
  public Z next() {
    final Z n = super.next();
    if (n.isZero()) {
      return Z.ZERO;
    }
    final String s = n.toString(3);
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
