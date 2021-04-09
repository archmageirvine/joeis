package irvine.oeis.a046;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A046395 Palindromes with exactly 5 distinct prime factors.
 * @author Sean A. Irvine
 */
public class A046395 extends A002113 {

  // Note: original definition appears to be have changed in this sequence.

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      final FactorSequence fs = Cheetah.factor(t);
      if (/* fs.bigOmega() == 5 && */ fs.omega() == 5) {
        return t;
      }
    }
  }
}
