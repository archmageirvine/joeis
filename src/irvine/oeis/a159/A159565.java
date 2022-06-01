package irvine.oeis.a159;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A159565 Positive numbers y such that y^2 is of the form x^2+(x+241)^2 with integer x.
 * @author Sean A. Irvine
 */
public class A159565 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159565() {
    super(new long[] {-1, 0, 0, 6, 0, 0}, new long[] {221, 241, 265, 1061, 1205, 1369});
  }
}
