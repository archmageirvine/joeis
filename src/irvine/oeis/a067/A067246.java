package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067246 Numbers k such that phi(k) divides sigma(k+1) + sigma(k).
 * @author Sean A. Irvine
 */
public class A067246 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA.z(++mN).add(Functions.SIGMA.z(mN + 1)).mod(Functions.PHI.z(mN)).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}

