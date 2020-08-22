package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A034294.
 * @author Sean A. Irvine
 */
public class A034294 implements Sequence {

  private Z mN = Z.ZERO;

  private boolean isEqual(Z a, Z b, final int base) {
    while (!b.equals(Z.ZERO)) {
      if (a.mod(10) != b.mod(base)) {
        return false;
      }
      b = b.divide(base);
      a = a.divide(10);
    }
    return Z.ZERO.equals(a);
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.mod(10) != 0) {
        final Z r = ZUtils.reverse(mN);
        for (int base = 2; base <= 82; ++base) {
          if (base != 10 && isEqual(r, mN, base)) {
            return mN;
          }
        }
      }
    }
  }
}
