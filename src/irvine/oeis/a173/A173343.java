package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173343.
 * @author Sean A. Irvine
 */
public class A173343 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173343() {
    super(new long[] {-1, -1, -2, 1}, new long[] {1, 2, 0, -5});
  }
}
