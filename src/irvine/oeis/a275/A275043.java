package irvine.oeis.a275;
// manually at 2023-07-08

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A275043 Number A(n,k) of set partitions of [k*n] such that within each block the numbers of elements from all residue classes modulo k are equal for k&gt;0, A(n, 0)=1; square array A(n,k), n&gt;=0, k&gt;=0, read by antidiagonals.
 * from all residue classes modulo k are equal for k&gt;0, A(n, 0)=1; square array A(n,k), n&gt;=0, k&gt;=0, read by antidiagonals.
 * @author Georg Fischer
 */
public class A275043 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A275043() {
    super(0, 0, 0, -1);
  }

  /* Maple:
    A:= proc(n, k) option remember; `if`(k*n=0, 1, 
      add(binomial(n, j)^k*(n-j)*A(j, k), j=0..n-1)/n)
      end:
    seq(seq(A(n, d-n), n=0..d), d=0..12);  
  */
  @Override
  public Z matrixElement(final int n, final int k) {
    if (k * n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int j = 0; j < n; ++j) {
      sum = sum.add(Binomial.binomial(n, j).pow(k).multiply(n - j).multiply(getElement(j, k)));
    }
    return sum.divide(n);
  }
}
