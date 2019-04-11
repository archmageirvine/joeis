package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005267 <code>a(n) = -1 + a(0)a(1)</code>...a(n-1) if <code>n&gt;0</code>. <code>a(0)=3</code>.
 * @author Sean A. Irvine
 */
public class A005267 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.THREE;
      return mA;
    }
    final Z t = mA.subtract(1);
    mA = mA.multiply(t);
    return t;
  }
}

