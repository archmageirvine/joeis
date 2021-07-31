package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A030099 Numbers k such that k^3 has only odd digits.
 * @author Sean A. Irvine
 */
public class A030099 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if ((ZUtils.syn(mN.pow(3)) & 0b101010101) == 0) {
        return mN;
      }
    }
  }
}
