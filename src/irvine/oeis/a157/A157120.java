package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157120 Positive numbers y such that <code>y^2</code> is of the form <code>x^2+(x+103)^2</code> with integer x.
 * @author Sean A. Irvine
 */
public class A157120 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157120() {
    super(new long[] {-1, 0, 0, 6, 0, 0}, new long[] {73, 103, 205, 233, 515, 1157});
  }
}
