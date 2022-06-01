package irvine.oeis.a279;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A279319 Period 16 zigzag sequence: repeat [0,1,2,3,4,5,6,7,8,7,6,5,4,3,2,1].
 * @author Sean A. Irvine
 */
public class A279319 extends LinearRecurrence {

  /** Construct the sequence. */
  public A279319() {
    super(new long[] {1, -1, 0, 0, 0, 0, 0, 0, 1}, new long[] {0, 1, 2, 3, 4, 5, 6, 7, 8});
  }
}
