package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015973.
 * @author Sean A. Irvine
 */
public class A015973 implements Sequence {

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
