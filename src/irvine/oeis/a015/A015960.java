package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015960.
 * @author Sean A. Irvine
 */
public class A015960 implements Sequence {

  private static final Z Z11 = Z.valueOf(11);
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z m = mN;
      mN = mN.add(1);
      if (Z11.modPow(mN, mN).equals(m)) {
        return mN;
      }
    }
  }
}
