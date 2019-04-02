package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015968 Positive integers n such that n | (15^n + 1).
 * @author Sean A. Irvine
 */
public class A015968 implements Sequence {

  private static final Z Z15 = Z.valueOf(15);
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z m = mN;
      mN = mN.add(1);
      if (Z15.modPow(mN, mN).equals(m)) {
        return mN;
      }
    }
  }
}
