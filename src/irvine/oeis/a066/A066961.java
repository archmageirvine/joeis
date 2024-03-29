package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066961 Numbers k such that sigma(k) divides sigma(sigma(k)).
 * @author Sean A. Irvine
 */
public class A066961 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z sigma = Jaguar.factor(++mN).sigma();
      if (Jaguar.factor(sigma).sigma().mod(sigma).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
