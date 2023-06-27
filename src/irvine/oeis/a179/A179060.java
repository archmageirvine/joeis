package irvine.oeis.a179;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A179060 Number of non-attacking placements of 5 rooks on an n X n board.
 * @author Sean A. Irvine
 */
public class A179060 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179060() {
    super(1, new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {0, 0, 0, 0, 120, 4320, 52920, 376320, 1905120, 7620480, 25613280});
  }
}
