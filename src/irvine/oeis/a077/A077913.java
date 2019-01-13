package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077913.
 * @author Sean A. Irvine
 */
public class A077913 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077913() {
    super(new long[] {1, 1, -1, 0}, new long[] {1, 0, -1, 1});
  }
}
