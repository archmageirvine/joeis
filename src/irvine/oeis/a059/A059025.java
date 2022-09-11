package irvine.oeis.a059;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059025 Triangle of Stirling numbers of order 6.
 * @author Sean A. Irvine
 */
public class A059025 extends MemoryFunctionInt2<Z> implements Sequence {

  private int mN = 5;
  private int mM = 5;

  @Override
  protected Z compute(final int n, final int m) {
    if (n < 6) {
      return Z.ZERO;
    }
    if (n < 10 && m == 1) {
      return Z.ONE;
    }
    return get(n - 1, m).multiply(m).add(get(n - 6, m - 1).multiply(Binomial.binomial(n - 1, 5)));
  }

  @Override
  public Z next() {
    if (++mM > mN / 6) {
      ++mN;
      mM = 1;
    }
    return get(mN, mM);
  }
}
