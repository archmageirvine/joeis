package irvine.oeis.a128;
// manually rio/trigf at 2022-10-11 19:37

import irvine.oeis.triangle.GeneratingFunctionTriangle;

/**
 * A128514 Triangle, Pell sequence in every column.
 * @author Georg Fischer
 */
public class A128514 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A128514() {
    super(0, new long[] {1}, new long[] {1, -2, -1, -1, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0});
    setOffset(1);
  }
}
