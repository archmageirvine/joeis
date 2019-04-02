package irvine.oeis.a091;

import irvine.oeis.LinearRecurrence;

/**
 * A091650 Let M = the 4 X 4 matrix [0 1 0 0 / 0 0 1 0 / 0 0 0 1 / -1 -1 3 2]. Set seed vector = [1 1 1 1] = first row, then take M*[1 1 1 1] = [1 1 1 3] then M * [1 1 1 3], etc. Sequence gives terms in rightmost column.
 * @author Sean A. Irvine
 */
public class A091650 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091650() {
    super(new long[] {-1, -1, 3, 2}, new long[] {1, 3, 7, 21});
  }
}
