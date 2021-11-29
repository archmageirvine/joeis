package irvine.oeis.a255;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A255517 Number A(n,k) of rooted identity trees with n nodes and k-colored non-root nodes; square array A(n,k), n&gt;=0, k&gt;=0, read by antidiagonals.
 * square array A(n,k), n&gt;=0, k&gt;=0, read by antidiagonals.
 * @author Georg Fischer
 */
public class A255517 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A255517() {
    super(0, 0, -1);
  }

  /* Maple (AH): A:= proc(n, k) option remember;
      `if`(n<2, n,
          add( A(n-j, k) *
               add( k*A(d, k)*d*(-1)^(j/d+1)
                  , d=divisors(j) )
             , j=1..n-1)
          / (n-1) )  end:
  */
  @Override
  public Z matrixElement(final int n, final int k) {
    if (n <= 1) {
      return Z.valueOf(n);
    } else {
      Z sumj = Z.ZERO;
      for (int j = 1; j < n; ++j) {
        Z sumd = Z.ZERO;
        for (final Z dd : Cheetah.factor(j).divisors()) {
          final int d = dd.intValue();
          sumd = sumd.add(getElement(d, k).multiply(d * k * ((((j / d + 1) & 1) == 0) ? 1 : -1)));
        }
        sumj = sumj.add(getElement(n - j, k).multiply(sumd));
      }
      return sumj.divide(n - 1);
    }
  }
}
