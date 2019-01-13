package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157297.
 * @author Sean A. Irvine
 */
public class A157297 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157297() {
    super(new long[] {-1, 0, 0, 6, 0, 0}, new long[] {185, 233, 317, 793, 1165, 1717});
  }
}
