package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045604 Numbers n such that n | 8^n + 7^n.
 * @author Sean A. Irvine
 */
public class A045604 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Z.EIGHT.modPow(mN, mN).add(Z.SEVEN.modPow(mN, mN)).mod(mN).isZero()) {
        return mN;
      }
    }
  }
}
