package irvine.oeis.a394;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394576 allocated for Hoang Xuan Thanh.
 * @author Sean A. Irvine
 */
public class A394576 extends Sequence1 {

  private final HashSet<Z> mForbidden = new HashSet<>();
  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      mB = Z.ONE;
      return Z.ONE;
    }
    Z t = mB;
    while (true) {
      t = t.add(1);
      if (!mForbidden.remove(t)) {
        if (mA != null) {
          mForbidden.add(mA.add(mB).add(t));
        }
        mA = mB;
        mB = t;
        return t;
      }
    }
  }
}

