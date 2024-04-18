package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067243 Numbers m such that sigma(m+1)+sigma(m-1) = 6*phi(m).
 * @author Sean A. Irvine
 */
public class A067243 extends Sequence1 {

  private long mN = 33;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA.z(mN++).add(Functions.SIGMA.z(mN + 1)).equals(Functions.PHI.z(mN).multiply(6))) {
        return Z.valueOf(mN);
      }
    }
  }
}

