package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002331 Values of x in the solution to p = x^2 + y^2, x &lt;= y, with prime p = A002313(n).
 * @author Sean A. Irvine
 */
public class A002331 extends A002313 {

  @Override
  public Z next() {
    final Z p = super.next();
    Z x = Z.ZERO;
    while (true) {
      x = x.add(1);
      if (p.subtract(x.square()).isSquare()) {
        return x;
      }
    }
  }
}
