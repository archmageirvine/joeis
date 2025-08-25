package irvine.oeis.a386;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064413.
 * @author Sean A. Irvine
 */
public class A386482 extends Sequence1 {

  protected final HashSet<Z> mSeen = new HashSet<>();
  private Z mA = null;
  private Z mLeastUnused = Z.THREE;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    } else if (Z.ONE.equals(mA)) {
      mA = Z.TWO;
      return mA;
    }
    while (mSeen.remove(mLeastUnused)) {
      mLeastUnused = mLeastUnused.add(1);
    }
    Z k = mA.subtract(1);
    while (k.compareTo(mLeastUnused) >= 0) {
      if (!mSeen.contains(k) && !Functions.GCD.z(k, mA).isOne()) {
        mSeen.add(k);
        mA = k;
        return k;
      }
      k = k.subtract(1);
    }
    k = mA.add(1);
    while (true) {
      if (k.compareTo(mLeastUnused) >= 0 && !mSeen.contains(k) && !Functions.GCD.z(k, mA).isOne()) {
        mSeen.add(k);
        mA = k;
        return k;
      }
      k = k.add(1);
    }
  }
}
