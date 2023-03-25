package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A062280 a(1) = 1; a(n) = smallest multiple of n-th prime (n&gt;1) with all odd digits.
 * @author Sean A. Irvine
 */
public class A062280 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    if (Z.TWO.equals(p)) {
      return Z.ONE;
    }
    Z s = p.negate();
    final Z q = p.multiply2(); // only ever going to be an odd multiple
    do {
      s = s.add(q);
    } while ((ZUtils.syn(s) & 0b0101010101) != 0);
    return s;
  }
}

