package irvine.oeis.a046;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A046397 Palindromes with exactly 7 distinct prime factors.
 * @author Sean A. Irvine
 */
public class A046397 extends A002113 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      final FactorSequence fs = Cheetah.factor(t);
      if (fs.bigOmega() == 7 && fs.omega() == 7) {
        return t;
      }
    }
  }
}
