package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018784 Numbers n such that <code>sigma(phi(n)) =</code> n.
 * @author Sean A. Irvine
 */
public class A018784 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z t = Cheetah.factor(Euler.phi(mN)).sigma();
      if (t.equals(mN)) {
        return t;
      }
    }
  }
}
