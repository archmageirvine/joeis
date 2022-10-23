package irvine.oeis.a245;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A245416 Number of nonnegative integers with property that their base 9/2 expansion (see A024650) has n digits.
 * @author Sean A. Irvine
 */
public class A245416 extends Sequence1 {

  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    final Z a = mSum.isZero() ? Z.ONE : mSum.multiply(7).add(1).divide2();
    mSum = mSum.add(a);
    return a.multiply(9);
  }
}
