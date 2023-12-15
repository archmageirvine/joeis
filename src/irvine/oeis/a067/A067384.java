package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067384 Numbers n such that sigma(phi(n))/sigma(n) = 4.
 * @author Sean A. Irvine
 */
public class A067384 extends Sequence1 {

  private long mN = 121678;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (Jaguar.factor(fs.phi()).sigma().equals(fs.sigma().multiply(4))) {
        return Z.valueOf(mN);
      }
    }
  }
}

