package irvine.oeis.a013;

import irvine.math.cr.Convergents;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013944.
 * @author Sean A. Irvine
 */
public class A013944 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      if (Z.ZERO.equals(n.sqrtAndRemainder()[1])) {
        continue;
      }
      Z sum = null;
      for (final Z c : Convergents.continuedFractionConvergentsSqrt(mN)) {
        sum = sum == null ? Z.ZERO : sum.add(c);
      }
      return sum;
    }
  }
}
