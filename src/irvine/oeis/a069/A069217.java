package irvine.oeis.a069;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069211.
 * @author Sean A. Irvine
 */
public class A069217 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final FactorSequence fs = Jaguar.factor(mN);
      if (fs.sigma().add(fs.phi()).equals(mN.add(Functions.REVERSE.z(mN)))) {
        return mN;
      }
    }
  }
}

