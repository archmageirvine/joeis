package irvine.oeis.a105;
// manually rio/trigf at 2022-10-11 19:37

import irvine.oeis.triangle.GeneratingFunctionTriangle;

/**
 * A105306 Triangle read by rows: T(n,k) is the number of directed column-convex polyominoes of area n, having the top of the rightmost column at height k.
 * @author Georg Fischer
 */
public class A105306 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A105306() {
    super(0, new long[] {1, -3, 0, 2, 0, 0}, new long[] {1, -4, -1, 4, 3, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0});
    setOffset(1);
  }
}
