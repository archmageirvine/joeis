package irvine.oeis.a105;
// manually rio/trigf at 2022-10-11 19:37

import irvine.oeis.triangle.GeneratingFunctionTriangle;

/**
 * A105475 Triangle read by rows: T(n,k) is number of compositions of n into k parts when each even part can be of two kinds.
 * @author Georg Fischer
 */
public class A105475 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A105475() {
    super(0, new long[] {1, 2, 0, -1, 0, 0, -2, 0, 0, 0}, new long[] {1, 0, -1, -2, -2, 0, 0, 1, 0, 0, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    setOffset(1);
  }
}
