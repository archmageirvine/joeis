package irvine.oeis.a053;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053858 Squarefree even composite numbers with an odd number of prime factors.
 * @author Sean A. Irvine
 */
public class A053858 implements Sequence {

  private long mN = 28;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      final FactorSequence fs = Jaguar.factor(mN);
      if ((fs.omega() & 1) == 1 && fs.isSquareFree()) {
        return Z.valueOf(mN);
      }
    }
  }
}
