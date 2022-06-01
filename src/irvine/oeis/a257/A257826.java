package irvine.oeis.a257;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A257826 Positive integers whose square is the sum of 88 consecutive squares.
 * @author Sean A. Irvine
 */
public class A257826 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257826() {
    super(new long[] {-1, 0, 0, 0, 394, 0, 0, 0}, new long[] {2222, 2530, 39358, 55990, 872938, 994598, 15506810, 22059818});
  }
}
