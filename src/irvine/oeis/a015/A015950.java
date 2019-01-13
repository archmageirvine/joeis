package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015950.
 * @author Sean A. Irvine
 */
public class A015950 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z m = mN;
      mN = mN.add(1);
      if (Z.FOUR.modPow(mN, mN).equals(m)) {
        return mN;
      }
    }
  }
}
