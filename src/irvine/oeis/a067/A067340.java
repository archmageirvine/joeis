package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067340 Numbers k such that (number of distinct prime factors of k) divides (number of prime factors of k).
 * @author Sean A. Irvine
 */
public class A067340 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.bigOmega() % fs.omega() == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

