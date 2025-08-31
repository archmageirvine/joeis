package irvine.oeis.a079;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079852 a(1) = 1, a(2) = 2, a(3) = 3 and a(n) is the smallest number such that all a(i)*a(j)*a(k) are different.
 * @author Sean A. Irvine
 */
public class A079852 extends Sequence1 {

  private final HashSet<Z> mA = new HashSet<>();
  private final HashSet<Z> mProds = new HashSet<>();
  private Z mN = Z.TWO;

  private boolean isOk(final Z n) {
    for (final Z t : mA) {
      final Z pt = n.multiply(t);
      for (final Z u : mA) {
        if (u.equals(t)) {
          break;
        }
        if (mProds.contains(pt.multiply(u))) {
          return false;
        }
      }
    }
    return true;
  }

  @Override
  public Z next() {
    if (mA.size() < 2) {
      final Z r = Z.valueOf(mA.size() + 1);
      mA.add(r);
      return r;
    }
    while (true) {
      mN = mN.add(1);
      if (isOk(mN)) {
        for (final Z t : mA) {
          final Z pt = mN.multiply(t);
          for (final Z u : mA) {
            if (u.equals(t)) {
              break;
            }
            mProds.add(pt.multiply(u));
          }
        }
        mA.add(mN);
        return mN;
      }
    }
  }
}

