package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002365 Numbers y such that p^2 = x^2 + y^2, 0 &lt; x &lt; y, p = A002144(n).
 * @author Sean A. Irvine
 */
public class A002365 extends A002144 {

  @Override
  public Z next() {
    final Z p2 = super.next().square();
    Z x = Z.ZERO;
    while (true) {
      x = x.add(1);
      final Z y2 = p2.subtract(x.square());
      final Z[] y = y2.sqrtAndRemainder();
      if (Z.ZERO.equals(y[1])) {
        return y[0];
      }
    }
  }
}
