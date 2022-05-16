package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A046396 Palindromes with exactly 6 distinct prime factors.
 * @author Sean A. Irvine
 */
public class A046396 extends A002113 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      final FactorSequence fs = Jaguar.factor(t);
      if (fs.bigOmega() == 6 && fs.omega() == 6) {
        return t;
      }
    }
  }
}
