package irvine.oeis.a245;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A245420 Number of nonnegative integers with property that their base 8/5 expansion (see A024647) has n digits.
 * @author Sean A. Irvine
 */
public class A245420 implements Sequence {

  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    final Z a = mSum.isZero() ? Z.ONE : mSum.multiply(3).add(4).divide(5);
    mSum = mSum.add(a);
    return a.multiply(8);
  }
}
