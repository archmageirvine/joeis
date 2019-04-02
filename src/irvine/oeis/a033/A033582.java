package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033582 7*n^2.
 * @author Sean A. Irvine
 */
public class A033582 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033582() {
    super(new long[] {1, -3, 3}, new long[] {0, 7, 28});
  }
}
