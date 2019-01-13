package irvine.oeis.a141;

import irvine.oeis.LinearRecurrence;

/**
 * A141582.
 * @author Sean A. Irvine
 */
public class A141582 extends LinearRecurrence {

  /** Construct the sequence. */
  public A141582() {
    super(new long[] {1, -3, 1, 5, -5, -1, 3}, new long[] {0, 0, 2, 8, 21, 48, 93});
  }
}
