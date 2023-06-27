package irvine.oeis.a159;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A159466 Positive numbers y such that y^2 is of the form x^2 + (x+127)^2 with integer x.
 * @author Sean A. Irvine
 */
public class A159466 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159466() {
    super(1, new long[] {-1, 0, 0, 6, 0, 0}, new long[] {113, 127, 145, 533, 635, 757});
  }
}
