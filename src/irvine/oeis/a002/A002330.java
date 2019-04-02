package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002330 Value of y in the solution to p = x^2 + y^2, x &lt;= y, with prime p = A002313(n).
 * @author Sean A. Irvine
 */
public class A002330 extends A002313 {

  @Override
  public Z next() {
    final Z p = super.next();
    Z x = Z.ZERO;
    while (true) {
      x = x.add(1);
      final Z[] s = p.subtract(x.square()).sqrtAndRemainder();
      if (Z.ZERO.equals(s[1])) {
        return s[0];
      }
    }
  }
}
