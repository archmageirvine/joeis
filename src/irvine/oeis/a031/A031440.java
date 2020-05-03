package irvine.oeis.a031;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A031440 <code>a(0)=3</code> and for <code>n&gt;0 a(n)</code> is the greatest prime factor of <code>a(n-1)^2 - 2</code>.
 * @author Sean A. Irvine
 */
public class A031440 implements Sequence {

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
