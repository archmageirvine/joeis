package irvine.oeis.a015;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015715 Odd integers m such that phi(m) | sigma(m).
 * @author Sean A. Irvine
 */
public class A015715 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      final FactorSequence fs = Jaguar.factor(mN);
      if (fs.sigma().mod(fs.phi()).isZero()) {
        return mN;
      }
    }
  }
}
