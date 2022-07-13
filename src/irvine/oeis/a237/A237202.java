package irvine.oeis.a237;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A237202 Irregular triangle read by rows: T(n,k) = Sum_{i=0..k} (-1)^i * binomial(5*n+1,i) * binomial(k+5-i, 5)^n, 0 &lt;= k &lt;= 5*(n-1).
 * @author Georg Fischer
 */
public class A237202 extends BaseTriangle {

  private final int mCopies;

  /**
   * Empty constructor
   */
  public A237202() {
    this(1, 1, 0, 5);
  }

  /**
   * Generic constructor with parameter
   * @param offset index of first term
   * @param rowShift index of first row
   * @param colShift index of first column
   * @param copies number of indistinguishable copies
   */
  public A237202(final int offset, final int rowShift, final int colShift, final int copies) {
    super(offset, rowShift, colShift, n -> copies * n + 1);
    mCopies = copies;
  }

  // (PARI) T(n, k)={sum(i=0, k, (-1)^i*binomial(5*n+1, i)*binomial(k+5-i, 5)^n)} 
  @Override
  public Z triangleElement(final int n, final int k) {
    Z sum = Z.ZERO;
    for (int i = 0; i <= k; ++i) {
      sum = sum.add(Binomial.binomial(mCopies * n + 1, i).multiply(((i & 1) == 0) ? 1 : -1)
        .multiply(Binomial.binomial(k + mCopies - i, mCopies).pow(n)));
    }
    return sum;
  }
}
