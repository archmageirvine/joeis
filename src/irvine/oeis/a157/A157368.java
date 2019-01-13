package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157368.
 * @author Sean A. Irvine
 */
public class A157368 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157368() {
    super(new long[] {1, -3, 3}, new long[] {2, 71, 238});
  }
}
