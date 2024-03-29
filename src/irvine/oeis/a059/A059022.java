package irvine.oeis.a059;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunctionInt2Sequence;

/**
 * A059022 Triangle of Stirling numbers of order 3.
 * @author Sean A. Irvine
 */
public class A059022 extends MemoryFunctionInt2Sequence<Z> {

  /** Construct the sequence. */
  public A059022() {
    super(3);
  }

  private int mN = 2;
  private int mM = 2;

  @Override
  protected Z compute(final int n, final int m) {
    if (n < 3) {
      return Z.ZERO;
    }
    if (n < 6 && m == 1) {
      return Z.ONE;
    }
    return get(n - 1, m).multiply(m).add(get(n - 3, m - 1).multiply(Binomial.binomial(n - 1, 2)));
  }

  @Override
  public Z next() {
    if (++mM > mN / 3) {
      ++mN;
      mM = 1;
    }
    return get(mN, mM);
  }
}
