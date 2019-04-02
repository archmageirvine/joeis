package irvine.oeis.a257;

import irvine.oeis.LinearRecurrence;

/**
 * A257761 Positive integers whose square is the sum of 23 consecutive squares.
 * @author Sean A. Irvine
 */
public class A257761 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257761() {
    super(new long[] {-1, 0, 48, 0}, new long[] {92, 138, 4278, 6532});
  }
}
