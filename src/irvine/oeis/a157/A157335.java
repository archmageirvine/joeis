package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157335.
 * @author Sean A. Irvine
 */
public class A157335 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157335() {
    super(new long[] {-1, 6, 6}, new long[] {1, 6, 42});
  }
}
