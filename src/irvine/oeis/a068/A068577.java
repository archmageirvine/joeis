package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068577 Numbers k such that tau(k)^2 &gt; phi(k).
 * @author Sean A. Irvine
 */
public class A068577 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    if (mN == 65520) {
      return null; // Sequence is finite
    }
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma0().square().compareTo(fs.phi()) > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
