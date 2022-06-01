package irvine.oeis.a076;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A076119 Every second sector of a dartboard, starting at the top (20) and working around clockwise.
 * @author Sean A. Irvine
 */
public class A076119 extends LinearRecurrence {

  /** Construct the sequence. */
  public A076119() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {20, 18, 13, 10, 2, 3, 7, 8, 14, 12});
  }
}
