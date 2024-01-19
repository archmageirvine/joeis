package irvine.oeis.a067;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A067995 Minimal number of coins needed to pay exactly n cents using coins of sizes 1, 2, 3, 5, 10, 20, 25, 50, 100 cents (all historical U.S.A. coinage from 1 to 100 cents).
 * @author Sean A. Irvine
 */
public class A067995 extends LinearRecurrence {

  /** Construct the sequence. */
  public A067995() {
    super(1, new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
      new long[] {1, 1, 1, 2, 1, 2, 2, 2, 3, 1, 2, 2, 2, 3, 2, 3, 3, 3, 4, 1, 2, 2, 2, 3, 1, 2, 2, 2, 3, 2, 3, 3, 3, 4, 2, 3, 3, 3, 4, 2, 3, 3, 3, 4, 2, 3, 3, 3, 4, 1, 2, 2, 2, 3, 2, 3, 3, 3, 4, 2, 3, 3, 3, 4, 3, 4, 4, 4, 5, 2, 3, 3, 3, 4, 2, 3, 3, 3, 4, 3, 4, 4, 4, 5, 3, 4, 4, 4, 5, 3, 4, 4, 4, 5, 3, 4, 4, 4, 5, 1, 2});
  }
}
