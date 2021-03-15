package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045588 Numbers n such that n | 9^n + 3^n.
 * @author Sean A. Irvine
 */
public class A045588 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Z.NINE.modPow(mN, mN).add(Z.THREE.modPow(mN, mN)).mod(mN).isZero()) {
        return mN;
      }
    }
  }
}
