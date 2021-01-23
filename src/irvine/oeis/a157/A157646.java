package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157646 Positive numbers y such that y^2 is of the form x^2 + (x+31)^2 with integer x.
 * @author Sean A. Irvine
 */
public class A157646 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157646() {
    super(new long[] {-1, 0, 0, 6, 0, 0}, new long[] {25, 31, 41, 109, 155, 221});
  }
}
