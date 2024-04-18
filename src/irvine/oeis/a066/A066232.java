package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066232 Numbers n such that phi(n) = phi(n-2) - phi(n-1).
 * @author Sean A. Irvine
 */
public class A066232 extends Sequence1 {

  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      final long n = ++mN;
      if (Functions.PHI.z(n).equals(Functions.PHI.z(mN - 2).subtract(Functions.PHI.z(mN - 1)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
