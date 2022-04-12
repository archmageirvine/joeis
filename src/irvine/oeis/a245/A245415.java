package irvine.oeis.a245;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A245415 Number of nonnegative integers with property that their base 5/2 expansion (see A024632) has n digits.
 * @author Sean A. Irvine
 */
public class A245415 implements Sequence {

  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    final Z a = mSum.isZero() ? Z.ONE : mSum.multiply(3).add(1).divide2();
    mSum = mSum.add(a);
    return a.multiply(5);
  }
}
