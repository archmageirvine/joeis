package irvine.oeis.a147;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A147677 Subtract 5, add 8, repeat.
 * @author Sean A. Irvine
 */
public class A147677 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147677() {
    super(1, new long[] {-1, 1, 1}, new long[] {7, 2, 10});
  }
}
