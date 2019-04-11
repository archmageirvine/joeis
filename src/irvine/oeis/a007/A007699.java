package irvine.oeis.a007;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007699 Pisot sequence E(10,219): <code>a(n) =</code> nearest integer to <code>a(n-1)^2 / a(n-2),</code> starting <code>10, 219, ...</code> Deviates from A007698 at 1403rd term.
 * @author Sean A. Irvine
 */
public class A007699 implements Sequence {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.TEN;
        return Z.TEN;
      }
      mB = Z.valueOf(219);
    } else {
      final Z s = new Q(mB.square(), mA).add(Q.HALF).toZ();
      mA = mB;
      mB = s;
    }
    return mB;
  }
}
