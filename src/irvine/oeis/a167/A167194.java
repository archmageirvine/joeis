package irvine.oeis.a167;
// manually rio/trigf at 2022-10-11 19:37

import irvine.oeis.triangle.GeneratingFunctionTriangle;

/**
 * A167194 Triangle read by rows. A130713 in the columns.
 * @author Georg Fischer
 */
public class A167194 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A167194() {
    super(0, new long[] {1, 2, 0, 1, 0, 0}, new long[] {1, 0, -1, 0, 0, 0});
    setOffset(1);
  }
}
