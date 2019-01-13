package irvine.oeis.a259;

import irvine.oeis.LinearRecurrence;

/**
 * A259322.
 * @author Sean A. Irvine
 */
public class A259322 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259322() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 730, 16355, 134004, 665445, 2437006, 7263815, 18654440});
  }
}
