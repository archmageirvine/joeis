package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078148 Numbers k such that d(phi(k)) = phi(d(k)), where d=A000005 and phi=A000010.
 * @author Sean A. Irvine
 */
public class A078148 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA0.l(Functions.PHI.l(++mN)) == Functions.PHI.l(Functions.SIGMA0.l(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
