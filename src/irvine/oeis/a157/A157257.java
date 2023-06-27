package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157257 Positive numbers y such that y^2 is of the form x^2+(x+41)^2 with integer x.
 * @author Sean A. Irvine
 */
public class A157257 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157257() {
    super(1, new long[] {-1, 0, 0, 6, 0, 0}, new long[] {29, 41, 85, 89, 205, 481});
  }
}
