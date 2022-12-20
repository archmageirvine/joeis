package irvine.oeis.a060;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060685 Largest difference between consecutive divisors (ordered by size) of 2n+1.
 * @author Sean A. Irvine
 */
public class A060685 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    mN += 2;
    Z prev = Z.ZERO;
    Z max = Z.ZERO;
    for (final Z d : Jaguar.factor(mN).divisorsSorted()) {
      if (!prev.isZero()) {
        final Z delta = d.subtract(prev);
        if (delta.compareTo(max) > 0) {
          max = delta;
        }
      }
      prev = d;
    }
    return max;
  }
}
