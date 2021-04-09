package irvine.oeis.a046;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a033.A033620;

/**
 * A046401 Numbers with exactly 3 distinct palindromic prime factors.
 * @author Sean A. Irvine
 */
public class A046401 extends A033620 {

  protected int targetOmega() {
    return 3;
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      final FactorSequence fs = Cheetah.factor(t);
      if (fs.bigOmega() == targetOmega() && fs.omega() == targetOmega()) {
        return t;
      }
    }
  }
}
