package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.a013.A013929;

/**
 * A015049 Let m = A013929(n); then <code>a(n) =</code> smallest k such that m divides <code>k^2</code>.
 * @author Sean A. Irvine
 */
public class A015049 extends A013929 {

  @Override
  public Z next() {
    final Z t = super.next();
    Z s = t.sqrt();
    while (true) {
      if (Z.ZERO.equals(s.square().mod(t))) {
        return s;
      }
      s = s.add(1);
    }
  }
}
