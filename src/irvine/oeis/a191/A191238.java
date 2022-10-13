package irvine.oeis.a191;
// manually rio/trigf at 2022-10-11 19:37

import irvine.oeis.triangle.GeneratingFunctionTriangle;

/**
 * A191238 Triangle T(n,k) = coefficient of x^n in expansion of (x+x^3+x^5)^k.
 * @author Georg Fischer
 */
public class A191238 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A191238() {
    super(0, new long[] {1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0}, new long[] {1, 0, -1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    setOffset(1);
  }
}
