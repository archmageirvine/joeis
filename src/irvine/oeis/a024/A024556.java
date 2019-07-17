package irvine.oeis.a024;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024556 Odd squarefree composite numbers.
 * @author Sean A. Irvine
 */
public class A024556 implements Sequence {

  private long mN = 13;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      final FactorSequence fs = Cheetah.factor(mN);
      if (fs.omega() > 1 && fs.isSquareFree()) {
        return Z.valueOf(mN);
      }
    }
  }
}
