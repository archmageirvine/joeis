package irvine.oeis.a054;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002961;

/**
 * A054005 Sum of divisors of k such that k and k+1 have the same number and sum of divisors.
 * @author Sean A. Irvine
 */
public class A054005 extends A002961 {

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      final FactorSequence fs = Jaguar.factor(n);
      if (fs.sigma0().equals(Functions.SIGMA0.z(n.add(1)))) {
        return fs.sigma();
      }
    }
  }
}
