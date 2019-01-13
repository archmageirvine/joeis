package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084156.
 * @author Sean A. Irvine
 */
public class A084156 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084156() {
    super(new long[] {3, -12, 2, 4}, new long[] {0, 1, 2, 13});
  }
}
