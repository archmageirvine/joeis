package irvine.oeis.a036;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A036447 Double and reverse digits.
 * @author Sean A. Irvine
 */
public class A036447 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : Functions.REVERSE.z(mA.multiply2());
    return mA;
  }
}
