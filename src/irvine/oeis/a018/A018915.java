package irvine.oeis.a018;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A018915 Define the generalized Pisot sequence T(a(0),a(1)) by: a(n+2) is the greatest integer such that a(n+2)/a(n+1) &lt; a(n+1)/a(n). This is T(2,6).
 * @author Sean A. Irvine
 */
public class A018915 extends Sequence0 {

  private Z mA = null;
  private Z mB = null;

  protected Z a() {
    return Z.TWO;
  }

  protected Z b() {
    return Z.SIX;
  }

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = a();
        return mA;
      }
      mB = b();
    } else {
      final Q r = new Q(mB.square(), mA);
      final Z t = r.isInteger() ? r.toZ().subtract(1) : r.toZ();
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
