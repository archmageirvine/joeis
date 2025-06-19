package irvine.oeis.a051;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A051168 Triangular array T(h,k) for 0 &lt;= k &lt;= h read by rows: T(h,k) = number of binary Lyndon words with k ones and h-k zeros.
 * @author Sean A. Irvine
 */
public class A051168 extends AbstractSequence {

  protected A051168(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A051168() {
    super(0);
  }

  private long mN = -1;
  private long mM = 0;

  /**
   * Return an element of the triangle
   * @param n index
   * @param k index
   * @return value
   */
  public Z t(final long n, final long k) {
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(Functions.GCD.l(n, k)).divisors()) {
      final long d = dd.longValue();
      sum = sum.add(Binomial.binomial(n / d, k / d).multiply(Functions.MOBIUS.i(d)));
    }
    return sum.divide(n);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM);
  }
}
