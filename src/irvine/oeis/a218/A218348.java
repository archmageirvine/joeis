package irvine.oeis.a218;

import irvine.oeis.LinearRecurrence;

/**
 * A218348 Hilltop maps: number of <code>n X 2</code> binary arrays indicating the locations of corresponding elements not exceeded by any horizontal or vertical neighbor in a random <code>0..1 nX2</code> array.
 * @author Sean A. Irvine
 */
public class A218348 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218348() {
    super(new long[] {-1, -1, 2, 2, 3}, new long[] {3, 11, 41, 149, 547});
  }
}
