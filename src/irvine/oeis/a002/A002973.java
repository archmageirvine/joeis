package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002973.
 * @author Sean A. Irvine
 */
public class A002973 extends A002144 {

  @Override
  public Z next() {
    final Z p = super.next();
    for (Z x = Z.TWO; ; x = x.add(2)) {
      final Z y2 = p.subtract(x.square());
      assert y2.signum() > 0;
      final Z[] y = y2.sqrtAndRemainder();
      if (Z.ZERO.equals(y[1])) {
        return x.divide2();
      }
    }
  }
}
