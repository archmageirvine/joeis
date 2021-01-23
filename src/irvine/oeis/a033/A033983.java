package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033983 Integers n such that 2^n == 15 (mod n).
 * @author Sean A. Irvine
 */
public class A033983 implements Sequence {

  private static final Z Z15 = Z.valueOf(15);
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Z.TWO.modPow(mN, mN).equals(Z15.mod(mN))) {
        return mN;
      }
    }
  }
}
