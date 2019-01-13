package irvine.oeis.a139;

import irvine.oeis.LinearRecurrence;

/**
 * A139613.
 * @author Sean A. Irvine
 */
public class A139613 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139613() {
    super(new long[] {-1, 2}, new long[] {13, 91});
  }
}
