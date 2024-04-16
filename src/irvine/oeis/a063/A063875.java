package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063875 Numbers k such that sigma(k) - usigma(k) &gt; 3k.
 * @author Sean A. Irvine
 */
public class A063875 extends Sequence1 {

  private long mN = 831599;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma().subtract(fs.unitarySigma()).compareTo(3 * mN) > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
