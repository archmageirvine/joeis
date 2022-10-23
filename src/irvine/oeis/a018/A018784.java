package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A018784 Numbers n such that sigma(phi(n)) = n.
 * @author Sean A. Irvine
 */
public class A018784 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z t = Jaguar.factor(Euler.phi(mN)).sigma();
      if (t.equals(mN)) {
        return t;
      }
    }
  }
}
