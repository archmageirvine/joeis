package irvine.oeis.a159;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A159809 Positive numbers y such that y^2 is of the form x^2+(x+223)^2 with integer x.
 * @author Sean A. Irvine
 */
public class A159809 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159809() {
    super(new long[] {-1, 0, 0, 6, 0, 0}, new long[] {197, 223, 257, 925, 1115, 1345});
  }
}
