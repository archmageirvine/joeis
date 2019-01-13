package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171069.
 * @author Sean A. Irvine
 */
public class A171069 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171069() {
    super(new long[] {-1, 1, 12, 1}, new long[] {0, 1, 1, 12});
  }
}
