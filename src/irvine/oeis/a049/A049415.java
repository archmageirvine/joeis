package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A049415 Number of squares (of positive integers) with n digits.
 * @author Sean A. Irvine
 */
public class A049415 extends Sequence1 {

  private Z mT = Z.ONE;

  @Override
  public Z next() {
    final Z[] a = mT.sqrtAndRemainder();
    mT = mT.multiply(10);
    final Z[] b = mT.sqrtAndRemainder();
    return (b[1].isZero() ? b[0] : b[0].add(1)).subtract(a[1].isZero() ? a[0] : a[0].add(1));
  }
}

