package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063844 Smith numbers which are also base-2 pseudoprimes.
 * @author Sean A. Irvine
 */
public class A063846 extends Sequence1 {

  private long mN = 1439;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma().subtract(fs.unitarySigma()).compareTo(Z.valueOf(2 * mN)) > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
