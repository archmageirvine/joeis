package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045597 Numbers n such that n | 8^n + 5^n.
 * @author Sean A. Irvine
 */
public class A045597 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Z.EIGHT.modPow(mN, mN).add(Z.FIVE.modPow(mN, mN)).mod(mN).isZero()) {
        return mN;
      }
    }
  }
}
