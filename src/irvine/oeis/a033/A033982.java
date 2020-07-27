package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033982 Integers n such that <code>2^n == 11 (mod n)</code>.
 * @author Sean A. Irvine
 */
public class A033982 implements Sequence {

  private static final Z Z11 = Z.valueOf(11);
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Z.TWO.modPow(mN, mN).equals(Z11.mod(mN))) {
        return mN;
      }
    }
  }
}
