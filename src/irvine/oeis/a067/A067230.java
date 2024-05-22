package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067230 Numbers n such that phi(2n-1) = sigma(n).
 * @author Sean A. Irvine
 */
public class A067230 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA1.z(++mN).equals(Functions.PHI.z(2 * mN - 1))) {
        return Z.valueOf(mN);
      }
    }
  }
}
