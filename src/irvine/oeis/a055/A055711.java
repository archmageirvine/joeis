package irvine.oeis.a055;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055711 Numbers k such that k | sigma_7(k).
 * @author Sean A. Irvine
 */
public class A055711 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).sigma(7).mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
