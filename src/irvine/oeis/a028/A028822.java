package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A028822 Squares with digits in nonincreasing order.
 * @author Sean A. Irvine
 */
public class A028822 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z n2 = mN.square();
      if (ZUtils.isNonincreasingDigits(n2)) {
        return n2;
      }
    }
  }
}
