package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290907.
 * @author Sean A. Irvine
 */
public class A290907 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290907() {
    super(new long[] {-1, 4, -3, 4}, new long[] {0, 1, 4, 13});
  }
}
