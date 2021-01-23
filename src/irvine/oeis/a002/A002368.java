package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a007.A007645;

/**
 * A002368 Let p = A007645(n) be the n-th generalized cuban prime and write p^2 =  x^2 + 3*y^2 with y&gt;0; a(n) = y.
 * @author Sean A. Irvine
 */
public class A002368 extends A007645 {

  {
    super.next();
  }

  @Override
  public Z next() {
    final Z p2 = super.next().square();
    Z y = Z.ZERO;
    while (true) {
      y = y.add(1);
      final Z x2 = p2.subtract(y.square().multiply(3));
      final Z[] x = x2.sqrtAndRemainder();
      if (x[1].isZero()) {
        return y;
      }
    }
  }
}
