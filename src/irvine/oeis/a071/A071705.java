package irvine.oeis.a071;

import irvine.math.MemoryFunction1;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A071705 Least k &gt; n such that C(2n,n) divides C(2k,k).
 * @author Sean A. Irvine
 */
public class A071705 extends Sequence0 {

  private int mN = -1;
  private final MemoryFunction1<Z> mB = new MemoryFunction1<>() {
    @Override
    protected Z compute(final int n) {
      return Binomial.binomial(2L * n, n);
    }
  };

  @Override
  public Z next() {
    final Z t = mB.get(++mN);
    int k = Math.max(2 * mN, 1);
    while (!mB.get(k).mod(t).isZero()) {
      ++k;
    }
    return Z.valueOf(k);
  }
}
