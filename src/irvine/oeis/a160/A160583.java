package irvine.oeis.a160;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A160583 Positive numbers y such that y^2 is of the form x^2+(x+521)^2 with integer x.
 * @author Sean A. Irvine
 */
public class A160583 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160583() {
    super(new long[] {-1, 0, 0, 6, 0, 0}, new long[] {445, 521, 629, 2041, 2605, 3329});
  }
}
