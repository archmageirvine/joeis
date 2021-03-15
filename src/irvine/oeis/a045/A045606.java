package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045606 Numbers n such that n | 10^n + 7^n.
 * @author Sean A. Irvine
 */
public class A045606 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Z.TEN.modPow(mN, mN).add(Z.SEVEN.modPow(mN, mN)).mod(mN).isZero()) {
        return mN;
      }
    }
  }
}
