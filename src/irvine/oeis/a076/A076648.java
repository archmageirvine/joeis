package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076648 Numbers k such that phi(k-1) + phi(k+1) = sigma(k)/2.
 * @author Sean A. Irvine
 */
public class A076648 extends Sequence1 {

  private long mN = 314;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA1.z(++mN).equals(2L * (Functions.PHI.l(mN - 1) + Functions.PHI.l(mN + 1)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
