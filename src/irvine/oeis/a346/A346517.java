package irvine.oeis.a346;

import irvine.math.MemoryFunction2;
import irvine.math.z.BellNumbers;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A346517 Number A(n,k) of partitions of the (n+k)-multiset {1,2,...,n,1,2,...,k} into distinct multisets; square array A(n,k), n&gt;=0, k&gt;=0, read by antidiagonals.
 * @author Georg Fischer
 */
public class A346517 extends UpperLeftTriangle {

  private int mBinomialSign;

  /** Construct the sequence. */
  public A346517() {
    this(-1);
  }

  /**
   * Generic constructor with parameter.
   * @param binomialSign sign of the sum over binomials
   */
  public A346517(final int binomialSign) {
    super(0, 0, -1);
    hasRAM(true);
    mBinomialSign = binomialSign;
  }

  /* Maple:
    b:= proc(n) option remember; `if`(n=0, 1,
          add(b(n-j)*binomial(n-1, j-1), j=1..n))
        end: # Bell numbers
    A:= proc(n, k) option remember; `if`(n<k, A(k, n),
         `if`(k=0, b(n), 
          ( A(n+1, k-1)
          - add(A(n-k+j, j)*binomial(k-1, j), j=0..k-1) # "+ add(... for A346500
          + A(n, k-1)  )/2))
        end:
    seq(seq(A(n, d-n), n=0..d), d=0..10);
  */
  private MemoryFunction2<Integer, Z> mProcA = new MemoryFunction2<Integer, Z>() {
    @Override
    public Z compute(final Integer n, final Integer k) {
      if (n < k) {
        return get(k, n);
      }
      if (k == 0) {
        return BellNumbers.bell(n);
      }
      Z sum = get(n + 1, k - 1);
      for (int j = 0; j < k; ++j) {
        sum = sum.add(get(n - k + j, j).multiply(mBinomialSign).multiply(Binomial.binomial(k - 1, j)));
      }
      return sum.add(get(n, k - 1)).divide2();
    }
  };

  @Override
  public Z matrixElement(final int n, final int k) {
    return mProcA.get(n, k);
  }
}
