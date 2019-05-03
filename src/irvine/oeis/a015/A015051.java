package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.a013.A013929;

/**
 * A015051 Let m <code>= A013929(n)</code>; then <code>a(n) =</code> smallest k such that m divides <code>k^4</code>.
 * @author Sean A. Irvine
 */
public class A015051 extends A013929 {

  @Override
  public Z next() {
    final Z t = super.next();
    Z s = t.root(4);
    while (true) {
      if (Z.ZERO.equals(s.pow(4).mod(t))) {
        return s;
      }
      s = s.add(1);
    }
  }
}
