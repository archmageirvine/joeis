package irvine.oeis.a068;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068401 Numbers k such that sigma(k) = phi(k+1) + phi(k-1).
 * @author Sean A. Irvine
 */
public class A068401 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA.z(++mN).equals(Functions.PHI.z(mN - 1).add(Functions.PHI.z(mN + 1)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
