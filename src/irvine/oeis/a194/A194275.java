package irvine.oeis.a194;

import irvine.oeis.LinearRecurrence;

/**
 * A194275.
 * @author Sean A. Irvine
 */
public class A194275 extends LinearRecurrence {

  /** Construct the sequence. */
  public A194275() {
    super(new long[] {1, -2, 1, -1, 2}, new long[] {0, 1, 5, 10, 16});
  }
}
