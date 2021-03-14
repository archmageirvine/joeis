package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045577.
 * @author Sean A. Irvine
 */
public class A045577 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Z.FOUR.modPow(mN, mN).add(Z.TWO.modPow(mN, mN)).mod(mN).isZero()) {
        return mN;
      }
    }
  }
}
