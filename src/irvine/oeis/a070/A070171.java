package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070171 Numbers k such that sigma(phi(k)) = k-phi(k).
 * @author Sean A. Irvine
 */
public class A070171 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long phi = Functions.PHI.l(++mN);
      if (Functions.SIGMA.l(phi) == mN - phi) {
        return Z.valueOf(mN);
      }
    }
  }
}
