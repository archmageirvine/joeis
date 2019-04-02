package irvine.oeis.a139;

import irvine.oeis.LinearRecurrence;

/**
 * A139607 a(n) = 21*n + 7.
 * @author Sean A. Irvine
 */
public class A139607 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139607() {
    super(new long[] {-1, 2}, new long[] {7, 28});
  }
}
