package irvine.oeis.a391;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A391842 allocated for Ho\u00e0n To\u00e1n.
 * @author Sean A. Irvine
 */
public class A391842 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Z.valueOf(++mN).multiply(mN + 1).mod(Functions.SIGMA0.z(mN).multiply(Functions.SIGMA0.z(mN + 1))).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
