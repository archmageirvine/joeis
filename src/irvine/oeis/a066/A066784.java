package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066784 Numbers n such that (n, sigma(n)) lies on the hyperbola y^2 - x^2 = m^2, for some natural number m, i.e., sigma(n)^2 - n^2 = m^2.
 * @author Sean A. Irvine
 */
public class A066784 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).sigma().square().subtract(mN * mN).isSquare()) {
        return Z.valueOf(mN);
      }
    }
  }
}

