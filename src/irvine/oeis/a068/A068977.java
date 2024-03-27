package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.math.MemoryFunction1;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068977 Numbers k such that Sum_{d|k} d/tau(d) is an integer, where tau(x)=A000005(x).
 * @author Sean A. Irvine
 */
public class A068977 extends Sequence1 {

  private int mN = 0;
  private final MemoryFunction1<Long> mSigma0 = new MemoryFunction1<>() {
    @Override
    protected Long compute(final int n) {
      return Jaguar.factor(n).sigma0AsLong();
    }
  };

  @Override
  public Z next() {
    while (true) {
      if (Rationals.SINGLETON.sumdiv(++mN, d -> new Q(d, mSigma0.get(d))).isInteger()) {
        return Z.valueOf(mN);
      }
    }
  }
}
