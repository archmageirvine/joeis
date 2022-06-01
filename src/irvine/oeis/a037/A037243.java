package irvine.oeis.a037;

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A037243 Molien series for 3-D group R4.
 * @author Sean A. Irvine
 */
public class A037243 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A037243() {
    super(new long[] {1, 0, 2, 5, 11, 9, 11, 6, 3}, new long[] {1, -1, -3, 1, 5, 3, -6, -6, 3, 5, 1, -3, -1, 1});
  }
}
