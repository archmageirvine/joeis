package irvine.oeis.a262;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a183.A183109;
import irvine.oeis.memory.MemoryFunctionInt2Sequence;

/**
 * A262307 Array read by antidiagonals: T(m,n) = number of m X n binary matrices with all 1's connected and no zero rows or columns.
 * @author Gregory Morse
 */
public class A262307 extends MemoryFunctionInt2Sequence<Z> {
  private int mN = 0;
  private int mM = 0;

  protected A262307(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A262307() {
    this(1);
  }

  @Override
  protected Z compute(final int m, final int n) {
    Z sum = A183109.matrices(m, n);
    for (int i = 1; i < m; ++i) {
      for (int j = 1; j < n; ++j) {
        final Z choose = Binomial.binomial(m - 1, i - 1).multiply(Binomial.binomial(n, j));
        sum = sum.subtract(choose.multiply(get(i, j)).multiply(A183109.matrices(m - i, n - j)));
      }
    }
    return sum;
  }

  protected Z term(final int m, final int n) {
    return get(m, n);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return term(mM, mN + 1 - mM);
  }
}
