package irvine.oeis.a128;
// manually rio/trigf at 2022-10-11 21:49

import irvine.oeis.triangle.GeneratingFunctionTriangle;

/**
 * A128307 Triangle, (1, 0, 1, 2, 4, 8, ...) in every column.
 * @author Georg Fischer
 */
public class A128307 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A128307() {
    super(0, new long[] {1, -2, 0, 1, 0, 0}, new long[] {1, -2, -1, 0, 2, 0, 0, 0, 0, 0});
    setOffset(1);
  }
}
