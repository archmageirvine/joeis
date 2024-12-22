package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073655.
 * @author Sean A. Irvine
 */
public class A073858 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.PHI.z(Functions.SIGMA1.z(++mN)).mod(Functions.SIGMA1.z(Functions.PHI.l(mN))).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
