package irvine.oeis.a088;

import irvine.oeis.LinearRecurrence;

/**
 * A088225.
 * @author Sean A. Irvine
 */
public class A088225 extends LinearRecurrence {

  /** Construct the sequence. */
  public A088225() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {2, 6, 7, 8, 13});
  }
}
