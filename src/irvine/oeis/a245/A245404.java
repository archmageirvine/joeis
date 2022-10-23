package irvine.oeis.a245;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A245404 Number of nonnegative integers with property that their base 7/2 expansion (see A024639) has n digits.
 * @author Sean A. Irvine
 */
public class A245404 extends Sequence0 {

  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    final Z a = mSum.isZero() ? Z.ONE : mSum.multiply(5).add(1).divide2();
    mSum = mSum.add(a);
    return a.multiply(7);
  }
}
