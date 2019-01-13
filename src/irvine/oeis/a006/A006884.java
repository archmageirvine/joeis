package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006884.
 * @author Sean A. Irvine
 */
public class A006884 implements Sequence {

  private Z mN = Z.ZERO;
  private Z mMax = Z.ZERO;

  static Z max(final Z n) {
    Z m = n;
    Z max = n;
    while (!Z.ONE.equals(m)) {
      m = m.isEven() ? m.divide2() : m.multiply(3).add(1);
      max = max.max(m);
    }
    return max;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z m = max(mN);
      if (m.compareTo(mMax) > 0) {
        mMax = m;
        return mN;
      }
    }
  }
}
