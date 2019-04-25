package irvine.oeis.a160;

import irvine.oeis.LinearRecurrence;

/**
 * A160583 Positive numbers y such that <code>y^2</code> is of the form <code>x^2+(x+521)^2</code> with integer x.
 * @author Sean A. Irvine
 */
public class A160583 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160583() {
    super(new long[] {-1, 0, 0, 6, 0, 0}, new long[] {445, 521, 629, 2041, 2605, 3329});
  }
}
