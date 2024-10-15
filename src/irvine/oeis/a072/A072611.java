package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072611 Numbers k such that phi(k) divides sigma(k+1) - sigma(k).
 * @author Sean A. Irvine
 */
public class A072611 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA1.z(++mN + 1).subtract(Functions.SIGMA1.z(mN)).mod(Functions.PHI.l(mN)) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
