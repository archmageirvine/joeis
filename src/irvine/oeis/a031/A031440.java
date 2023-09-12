package irvine.oeis.a031;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A031440 a(0) = 3; for n &gt; 0, a(n) is the greatest prime factor of a(n-1)^2 - 2.
 * @author Sean A. Irvine
 */
public class A031440 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.THREE;
    } else {
      final Z[] p = Jaguar.factor(mA.square().subtract(2)).toZArray();
      mA = p[p.length - 1];
    }
    return mA;
  }
}
