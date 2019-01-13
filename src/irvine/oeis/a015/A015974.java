package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015974.
 * @author Sean A. Irvine
 */
public class A015974 implements Sequence {

  private Z mN = Z.ZERO;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      final Z m = mN;
      mN = mN.add(1);
      if (mN.equals(mT)) {
        mT = mT.multiply(5);
      } else if (Z.FOUR.modPow(mN, mN).equals(m)) {
        return mN;
      }
    }
  }
}
