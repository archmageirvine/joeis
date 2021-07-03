package irvine.oeis.a043;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A043326 Numbers k such that k is a product of two different primes and k-2 is prime.
 * @author Sean A. Irvine
 */
public class A043326 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next().add(2);
      final FactorSequence fs = Cheetah.factor(n);
      if (fs.bigOmega() == 2 && fs.omega() == 2) {
        return n;
      }
    }
  }
}
