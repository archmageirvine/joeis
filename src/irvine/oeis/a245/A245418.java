package irvine.oeis.a245;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A245418 Number of nonnegative integers with property that their base 5/3 expansion (see A024633) has n digits.
 * @author Sean A. Irvine
 */
public class A245418 extends Sequence1 {

  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    final Z a = mSum.isZero() ? Z.ONE : mSum.multiply2().add(2).divide(3);
    mSum = mSum.add(a);
    return a.multiply(5);
  }
}
