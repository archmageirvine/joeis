package irvine.oeis.a179;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A179062 Number of non-attacking placements of 7 rooks on an n X n board.
 * @author Sean A. Irvine
 */
public class A179062 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179062() {
    super(1, new long[] {1, -15, 105, -455, 1365, -3003, 5005, -6435, 6435, -5005, 3003, -1365, 455, -105, 15}, new long[] {0, 0, 0, 0, 0, 0, 5040, 322560, 6531840, 72576000, 548856000, 3161410560L, 14841066240L, 59364264960L, 208702494000L});
  }
}
