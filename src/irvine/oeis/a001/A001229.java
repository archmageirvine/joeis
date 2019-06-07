package irvine.oeis.a001;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.math.z.Euler;
import irvine.oeis.Sequence;

/**
 * A001229 Numbers n such that <code>phi(sigma(n)) = n</code>.
 * @author Sean A. Irvine
 */
public class A001229 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z t = Euler.phi(Cheetah.factor(++mN).sigma());
      if (t.longValue() == mN) {
        return t;
      }
    }
  }
}
