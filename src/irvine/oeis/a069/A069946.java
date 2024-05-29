package irvine.oeis.a069;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069946 Numbers k such that phi(k) mod core(k) = 1 where core(k) is the squarefree part of k.
 * @author Sean A. Irvine
 */
public class A069946 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.phi().mod(fs.core()).equals(Z.ONE)) {
        return Z.valueOf(mN);
      }
    }
  }
}
