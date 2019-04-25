package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002972 <code>a(n)</code> is the odd member of <code>{x,y},</code> where <code>x^2+y^2</code> is the n-th prime of the form <code>4i+1</code>.
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
      if (Z.ZERO.equals(y[1])) {
        return y[0];
      }
    }
  }
}
