package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002366 Numbers x such that x^2 + y^2 = p^2 = A002144(n)^2, x &lt; y.
 * @author Sean A. Irvine
 */
public class A002366 extends A002144 {

  @Override
  public Z next() {
    final Z p2 = super.next().square();
    Z x = Z.ZERO;
    while (true) {
      x = x.add(1);
      final Z y2 = p2.subtract(x.square());
      final Z[] y = y2.sqrtAndRemainder();
      if (y[1].isZero()) {
        return x;
      }
    }
  }
}
