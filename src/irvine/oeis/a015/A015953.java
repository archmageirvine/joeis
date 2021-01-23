package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015953 Numbers k such that k | 6^k + 1.
 * @author Sean A. Irvine
 */
public class A015953 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z m = mN;
      mN = mN.add(1);
      if (Z.SIX.modPow(mN, mN).equals(m)) {
        return mN;
      }
    }
  }
}
