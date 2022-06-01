package irvine.oeis.a028;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A028991 Odd 9-gonal (or enneagonal) numbers.
 * @author Sean A. Irvine
 */
public class A028991 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028991() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 9, 75, 111, 261});
  }
}
