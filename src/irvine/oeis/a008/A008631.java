package irvine.oeis.a008;

import irvine.oeis.LinearRecurrence;

/**
 * A008631 Molien series for alternating group Alt_8 (or A_8).
 * @author Sean A. Irvine
 */
public class A008631 extends LinearRecurrence {

  /** Construct the sequence. */
  public A008631() {
    super(new long[] {-1, 1, 1, 0, 1, -2, -1, -1, -1, 1, 1, 2, 3, 0, -1, -1, -4, -1, -1, 0, 3, 2, 1, 1, -1, -1, -1, -2, 1, 0, 1, 1},
      new long[] {1, 1, 2, 3, 5, 7, 11, 15, 22, 29, 40, 52, 70, 89, 116, 146, 186, 230, 288, 352, 434, 525, 638, 764, 919, 1090, 1297, 1527, 1802, 2105, 2464, 2860});
  }
}

