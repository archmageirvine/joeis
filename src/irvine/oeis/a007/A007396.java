package irvine.oeis.a007;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007396 Add 2, then reverse digits!.
 * @author Sean A. Irvine
 */
public class A007396 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ZERO : Functions.REVERSE.z(mA.add(2));
    return mA;
  }
}
