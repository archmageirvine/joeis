package irvine.oeis.a053;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a050.A050530;

/**
 * A053343 Semiprimes of the form pq where p &lt; q and p + q - 1 is prime.
 * @author Sean A. Irvine
 */
public class A053343 extends A050530 {

  @Override
  public Z next() {
    while (true) {
      final Z a = super.next();
      final FactorSequence fs = Jaguar.factor(a);
      if (fs.omega() == 2 && fs.bigOmega() == 2) {
        return a;
      }
    }
  }
}
