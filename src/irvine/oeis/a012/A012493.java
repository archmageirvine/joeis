package irvine.oeis.a012;

import irvine.oeis.LinearRecurrence;

/**
 * A012493.
 * @author Sean A. Irvine
 */
public class A012493 extends LinearRecurrence {

  /** Construct the sequence. */
  public A012493() {
    super(new long[] {1, -4, 5}, new long[] {0, 2, 9});
  }
}
