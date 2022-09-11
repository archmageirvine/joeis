package irvine.oeis.a059;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059023 Triangle of Stirling numbers of order 4.
 * @author Sean A. Irvine
 */
public class A059023 extends MemoryFunctionInt2<Z> implements Sequence {

  private int mN = 3;
  private int mM = 3;

  @Override
  protected Z compute(final int n, final int m) {
    if (n < 4) {
      return Z.ZERO;
    }
    if (n < 8 && m == 1) {
      return Z.ONE;
    }
    return get(n - 1, m).multiply(m).add(get(n - 4, m - 1).multiply(Binomial.binomial(n - 1, 3)));
  }

  @Override
  public Z next() {
    if (++mM > mN / 4) {
      ++mN;
      mM = 1;
    }
    return get(mN, mM);
  }
}
