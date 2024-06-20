package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A046395 Palindromes that are the product of 5 distinct primes.
 * @author Sean A. Irvine
 */
public class A046395 extends A002113 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      final FactorSequence fs = Jaguar.factor(t);
      if (fs.bigOmega() == 5 && fs.omega() == 5) {
        return t;
      }
    }
  }
}
