package irvine.oeis.a066;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066782 Numbers n such that (n, phi(n)) lies on the hyperbola x^2 - y^2 = m^2, for some natural number m, i.e., n^2 - phi(n)^2 = m^2.
 * @author Sean A. Irvine
 */
public class A066782 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Z.valueOf(++mN * mN).subtract(Euler.phi(mN).square()).isSquare()) {
        return Z.valueOf(mN);
      }
    }
  }
}

