package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046390 Squarefree odd numbers with exactly 4 distinct prime factors.
 * @author Sean A. Irvine
 */
public class A046390 implements Sequence {

  private long mN = 1153;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      final FactorSequence fs = Jaguar.factor(mN);
      if (fs.bigOmega() == 4 && fs.omega() == 4) {
        return Z.valueOf(mN);
      }
    }
  }
}
