package irvine.oeis.a046;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A046394 Palindromes with exactly 4 distinct prime factors.
 * @author Sean A. Irvine
 */
public class A046394 extends A002113 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      final FactorSequence fs = Cheetah.factor(t);
      if (fs.bigOmega() == 4 && fs.omega() == 4) {
        return t;
      }
    }
  }
}
