package irvine.oeis.a003;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A003413 From a nim-like game.
 * @author Sean A. Irvine
 */
public class A003413 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003413() {
    super(new long[] {0, 0, 1, 0, 0, 0, 0, 1}, new long[] {1, 2, 3, 4, 5, 7, 9, 12});
  }
}
