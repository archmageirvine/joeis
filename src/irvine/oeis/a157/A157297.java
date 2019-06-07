package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157297 Positive numbers y such that <code>y^2</code> is of the form <code>x^2+(x+233)^2</code> with integer <code>x</code>.
 * @author Sean A. Irvine
 */
public class A157297 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157297() {
    super(new long[] {-1, 0, 0, 6, 0, 0}, new long[] {185, 233, 317, 793, 1165, 1717});
  }
}
