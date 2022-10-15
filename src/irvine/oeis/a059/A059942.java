package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a007.A007931;

/**
 * A059942 A059941 translated from binary to decimal.
 * @author Sean A. Irvine
 */
public class A059942 extends A007931 {

  @Override
  public Z next() {
    final String s = super.next().toString();
    Z res = Z.ZERO;
    for (int k = s.length(); k > 0; --k) {
      res = res.multiply2();
      if (s.substring(0, k).equals(s.substring(s.length() - k))) {
        res = res.add(1);
      }
    }
    return res;
  }
}
