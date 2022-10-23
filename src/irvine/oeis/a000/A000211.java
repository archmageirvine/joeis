package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000211 a(n) = a(n-1) + a(n-2) - 2, a(0) = 4, a(1) = 3.
 * @author Sean A. Irvine
 */
public class A000211 extends Sequence0 {

  private Z mA = Z.FIVE;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    final Z r = mA.add(mB).subtract(2);
    mA = mB;
    mB = r;
    return r;
  }
}

