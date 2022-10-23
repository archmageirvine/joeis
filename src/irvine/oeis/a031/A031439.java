package irvine.oeis.a031;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A031439 a(0) = 1, a(n) is the greatest prime factor of a(n-1)^2+1 for n &gt; 0.
 * @author Sean A. Irvine
 */
public class A031439 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      final Z[] p = Jaguar.factor(mA.square().add(1)).toZArray();
      mA = p[p.length - 1];
    }
    return mA;
  }
}
