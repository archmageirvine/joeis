package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066831 Numbers k such that sigma(k) divides sigma(phi(k)).
 * @author Sean A. Irvine
 */
public class A066831 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA1.z(Functions.PHI.z(++mN)).mod(Functions.SIGMA1.z(mN)).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
