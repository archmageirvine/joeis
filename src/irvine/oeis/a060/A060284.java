package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a036.A036275;

/**
 * A060284 Periodic part of decimal expansion of 1/n (leading 0's omitted).
 * @author Sean A. Irvine
 */
public class A060284 extends A036275 {

  @Override
  public Z next() {
    final int[] a = step();
    Z res = Z.ZERO;
    for (final int digit : a) {
      res = res.multiply(10).add(digit);
    }
    return res;
  }
}

