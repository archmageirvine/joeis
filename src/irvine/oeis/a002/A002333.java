package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a033.A033203;

/**
 * A002333 Numbers y such that p <code>= x^2 + 2y^2,</code> with prime p = A033203(n).
 * @author Sean A. Irvine
 */
public class A002333 extends A033203 {

  @Override
  public Z next() {
    final Z p = super.next();
    Z x = Z.NEG_ONE;
    while (true) {
      x = x.add(1);
      final Z twoy2 = p.subtract(x.square());
      final Z[] s = twoy2.divide2().sqrtAndRemainder();
      if (twoy2.isEven() && Z.ZERO.equals(s[1])) {
        return s[0];
      }
    }
  }
}
