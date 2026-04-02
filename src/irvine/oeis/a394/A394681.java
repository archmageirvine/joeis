package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A394681 allocated for Stefano Spezia.
 * @author Sean A. Irvine
 */
public class A394681 extends Sequence0 {

  private Z mA = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(mN * mN).add(Functions.FACTORIAL.z(mN));
    }
    return mA;
  }
}
