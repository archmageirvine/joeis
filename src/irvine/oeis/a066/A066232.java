package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066232 Numbers k such that phi(k) = phi(k-2) - phi(k-1).
 * @author Sean A. Irvine
 */
public class A066232 extends Sequence1 {

  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      if (Functions.PHI.z(++mN).equals(Functions.PHI.z(mN - 2).subtract(Functions.PHI.z(mN - 1)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
