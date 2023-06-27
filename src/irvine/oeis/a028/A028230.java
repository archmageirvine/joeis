package irvine.oeis.a028;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A028230 Bisection of A001353. Indices of square numbers which are also octagonal.
 * @author Sean A. Irvine
 */
public class A028230 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028230() {
    super(1, new long[] {-1, 14}, new long[] {1, 15});
  }
}
