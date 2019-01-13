package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157517.
 * @author Sean A. Irvine
 */
public class A157517 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157517() {
    super(new long[] {1, -3, 3}, new long[] {7, 13, 7});
  }
}
