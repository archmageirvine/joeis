package irvine.oeis.a076;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a005.A005185;

/**
 * A076600.
 * @author Sean A. Irvine
 */
public class A076701 extends A005185 {

  private final TreeSet<Z> mSeen = new TreeSet<>();
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      while (mSeen.isEmpty() || mSeen.last().compareTo(mN.multiply2()) <= 0) {
        mSeen.add(super.next());
      }
      if (!mSeen.remove(mN)) {
        return mN;
      }
    }
  }
}
