package irvine.oeis.a105;
// manually rio/trigf at 2022-10-11 19:37

import irvine.oeis.triangle.GeneratingFunctionTriangle;

/**
 * A105495 Triangle read by rows: T(n,k) is the number of compositions of n into k parts when parts equal to q are of q^2 kinds.
 * @author Georg Fischer
 */
public class A105495 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A105495() {
    super(0, new long[] {1, -2, 0, 0, 0, 0, 2, 0, 0, 0, -1, 0, 0, 0, 0}, new long[] {1, -6, -1, 15, 2, 0, -20, 0, 0, 0, 15, -2, 0, 0, 0, -6, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0});
    setOffset(1);
  }
}
