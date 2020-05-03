package irvine.oeis.a031;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A031439 <code>a(0) = 1, a(n)</code> is the greatest prime factor of <code>a(n-1)^2+1</code> for <code>n &gt; 0</code>.
 * @author Sean A. Irvine
 */
public class A031439 implements Sequence {

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
