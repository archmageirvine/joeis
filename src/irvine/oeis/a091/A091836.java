package irvine.oeis.a091;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A091836 A triangle of Motzkin ballot numbers.
 * @author Sean A. Irvine
 */
public class A091836 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A091836(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A091836() {
    super(0);
  }

  private long mN = 0;
  private long mM = 0;

  protected Z t(final long n, final long m) {
    if (n == m) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (long k = 1; k <= n - m; ++k) {
      Z s = Z.ZERO;
      for (long j = 0; j <= n - m; ++j) {
        s = s.add(Binomial.binomial(j, m - n - k + 2 * j).multiply(Binomial.binomial(n - m, j)));
      }
      sum = sum.signedAdd(((n + k) & 1) == 0, s.multiply(k).multiply(Binomial.binomial(n + k - 1, n - 1)));
    }
    return sum.multiply(m).divide(n).divide(n - m).abs();
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return t(mN, mM);
  }
}
