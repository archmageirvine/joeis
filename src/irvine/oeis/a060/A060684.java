package irvine.oeis.a060;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A060684 Smallest difference between consecutive divisors (ordered by size) of 2n+1.
 * @author Sean A. Irvine
 */
public class A060684 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    mN += 2;
    Z prev = Z.ZERO;
    Z min = Z.valueOf(mN);
    for (final Z d : Jaguar.factor(mN).divisorsSorted()) {
      if (!prev.isZero()) {
        final Z delta = d.subtract(prev);
        if (delta.compareTo(min) < 0) {
          min = delta;
        }
      }
      prev = d;
    }
    return min;
  }
}
