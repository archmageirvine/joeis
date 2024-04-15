package irvine.oeis.a068;

import irvine.math.MemoryFunction1;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068978 Numbers k such that Sum_{d|k} tau(d)/d is an integer, where tau(x) = A000005(x).
 * @author Sean A. Irvine
 */
public class A068978 extends Sequence1 {

  private int mN = 0;
  private final MemoryFunction1<Long> mSigma0 = new MemoryFunction1<>() {
    @Override
    protected Long compute(final int n) {
      return Functions.SIGMA0.l(n);
    }
  };

  @Override
  public Z next() {
    while (true) {
      if (Rationals.SINGLETON.sumdiv(++mN, d -> new Q(mSigma0.get(d), d)).isInteger()) {
        return Z.valueOf(mN);
      }
    }
  }
}
