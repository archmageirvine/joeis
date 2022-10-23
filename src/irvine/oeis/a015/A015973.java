package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A015973 Positive integers n such that n | (3^n + 2).
 * @author Sean A. Irvine
 */
public class A015973 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Z.THREE.modPow(mN, mN).equals(mN.subtract(2).mod(mN))) {
        return mN;
      }
    }
  }
}
