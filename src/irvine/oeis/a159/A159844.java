package irvine.oeis.a159;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A159844 Positive numbers y such that y^2 is of the form x^2+(x+359)^2 with integer x.
 * @author Sean A. Irvine
 */
public class A159844 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159844() {
    super(new long[] {-1, 0, 0, 6, 0, 0}, new long[] {325, 359, 401, 1549, 1795, 2081});
  }
}
