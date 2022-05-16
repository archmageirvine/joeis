package irvine.oeis.a053;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a050.A050530;

/**
 * A053340 Terms of A050530 with four prime divisors.
 * @author Sean A. Irvine
 */
public class A053340 extends A050530 {

  @Override
  public Z next() {
    while (true) {
      final Z a = super.next();
      final FactorSequence fs = Jaguar.factor(a);
      if (fs.omega() == 4 && fs.bigOmega() == 4) {
        return a;
      }
    }
  }
}
