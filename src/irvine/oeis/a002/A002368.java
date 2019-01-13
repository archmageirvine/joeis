package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a007.A007645;

/**
 * A002368.
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
      if (Z.ZERO.equals(x[1])) {
        return y;
      }
    }
  }
}
