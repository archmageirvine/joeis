package irvine.oeis.a024;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A024556 Odd squarefree composite numbers.
 * @author Sean A. Irvine
 */
public class A024556 extends Sequence1 {

  private long mN = 13;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      final FactorSequence fs = Jaguar.factor(mN);
      if (fs.omega() > 1 && fs.isSquareFree()) {
        return Z.valueOf(mN);
      }
    }
  }
}
