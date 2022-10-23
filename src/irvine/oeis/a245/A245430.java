package irvine.oeis.a245;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A245430 Number of nonnegative integers with property that their base 9/5 expansion (see A024653) has n digits.
 * @author Sean A. Irvine
 */
public class A245430 extends Sequence1 {

  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    final Z a = mSum.isZero() ? Z.ONE : mSum.multiply(4).add(4).divide(5);
    mSum = mSum.add(a);
    return a.multiply(9);
  }
}
