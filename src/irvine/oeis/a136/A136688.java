package irvine.oeis.a136;
// manually rio/trigf at 2022-10-11 19:37

import irvine.oeis.triangle.GeneratingFunctionTriangle;

/**
 * A136688 Triangle of polynomials F(x,n) = x*F(x,n-1) + 2*F(x,n-2).
 * @author Georg Fischer
 */
public class A136688 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A136688() {
    super(0, new long[] {1, 0, 0, -2, 0, 0}, new long[] {1, 0, -1, -4, 0, 0, 0, 2, 0, 0, 4, 0, 0, 0, 0});
    setOffset(1);
  }
}
