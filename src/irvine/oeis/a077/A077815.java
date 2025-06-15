package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077763.
 * @author Sean A. Irvine
 */
public class A077815 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.TWO.modPow(Functions.PHI.z(++mN), Z.valueOf(mN).square());
  }
}

