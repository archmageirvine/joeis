package irvine.oeis.a257;

import irvine.oeis.LinearRecurrence;

/**
 * A257765 Positive integers whose square is the sum of 26 consecutive squares.
 * @author Sean A. Irvine
 */
public class A257765 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257765() {
    super(new long[] {-1, 0, 0, 102, 0, 0}, new long[] {195, 1599, 2379, 19695, 163059, 242619});
  }
}
