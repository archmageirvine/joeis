package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015949 Numbers k such that k | 3^k + 1.
 * @author Sean A. Irvine
 */
public class A015949 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z m = mN;
      mN = mN.add(1);
      if (Z.THREE.modPow(mN, mN).equals(m)) {
        return mN;
      }
    }
  }
}
