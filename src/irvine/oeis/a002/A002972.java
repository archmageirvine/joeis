package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002972 a(n) is the odd member of {x,y}, where x^2+y^2 is the n-th prime of the form 4i+1.
 * @author Sean A. Irvine
 */
public class A002972 extends A002144 {

  @Override
  public Z next() {
    final Z p = super.next();
    for (Z x = Z.TWO; ; x = x.add(2)) {
      final Z y2 = p.subtract(x.square());
      assert y2.signum() > 0;
      final Z[] y = y2.sqrtAndRemainder();
      if (y[1].isZero()) {
        return y[0];
      }
    }
  }
}
