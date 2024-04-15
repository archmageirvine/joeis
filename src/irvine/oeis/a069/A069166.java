package irvine.oeis.a069;

import irvine.math.MemoryFunction1;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069166 Numbers k such that k*Sum_{d|k} 1/sigma(d) is an integer.
 * @author Sean A. Irvine
 */
public class A069166 extends Sequence1 {

  private int mN = 0;
  private final MemoryFunction1<Z> mSigma = new MemoryFunction1<>() {
    @Override
    protected Z compute(final int key) {
      return Functions.SIGMA.z(key);
    }
  };

  @Override
  public Z next() {
    while (true) {
      final Q s = Rationals.SINGLETON.sumdiv(++mN, d -> new Q(Z.ONE, mSigma.get(d)));
      if (s.multiply(mN).isInteger()) {
        return Z.valueOf(mN);
      }
    }
  }
}

