package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045600 Numbers n such that n | 7^n + 6^n.
 * @author Sean A. Irvine
 */
public class A045600 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Z.SEVEN.modPow(mN, mN).add(Z.SIX.modPow(mN, mN)).mod(mN).isZero()) {
        return mN;
      }
    }
  }
}
