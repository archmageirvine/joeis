package irvine.oeis.a047;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A047161 Number of nonempty subsets of {1,2,...,n} in which exactly 1/3 of the elements are &lt;= n/2.
 * Offset 1;
 * DATA 0, 0, 1, 2, 6, 9, 21, 30, 70, 100, 235, 335, 791, 1127, 2681, 3822, 9150, 13050, 31401, 44802 ...
 * @author Georg Fischer
 */

public class A047161 implements Sequence {
    
  protected int mN; // current index
  protected int mNum; // numerator
  protected int mDen; // denominator
  protected int mAdd; // n + a
  protected int mDiv; // (n + a)/d
  
  /** Cosntruct the sequence */
  public A047161() {
    this(1, 1, 3, 0, 2);
  }
  
  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param num numerator of fraction
   * @param den denominator of fraction
   */
  public A047161(final int offset, final int num, final int den, final int add, final int div) {
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
