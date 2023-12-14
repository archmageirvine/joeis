package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067341 Number of prime factors divided by the number of distinct prime factors is an integer and n is neither squarefree, nor power of prime.
 * @author Sean A. Irvine
 */
public class A067341 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (!fs.isSquareFree() && fs.omega() > 1 && fs.bigOmega() % fs.omega() == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

