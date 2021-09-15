package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051446 Integers n such that 2^n == 13 (mod n).
 * @author Sean A. Irvine
 */
public class A051446 implements Sequence {

  private static final Z Z13 = Z.valueOf(13);
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Z.TWO.modPow(mN, mN).equals(Z13.mod(mN))) {
        return mN;
      }
    }
  }
}

