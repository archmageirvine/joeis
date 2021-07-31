package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A028821 Numbers k such that k^2 has digits in nonincreasing order.
 * @author Sean A. Irvine
 */
public class A028821 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (ZUtils.isNonincreasingDigits(mN.square())) {
        return mN;
      }
    }
  }
}
