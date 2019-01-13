package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157909.
 * @author Sean A. Irvine
 */
public class A157909 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157909() {
    super(new long[] {1, -3, 3}, new long[] {72, 315, 720});
  }
}
