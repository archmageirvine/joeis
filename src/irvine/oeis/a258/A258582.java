package irvine.oeis.a258;

import irvine.oeis.LinearRecurrence;

/**
 * A258582.
 * @author Sean A. Irvine
 */
public class A258582 extends LinearRecurrence {

  /** Construct the sequence. */
  public A258582() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 5, 30, 91});
  }
}
