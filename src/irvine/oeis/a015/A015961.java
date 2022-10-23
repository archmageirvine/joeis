package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A015961 Positive integers k such that k | (12^k + 1).
 * @author Sean A. Irvine
 */
public class A015961 extends Sequence1 {

  private static final Z Z12 = Z.valueOf(12);
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z m = mN;
      mN = mN.add(1);
      if (Z12.modPow(mN, mN).equals(m)) {
        return mN;
      }
    }
  }
}
