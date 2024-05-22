package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067233 Numbers n such that phi(3n+1) = sigma(n).
 * @author Sean A. Irvine
 */
public class A067233 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA1.z(++mN).equals(Functions.PHI.z(3 * mN + 1))) {
        return Z.valueOf(mN);
      }
    }
  }
}
