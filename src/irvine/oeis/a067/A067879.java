package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067879 Numbers n such that sigma(n)=phi(n*omega(n)+1).
 * @author Sean A. Irvine
 */
public class A067879 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma().equals(Euler.phi(mN * fs.omega() + 1))) {
        return Z.valueOf(mN);
      }
    }
  }
}
