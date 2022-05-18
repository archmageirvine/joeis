package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A046398 Palindromes with exactly 8 distinct prime factors.
 * @author Sean A. Irvine
 */
public class A046398 extends A002113 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      final FactorSequence fs = Jaguar.factor(t);
      if (fs.bigOmega() == 8 && fs.omega() == 8) {
        return t;
      }
    }
  }
}
