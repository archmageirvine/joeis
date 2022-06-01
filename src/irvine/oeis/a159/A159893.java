package irvine.oeis.a159;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A159893 Positive numbers y such that y^2 is of the form x^2+(x+727)^2 with integer x.
 * @author Sean A. Irvine
 */
public class A159893 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159893() {
    super(new long[] {-1, 0, 0, 6, 0, 0}, new long[] {677, 727, 785, 3277, 3635, 4033});
  }
}
