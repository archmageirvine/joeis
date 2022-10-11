package irvine.oeis.a059;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059797 Second in a series of arrays counting standard tableaux by partition type.
 * @author Sean A. Irvine
 */
public class A059797 extends MemoryFunctionInt2<Z> implements Sequence {

  private int mN = -1;
  private int mM = 0;

  @Override
  protected Z compute(final int n, final int m) {
    if (m < 0 || m > n) {
      return Z.ZERO;
    }
    return get(n - 1, m - 1).add(get(n - 1, m)).add(Binomial.binomial(n + 2, m + 1));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return get(mN, mM);
  }
}
