package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045595 Numbers n such that n | 6^n + 5^n.
 * @author Sean A. Irvine
 */
public class A045595 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Z.SIX.modPow(mN, mN).add(Z.FIVE.modPow(mN, mN)).mod(mN).isZero()) {
        return mN;
      }
    }
  }
}
