package irvine.oeis.a245;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A245428 Number of nonnegative integers with property that their base 10/3 expansion (see A024658) has n digits.
 * @author Sean A. Irvine
 */
public class A245428 implements Sequence {

  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    final Z a = mSum.isZero() ? Z.ONE : mSum.multiply(7).add(2).divide(3);
    mSum = mSum.add(a);
    return a.multiply(10);
  }
}
