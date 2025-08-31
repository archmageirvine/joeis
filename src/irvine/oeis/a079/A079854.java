package irvine.oeis.a079;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079854 a(1) = 1, a(k) divides a(k+r) for all k and r and the ratios a(k+r)/a(k) are all different.
 * @author Sean A. Irvine
 */
public class A079854 extends Sequence1 {

  private Z mLcm = null;
  private final HashSet<Z> mA = new HashSet<>();
  private final HashSet<Z> mSeenRatios = new HashSet<>();

  private boolean isOk(final Z t) {
    for (final Z u : mA) {
      if (mSeenRatios.contains(t.divide(u))) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    if (mLcm == null) {
      mLcm = Z.ONE;
      mA.add(Z.ONE);
      return Z.ONE;
    }
    Z t = mLcm;
    while (!isOk(t)) {
      t = t.add(mLcm);
    }
    for (final Z u : mA) {
      mSeenRatios.add(t.divide(u));
    }
    mA.add(t);
    mLcm = t;
    return t;
  }
}

