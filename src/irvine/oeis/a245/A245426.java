package irvine.oeis.a245;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A245426 Number of nonnegative integers with property that their base 7/4 expansion (see A024641) has n digits.
 * @author Sean A. Irvine
 */
public class A245426 implements Sequence {

  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    final Z a = mSum.isZero() ? Z.ONE : mSum.multiply(3).add(3).divide(4);
    mSum = mSum.add(a);
    return a.multiply(7);
  }
}
