package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157241.
 * @author Sean A. Irvine
 */
public class A157241 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157241() {
    super(new long[] {4, -6, 3}, new long[] {0, 1, 3});
  }
}
