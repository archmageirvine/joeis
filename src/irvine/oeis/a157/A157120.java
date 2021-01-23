package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157120 Positive numbers y such that y^2 is of the form x^2+(x+103)^2 with integer x.
 * @author Sean A. Irvine
 */
public class A157120 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157120() {
    super(new long[] {-1, 0, 0, 6, 0, 0}, new long[] {73, 103, 205, 233, 515, 1157});
  }
}
