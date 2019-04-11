package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015951 Numbers k such that k | 5^k <code>+ 1</code>.
 * @author Sean A. Irvine
 */
public class A015951 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z m = mN;
      mN = mN.add(1);
      if (Z.FIVE.modPow(mN, mN).equals(m)) {
        return mN;
      }
    }
  }
}
