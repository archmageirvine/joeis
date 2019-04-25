package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157646 Positive numbers y such that <code>y^2</code> is of the form <code>x^2 + (x+31)^2</code> with integer x.
 * @author Sean A. Irvine
 */
public class A157646 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157646() {
    super(new long[] {-1, 0, 0, 6, 0, 0}, new long[] {25, 31, 41, 109, 155, 221});
  }
}
