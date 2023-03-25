package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A062281 Smallest multiple of n-th prime with all even digits.
 * @author Sean A. Irvine
 */
public class A062281 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    if (Z.TWO.equals(p)) {
      return Z.TWO;
    }
    Z s = Z.ZERO;
    final Z q = p.multiply2(); // only ever going to be an even multiple
    do {
      s = s.add(q);
    } while ((ZUtils.syn(s) & 0b1010101010) != 0);
    return s;
  }
}

