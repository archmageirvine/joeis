package irvine.oeis.a245;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A245431 Number of nonnegative integers with property that their base 10/7 expansion has n digits.
 * @author Sean A. Irvine
 */
public class A245431 implements Sequence {

  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    final Z a = mSum.isZero() ? Z.ONE : mSum.multiply(3).add(6).divide(7);
    mSum = mSum.add(a);
    return a.multiply(10);
  }
}
