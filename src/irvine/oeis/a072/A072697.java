package irvine.oeis.a072;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072697 Squarefree numbers such that the sum of the prime factors is a multiple of the number of prime factors.
 * @author Sean A. Irvine
 */
public class A072697 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.isSquareFree() && fs.sopf().mod(fs.omega()) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
