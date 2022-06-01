package irvine.oeis.a257;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A257827 Positive integers whose square is the sum of 96 consecutive squares.
 * @author Sean A. Irvine
 */
public class A257827 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257827() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0}, new long[] {652, 724, 788, 1012, 1828, 2372, 2596, 2908, 6164, 6908, 7564, 9836, 17996, 23404, 25628, 28724});
  }
}
