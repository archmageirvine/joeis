package irvine.oeis.a048;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a047.A047161;

/**
 * A048093 Number of nonempty subsets of {1,2,...,n} in which exactly 1/2 of the elements are &lt;= sqrt(n).
 * @author Georg Fischer
 */
public class A048093 extends A047161 {
    
  /** Construct the sequence */
  public A048093() {
    this(1, 1, 2, 0, 0);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param num numerator of fraction
   * @param den denominator of fraction
   */
  public A048093(final int offset, final int num, final int den, final int add, final int div) {
    super(offset, num, den, add, div);
  }

  @Override
  public Z next() {
    ++mN;
    final int k = Z.valueOf(mN).sqrt().intValue();
    Z sum = Z.ZERO;
    for (int j = mDen; j <= mN; j += mDen) {
      sum = sum.add(Binomial.binomial(k, j * mNum / mDen).multiply(Binomial.binomial(mN - k, j * (mDen - mNum) / mDen)));
    } 
    return sum;
  }
}
