package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A086453 Least difference between 5^n and a power of 2.
 * @author Sean A. Irvine
 */
public class A086453 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(5);
    final int e = mA.bitLength();
    return Z.ONE.shiftLeft(e).subtract(mA).min(mA.subtract(Z.ONE.shiftLeft(e - 1)));
  }
}

