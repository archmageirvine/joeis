package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022289.
 * @author Sean A. Irvine
 */
public class A022289 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022289() {
    super(new long[] {1, -3, 3}, new long[] {0, 16, 63});
  }
}
