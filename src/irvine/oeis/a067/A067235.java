package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067235 Numbers k such that phi(4k-1) = sigma(k).
 * @author Sean A. Irvine
 */
public class A067235 extends Sequence1 {

  private long mN = 559;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA1.z(++mN).equals(Functions.PHI.z(4 * mN - 1))) {
        return Z.valueOf(mN);
      }
    }
  }
}
