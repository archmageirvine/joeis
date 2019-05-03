package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028991 Odd <code>9-gonal (or enneagonal)</code> numbers.
 * @author Sean A. Irvine
 */
public class A028991 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028991() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 9, 75, 111, 261});
  }
}
