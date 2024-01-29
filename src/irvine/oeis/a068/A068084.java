package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068084 Smallest triangular number which is a multiple (&gt;1) of the n-th triangular number.
 * @author Sean A. Irvine
 */
public class A068084 extends Sequence1 {

  // After Chai Wah Wu

  private long mN = 0;

  @Override
  public Z next() {
    Z u = Z.valueOf(4 * (++mN + 1));
    Z v = Z.valueOf(2 * (mN + 1)).square().subtract(1);
    final Z t = Z.valueOf(mN).multiply(4 * (mN + 1));
    while (true) {
      if (v.mod(t).isZero()) {
        return v.divide(8);
      }
      v = v.add(u).add(1);
      u = u.add(2);
    }
  }
}
