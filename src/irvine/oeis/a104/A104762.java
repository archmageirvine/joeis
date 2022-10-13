package irvine.oeis.a104;
// manually rio/trigf at 2022-10-11 19:37

import irvine.oeis.triangle.GeneratingFunctionTriangle;

/**
 * A104762 Triangle read by rows: row n contains first n nonzero Fibonacci numbers in decreasing order.
 * @author Georg Fischer
 */
public class A104762 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A104762() {
    super(0, new long[] {1}, new long[] {1, -1, -1, -1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0});
    setOffset(1);
  }
}
