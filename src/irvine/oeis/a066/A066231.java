package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066231 Numbers n such that phi(n) = phi(n-1) - phi(n-2).
 * @author Sean A. Irvine
 */
public class A066231 extends Sequence1 {

  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      if (Functions.PHI.z(++mN).equals(Functions.PHI.z(mN - 1).subtract(Functions.PHI.z(mN - 2)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
