package irvine.oeis.a245;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A245425 Number of nonnegative integers with the property that their base 9/4 expansion (see A024652) has n digits.
 * @author Sean A. Irvine
 */
public class A245425 implements Sequence {

  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    final Z a = mSum.isZero() ? Z.ONE : mSum.multiply(5).add(3).divide(4);
    mSum = mSum.add(a);
    return a.multiply(9);
  }
}
