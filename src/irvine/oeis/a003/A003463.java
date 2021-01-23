package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003463 a(n) = (5^n - 1)/4.
 * @author Sean A. Irvine
 */
public class A003463 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(5);
    return mA.subtract(1).shiftRight(2);
  }
}
