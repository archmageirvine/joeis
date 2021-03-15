package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045609 Numbers n such that n | 10^n + 9^n.
 * @author Sean A. Irvine
 */
public class A045609 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Z.TEN.modPow(mN, mN).add(Z.NINE.modPow(mN, mN)).mod(mN).isZero()) {
        return mN;
      }
    }
  }
}
