package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a007.A007645;

/**
 * A002367 Let p = A007645(n) be the n-th generalized cuban prime and write p^2 <code>= x^2 + 3*y^2</code> with <code>y &gt; 0</code>; <code>a(n) = x</code>.
 * @author Sean A. Irvine
 */
public class A002367 extends A007645 {

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
      if (Z.ZERO.equals(x[1])) {
        return x[0];
      }
    }
  }
}
