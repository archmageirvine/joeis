package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064193.
 * @author Sean A. Irvine
 */
public class A064193 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.unitarySigma().isSquare() && fs.pod().isSquare()) {
        return Z.valueOf(mN);
      }
    }
  }
}

