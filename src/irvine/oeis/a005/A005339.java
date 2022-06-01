package irvine.oeis.a005;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A005339 Number of ways in which n identical balls can be distributed among 6 boxes in a row such that each pair of adjacent boxes contains at least 4 balls.
 * @author Sean A. Irvine
 */
public class A005339 extends LinearRecurrence {

  /** Construct the sequence. */
  public A005339() {
    super(new long[] {0, -1, 6, -15, 20, -15, 6}, new long[] {35, 154, 424, 930, 1775, 3080, 4985});
  }
}
