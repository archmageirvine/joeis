package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051447 Integers n such that 2^n == 9 (mod n).
 * @author Sean A. Irvine
 */
public class A051447 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Z.TWO.modPow(mN, mN).equals(Z.NINE.mod(mN))) {
        return mN;
      }
    }
  }
}

