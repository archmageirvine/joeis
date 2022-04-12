package irvine.oeis.a245;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A245429 Number of nonnegative integers with property that their base 9/7 expansion (see A024655) has n digits.
 * @author Sean A. Irvine
 */
public class A245429 implements Sequence {

  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    final Z a = mSum.isZero() ? Z.ONE : mSum.multiply(2).add(6).divide(7);
    mSum = mSum.add(a);
    return a.multiply(9);
  }
}
