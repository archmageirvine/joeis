package irvine.oeis.a015;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A015730 Numbers n such that tau(sigma(n))= tau(tau(n)).
 * @author Sean A. Irvine
 */
public class A015730 extends Sequence1 {

  private Z mN = Z.ZERO;

  private static boolean is(final Z m) {
    final FactorSequence fs = Jaguar.factor(m);
    return Functions.SIGMA0.z(fs.sigma()).equals(Functions.SIGMA0.z(fs.sigma0AsLong()));
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (is(mN)) {
        return mN;
      }
    }
  }
}
