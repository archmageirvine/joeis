package irvine.oeis.a128;
// manually rio/trigf at 2022-10-11 19:37

import irvine.oeis.triangle.GeneratingFunctionTriangle;

/**
 * A128175 Binomial transform of A128174.
 * @author Georg Fischer
 */
public class A128175 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A128175() {
    super(0, new long[] {1, -2, 0, 1, 0, 0}, new long[] {1, -3, -1, 2, 2, 0, 0, 0, 0, 0});
    setOffset(1);
  }
}
