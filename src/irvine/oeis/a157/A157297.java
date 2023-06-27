package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157297 Positive numbers y such that y^2 is of the form x^2+(x+233)^2 with integer x.
 * @author Sean A. Irvine
 */
public class A157297 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157297() {
    super(1, new long[] {-1, 0, 0, 6, 0, 0}, new long[] {185, 233, 317, 793, 1165, 1717});
  }
}
