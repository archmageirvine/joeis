package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070170 Numbers n such that sigma(n-phi(n)) = phi(n).
 * @author Sean A. Irvine
 */
public class A070170 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long phi = Functions.PHI.l(++mN);
      if (Functions.SIGMA.l(mN - phi) == phi) {
        return Z.valueOf(mN);
      }
    }
  }
}
