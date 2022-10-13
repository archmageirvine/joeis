package irvine.oeis.a128;
// manually rio/trigf at 2022-10-11 19:37

import irvine.oeis.triangle.GeneratingFunctionTriangle;

/**
 * A128174 Transform, (1,0,1,...) in every column.
 * @author Georg Fischer
 */
public class A128174 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A128174() {
    super(0, new long[] {1}, new long[] {1, 0, -1, -1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0});
    setOffset(1);
  }
}
