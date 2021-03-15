package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045596 Numbers n such that n | 7^n + 5^n.
 * @author Sean A. Irvine
 */
public class A045596 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Z.SEVEN.modPow(mN, mN).add(Z.FIVE.modPow(mN, mN)).mod(mN).isZero()) {
        return mN;
      }
    }
  }
}
