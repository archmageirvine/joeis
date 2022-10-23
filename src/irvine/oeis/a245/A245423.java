package irvine.oeis.a245;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A245423 Number of nonnegative integers with property that their base 7/5 expansion (see A024642) has n digits.
 * @author Sean A. Irvine
 */
public class A245423 extends Sequence1 {

  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    final Z a = mSum.isZero() ? Z.ONE : mSum.multiply2().add(4).divide(5);
    mSum = mSum.add(a);
    return a.multiply(7);
  }
}
