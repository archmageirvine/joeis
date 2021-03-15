package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045580 Numbers n such that n | 7^n + 2^n.
 * @author Sean A. Irvine
 */
public class A045580 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Z.SEVEN.modPow(mN, mN).add(Z.TWO.modPow(mN, mN)).mod(mN).isZero()) {
        return mN;
      }
    }
  }
}
