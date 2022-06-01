package irvine.oeis.a178;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A178351 Number of collinear point 5-tuples in a 7 X 7 X 7 X ... n-dimensional cubic grid.
 * @author Sean A. Irvine
 */
public class A178351 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178351() {
    super(new long[] {-9009, 3800, -590, 40}, new long[] {0, 21, 364, 4833});
  }
}
