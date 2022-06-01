package irvine.oeis.a257;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A257823 Positive integers whose square is the sum of 59 consecutive squares.
 * @author Sean A. Irvine
 */
public class A257823 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257823() {
    super(new long[] {-1, 0, 0, 0, 1060, 0, 0, 0}, new long[] {413, 531, 8673, 11269, 426511, 554187, 9192849, 11944727});
  }
}
