package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159589 Positive numbers y such that y^2 is of the form <code>x^2+(x+449)^2</code> with integer x.
 * @author Sean A. Irvine
 */
public class A159589 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159589() {
    super(new long[] {-1, 0, 0, 6, 0, 0}, new long[] {421, 449, 481, 2045, 2245, 2465});
  }
}
