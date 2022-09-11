package irvine.oeis.a059;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059024 Triangle of Stirling numbers of order 5.
 * @author Sean A. Irvine
 */
public class A059024 extends MemoryFunctionInt2<Z> implements Sequence {

  private int mN = 4;
  private int mM = 4;

  @Override
  protected Z compute(final int n, final int m) {
    if (n < 5) {
      return Z.ZERO;
    }
    if (n < 9 && m == 1) {
      return Z.ONE;
    }
    return get(n - 1, m).multiply(m).add(get(n - 5, m - 1).multiply(Binomial.binomial(n - 1, 4)));
  }

  @Override
  public Z next() {
    if (++mM > mN / 5) {
      ++mN;
      mM = 1;
    }
    return get(mN, mM);
  }
}
