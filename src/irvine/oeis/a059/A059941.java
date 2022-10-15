package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a007.A007931;

/**
 * A059941 Take the n-th number which is just a sequence of 1's and 2's (A007931): if the first k digits in order are the same as the last k digits in order then put 1 in the k-th from right digit of a(n), otherwise put a zero.
 * @author Sean A. Irvine
 */
public class A059941 extends A007931 {

  @Override
  public Z next() {
    final String s = super.next().toString();
    Z res = Z.ZERO;
    for (int k = s.length(); k > 0; --k) {
      res = res.multiply(10);
      if (s.substring(0, k).equals(s.substring(s.length() - k))) {
        res = res.add(1);
      }
    }
    return res;
  }
}
