package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063846 Numbers k such that sigma(k) - usigma(k) &gt; 2k.
 * @author Sean A. Irvine
 */
public class A063846 extends Sequence1 {

  private long mN = 1439;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma().subtract(fs.unitarySigma()).compareTo(2 * mN) > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
