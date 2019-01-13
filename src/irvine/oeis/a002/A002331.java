package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002331.
 * @author Sean A. Irvine
 */
public class A002331 extends A002313 {

  @Override
  public Z next() {
    final Z p = super.next();
    Z x = Z.ZERO;
    while (true) {
      x = x.add(1);
      if (Z.ZERO.equals(p.subtract(x.square()).sqrtAndRemainder()[1])) {
        return x;
      }
    }
  }
}
