package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066831 Numbers n such that sigma(n) divides sigma(phi(n)).
 * @author Sean A. Irvine
 */
public class A066831 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(Euler.phi(++mN)).sigma().mod(Jaguar.factor(mN).sigma()).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
