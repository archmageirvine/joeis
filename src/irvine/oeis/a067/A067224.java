package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067224 Numbers k such that phi(5k-1) = sigma(k).
 * @author Sean A. Irvine
 */
public class A067224 extends Sequence1 {

  private long mN = 5224;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA1.z(++mN).equals(Functions.PHI.z(5 * mN - 1))) {
        return Z.valueOf(mN);
      }
    }
  }
}
