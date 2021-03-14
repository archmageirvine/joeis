package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045576.
 * @author Sean A. Irvine
 */
public class A045576 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Z.THREE.modPow(mN, mN).add(Z.TWO.modPow(mN, mN)).mod(mN).isZero()) {
        return mN;
      }
    }
  }
}
