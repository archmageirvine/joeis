package irvine.oeis.a018;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018915.
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
