package irvine.oeis.a057;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057852.
 * @author Sean A. Irvine
 */
public class A057852 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma0().add(fs.sigma()).add(fs.sigma2()).mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
