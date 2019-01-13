package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157958.
 * @author Sean A. Irvine
 */
public class A157958 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157958() {
    super(new long[] {-1, 2}, new long[] {243, 485});
  }
}
