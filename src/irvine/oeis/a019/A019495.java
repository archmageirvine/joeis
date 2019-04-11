package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019495 Define the sequence T(a(0),a(1)) by <code>a(n+2)</code> is the greatest integer such that <code>a(n+2)/a(n+1) &lt; a(n+1)/a(n)</code> for <code>n &gt;= 0.</code> This is T(4,11).
 * @author Sean A. Irvine
 */
public class A019495 implements Sequence {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.FOUR;
        return Z.FOUR;
      }
      mB = Z.valueOf(11);
    } else {
      final Z t = mB.square().add(mA).subtract(1).divide(mA).subtract(1);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
