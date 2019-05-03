package irvine.oeis.a287;

import irvine.oeis.LinearRecurrence;

/**
 * A287393 Domination number for knight's graph on a <code>2 X n</code> board.
 * @author Sean A. Irvine
 */
public class A287393 extends LinearRecurrence {

  /** Construct the sequence. */
  public A287393() {
    super(new long[] {-1, 2, -2, 2, -2, 2}, new long[] {0, 2, 4, 4, 4, 4});
  }
}
