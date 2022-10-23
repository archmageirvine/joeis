package irvine.oeis.a001;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001229 Numbers n such that phi(sigma(n)) = n.
 * @author Sean A. Irvine
 */
public class A001229 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z t = Euler.phi(Jaguar.factor(++mN).sigma());
      if (t.longValue() == mN) {
        return t;
      }
    }
  }
}
