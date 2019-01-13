package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135493.
 * @author Sean A. Irvine
 */
public class A135493 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135493() {
    super(new long[] {1, 1, 1, 1, 1}, new long[] {2, 4, 8, 16, 32});
  }
}
