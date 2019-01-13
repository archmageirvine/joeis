package irvine.oeis.a139;

import irvine.oeis.LinearRecurrence;

/**
 * A139610.
 * @author Sean A. Irvine
 */
public class A139610 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139610() {
    super(new long[] {-1, 2}, new long[] {10, 55});
  }
}
