package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015963 Numbers n such that n | 13^n + 1.
 * @author Sean A. Irvine
 */
public class A015963 implements Sequence {

  private static final Z Z13 = Z.valueOf(13);
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z m = mN;
      mN = mN.add(1);
      if (Z13.modPow(mN, mN).equals(m)) {
        return mN;
      }
    }
  }
}
