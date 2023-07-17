package irvine.oeis.a047;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A047161 Number of nonempty subsets of {1,2,...,n} in which exactly 1/3 of the elements are &lt;= n/2.
 * @author Georg Fischer
 */
public class A047161 extends AbstractSequence {

  protected int mN; // current index
  protected int mNum; // numerator
  protected int mDen; // denominator
  protected int mAdd; // n + a
  protected int mDiv; // (n + a)/d

  /** Construct the sequence. */
  public A047161() {
    this(1, 1, 3, 0, 2);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param num numerator of fraction
   * @param den denominator of fraction
   * @param add additional term a for n
   * @param div divisor of (n+a)
   */
  public A047161(final int offset, final int num, final int den, final int add, final int div) {
    super(offset);
    mN = offset - 1;
    mNum = num;
    mDen = den;
    mAdd = add;
    mDiv = div;
  }

  @Override
  public Z next() {
    ++mN;
    /*
      A048046 (Maple):
      f:= proc(n) local k, j;
        k:= floor((n+1)/3);
        add(binomial(k, 4/5*j)*binomial(n-k, 1/5*j), j=5..n, 5)
      end proc:
      map(f, [$1..100]); # Robert Israel, Apr 16 2019
    */
    final int k = (mN + mAdd) / mDiv;
    Z sum = Z.ZERO;
    for (int j = mDen; j <= mN; j += mDen) {
      sum = sum.add(Binomial.binomial(k, j * mNum / mDen).multiply(Binomial.binomial(mN - k, j * (mDen - mNum) / mDen)));
    }
    return sum;
  }
}
