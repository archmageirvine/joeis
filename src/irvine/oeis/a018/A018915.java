package irvine.oeis.a018;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018915 Define the generalized Pisot sequence <code>T(a(0),a(1))</code> by: <code>a(n+2)</code> is the greatest integer such that <code>a(n+2)/a(n+1) &lt; a(n+1)/a(n)</code>. This is <code>T(2,6)</code>.
 * @author Sean A. Irvine
 */
public class A018915 implements Sequence {

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
