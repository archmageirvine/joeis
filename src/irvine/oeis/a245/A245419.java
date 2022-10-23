package irvine.oeis.a245;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A245419 Number of nonnegative integers with property that their base 8/3 expansion (see A024645) has n digits.
 * @author Sean A. Irvine
 */
public class A245419 extends Sequence1 {

  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    final Z a = mSum.isZero() ? Z.ONE : mSum.multiply(5).add(2).divide(3);
    mSum = mSum.add(a);
    return a.multiply(8);
  }
}
