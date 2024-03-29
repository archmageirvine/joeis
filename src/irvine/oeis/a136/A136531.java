package irvine.oeis.a136;
// Generated by gen_seq4.pl robot/trigf at 2023-05-02 19:29

import irvine.oeis.triangle.GeneratingFunctionTriangle;

/**
 * A136531 Coefficients of polynomials B(x,n) = ((1+a+b)*x - c)*B(x,n-1) - a*b*B(x,n-2) where B(x,0) = 1, B(x,1) = x, a=-b, b=1, c=1.
 * @author Georg Fischer
 */
public class A136531 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A136531() {
    super(0, new long[] {1, 1, 0}, new long[] {1, 1, -1, -1, 0, 0});
  }
}
