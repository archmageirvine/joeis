package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A049416 Largest number whose square has n digits.
 * @author Sean A. Irvine
 */
public class A049416 extends Sequence1 {

  private Z mT = Z.ONE;

  @Override
  public Z next() {
    mT = mT.multiply(10);
    final Z[] b = mT.sqrtAndRemainder();
    return b[1].isZero() ? b[0].subtract(1) : b[0];
  }
}

