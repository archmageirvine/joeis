package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045590 Numbers n such that n | 5^n + 4^n.
 * @author Sean A. Irvine
 */
public class A045590 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Z.FIVE.modPow(mN, mN).add(Z.FOUR.modPow(mN, mN)).mod(mN).isZero()) {
        return mN;
      }
    }
  }
}
