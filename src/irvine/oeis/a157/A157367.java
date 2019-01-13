package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157367.
 * @author Sean A. Irvine
 */
public class A157367 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157367() {
    super(new long[] {1, -3, 3}, new long[] {4999, 19601, 43807});
  }
}
