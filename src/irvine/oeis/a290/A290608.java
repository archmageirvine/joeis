package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290608.
 * @author Sean A. Irvine
 */
public class A290608 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290608() {
    super(new long[] {1, 2, 1, 0}, new long[] {2, 8, 12, 16});
  }
}
