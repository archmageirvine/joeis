package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392951 allocated for Aloe Poliszuk.
 * @author Sean A. Irvine
 */
public class A392951 extends Sequence1 {

  private long mN = 55;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA1.z(++mN).equals(2 * mN + Functions.SIGMA0.l(Functions.PHI.l(mN)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
