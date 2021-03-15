package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045607 Numbers n such that n | 9^n + 8^n.
 * @author Sean A. Irvine
 */
public class A045607 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Z.NINE.modPow(mN, mN).add(Z.EIGHT.modPow(mN, mN)).mod(mN).isZero()) {
        return mN;
      }
    }
  }
}
