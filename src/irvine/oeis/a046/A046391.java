package irvine.oeis.a046;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046391 Odd numbers with exactly 5 distinct prime factors.
 * @author Sean A. Irvine
 */
public class A046391 implements Sequence {

  private long mN = 15013;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      final FactorSequence fs = Cheetah.factor(mN);
      if (fs.bigOmega() == 5 && fs.omega() == 5) {
        return Z.valueOf(mN);
      }
    }
  }
}
