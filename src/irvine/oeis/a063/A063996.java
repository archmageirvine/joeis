package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063996 Numbers k such that ud(k) = sopf(k)-1, where ud(k)=A034444(k) and sopf(k)=A008472(k).
 * @author Sean A. Irvine
 */
public class A063996 extends Sequence1 {

  private int mN = 2;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.unitarySigma0().equals(fs.sopf().subtract(1))) {
        return Z.valueOf(mN);
      }
    }
  }
}
