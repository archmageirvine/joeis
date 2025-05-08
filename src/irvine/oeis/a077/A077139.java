package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077094.
 * @author Sean A. Irvine
 */
public class A077139 extends Sequence1 {

  private Z mA = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN > 1) {
      mA = Functions.LCM.z(mA, mN).divide(Functions.GCD.z(mA, mN));
    }
    return mA;
  }
}

