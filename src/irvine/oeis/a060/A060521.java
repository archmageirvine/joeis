package irvine.oeis.a060;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A060521 Number of 3 X n grids of black and white cells, no 3 of same color vertically or horizontally contiguous.
 * @author Sean A. Irvine
 */
public class A060521 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060521() {
    super(new long[] {-1, 0, 5, 2}, new long[] {6, 36, 102, 378});
  }
}
