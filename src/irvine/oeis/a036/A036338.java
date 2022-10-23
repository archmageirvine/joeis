package irvine.oeis.a036;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036338 Composites whose digit length is equal to their number of prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A036338 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.omega() > 1 || fs.maxExponent() > 1) {
        if (fs.bigOmega() == Long.toString(mN).length()) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
