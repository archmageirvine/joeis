package irvine.oeis.a053;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a050.A050530;

/**
 * A053339 Squarefree terms of A050530 with 3 prime divisors.
 * @author Sean A. Irvine
 */
public class A053339 extends A050530 {

  @Override
  public Z next() {
    while (true) {
      final Z a = super.next();
      final FactorSequence fs = Jaguar.factor(a);
      if (fs.omega() == 3 && fs.bigOmega() == 3) {
        return a;
      }
    }
  }
}
