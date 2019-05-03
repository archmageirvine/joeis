package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014824 <code>a(0) = 0</code>; for <code>n&gt;0, a(n) = 10*a(n-1) +</code> n.
 * @author Sean A. Irvine
 */
public class A014824 implements Sequence {

  private Z mA = Z.ZERO;
  protected long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(10).add(mN);
    }
    return mA;
  }
}
