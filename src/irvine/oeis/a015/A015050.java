package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.a013.A013929;

/**
 * A015050 Let m = A013929(n); then a(n) = smallest k such that m divides k^3.
 * @author Sean A. Irvine
 */
public class A015050 extends A013929 {

  @Override
  public Z next() {
    final Z t = super.next();
    Z s = t.root(3);
    while (true) {
      if (s.pow(3).mod(t).isZero()) {
        return s;
      }
      s = s.add(1);
    }
  }
}
