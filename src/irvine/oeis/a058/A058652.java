package irvine.oeis.a058;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058652 Squarefree n such that sigma(phi(n)) = phi(sigma(n)).
 * @author Sean A. Irvine
 */
public class A058652 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.isSquareFree()) {
        final Z sigma = fs.sigma();
        final Z phi = fs.phi();
        if (Jaguar.factor(phi).sigma().equals(Euler.phi(sigma))) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
