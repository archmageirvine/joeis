package irvine.oeis.a245;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A245368 Compositions of n into parts 3, 4 and 7.
 * @author Sean A. Irvine
 */
public class A245368 extends LinearRecurrence {

  /** Construct the sequence. */
  public A245368() {
    super(new long[] {1, 0, 0, 1, 1, 0, 0}, new long[] {1, 0, 0, 1, 1, 0, 1});
  }
}
