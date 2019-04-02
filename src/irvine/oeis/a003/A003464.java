package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003464 a(n) = (6^n - 1)/5.
 * @author Sean A. Irvine
 */
public class A003464 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(6);
    return mA.subtract(1).divide(5);
  }
}
