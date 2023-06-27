package irvine.oeis.a257;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A257824 Positive integers whose square is the sum of 73 consecutive squares.
 * @author Sean A. Irvine
 */
public class A257824 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257824() {
    super(1, new long[] {-1, 0, 0, 0, 4562498, 0, 0, 0}, new long[] {4088, 23360, 1582640, 9047912, 18642443912L, 106578370640L, 7220791811360L, 41281080400088L});
  }
}
