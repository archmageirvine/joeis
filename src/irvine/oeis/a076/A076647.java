package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076647 Numbers n such that phi(n) + phi(n+1) = sigma(n)/2.
 * @author Sean A. Irvine
 */
public class A076647 extends Sequence1 {

  private long mN = 55;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA1.z(++mN).equals(2L * (Functions.PHI.l(mN) + Functions.PHI.l(mN + 1)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
