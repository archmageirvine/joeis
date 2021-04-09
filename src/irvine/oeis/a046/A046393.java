package irvine.oeis.a046;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A046393 Palindromes with exactly 3 distinct prime factors.
 * @author Sean A. Irvine
 */
public class A046393 extends A002113 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      final FactorSequence fs = Cheetah.factor(t);
      if (fs.bigOmega() == 3 && fs.omega() == 3) {
        return t;
      }
    }
  }
}
