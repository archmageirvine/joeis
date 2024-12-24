package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066782 Numbers k such that (k, phi(k)) lies on the hyperbola x^2 - y^2 = m^2, for some natural number m, i.e., k^2 - phi(k)^2 is a square.
 * @author Sean A. Irvine
 */
public class A066782 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Z.valueOf(++mN * mN).subtract(Functions.PHI.z(mN).square()).isSquare()) {
        return Z.valueOf(mN);
      }
    }
  }
}

