package irvine.oeis.a287;

import irvine.oeis.LinearRecurrence;

/**
 * A287394 Domination number for camel's graph on a 2 X n board.
 * @author Sean A. Irvine
 */
public class A287394 extends LinearRecurrence {

  /** Construct the sequence. */
  public A287394() {
    super(new long[] {-1, 2, -1, -1, 2, -1, -1, 2}, new long[] {0, 2, 4, 6, 6, 6, 6, 6});
  }
}
