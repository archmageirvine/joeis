package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.a002.A002479;

/**
 * A034029 Numbers that are primitively represented by <code>(x^2+2y^2</code> with <code>x &gt;= y &gt;= 0)</code>.
 * @author Sean A. Irvine
 */
public class A034029 extends A002479 {

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      for (Z y2, y2m, y = Z.ZERO; (y2m = (y2 = y.square()).multiply2()).compareTo(n) <= 0; y = y.add(1)) {
        final Z x2 = n.subtract(y2m);
        if (x2.compareTo(y2) < 0) {
          break;
        }
        if (x2.isSquare() && y.gcd(x2.sqrt()).equals(Z.ONE)) {
          return n;
        }
      }
    }
  }
}
