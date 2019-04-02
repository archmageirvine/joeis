package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a033.A033203;

/**
 * A002332 Numbers x such that p = x^2 + 2y^2, with prime p = A033203(n).
 * @author Sean A. Irvine
 */
public class A002332 extends A033203 {

  @Override
  public Z next() {
    final Z p = super.next();
    Z x = Z.NEG_ONE;
    while (true) {
      x = x.add(1);
      final Z twoy2 = p.subtract(x.square());
      if (twoy2.isEven() && Z.ZERO.equals(twoy2.divide2().sqrtAndRemainder()[1])) {
        return x;
      }
    }
  }
}
