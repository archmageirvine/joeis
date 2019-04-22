package irvine.oeis.a287;

import irvine.oeis.LinearRecurrence;

/**
 * A287392 Domination number for lion's graph on <code>an n</code> X n board.
 * @author Sean A. Irvine
 */
public class A287392 extends LinearRecurrence {

  /** Construct the sequence. */
  public A287392() {
    super(new long[] {1, -1, 0, 0, 0, -2, 2, 0, 0, 0, 1}, new long[] {0, 1, 1, 1, 1, 1, 4, 4, 4, 4, 4});
  }
}
