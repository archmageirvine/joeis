package irvine.oeis.a003;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A003412 From a nim-like game.
 * @author Sean A. Irvine
 */
public class A003412 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003412() {
    super(new long[] {1, 0, 0, 0, 0, 1}, new long[] {11, 14, 18, 24, 32, 43}, 1, 2, 3, 4, 6, 8);
  }
}
