package irvine.oeis.a034;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034294 Numbers k not ending in 0 such that for some base b, k_b is the reverse of k_10 (where k_b denotes k written in base b).
 * @author Sean A. Irvine
 */
public class A034294 extends Sequence1 {

  private Z mN = Z.ZERO;

  private boolean isEqual(Z a, Z b, final int base) {
    while (!b.isZero()) {
      if (a.mod(10) != b.mod(base)) {
        return false;
      }
      b = b.divide(base);
      a = a.divide(10);
    }
    return a.isZero();
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.mod(10) != 0) {
        final Z r = Functions.REVERSE.z(mN);
        for (int base = 2; base <= 82; ++base) {
          if (base != 10 && isEqual(r, mN, base)) {
            return mN;
          }
        }
      }
    }
  }
}
