package irvine.oeis.a394;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394676 allocated for Hoang Xuan Thanh.
 * @author Sean A. Irvine
 */
public class A394676 extends Sequence1 {

  private final HashSet<Z> mForbidden = new HashSet<>();
  private Z mA = null;
  private Z mB = null;
  private Z mC = null;

  @Override
  public Z next() {
    if (mC == null) {
      mC = Z.ONE;
      return Z.ONE;
    }
    Z t = mC;
    while (true) {
      t = t.add(1);
      if (!mForbidden.remove(t)) {
        if (mA != null) {
          mForbidden.add(mA.add(mB).add(mC).add(t));
        }
        mA = mB;
        mB = mC;
        mC = t;
        return t;
      }
    }
  }
}

