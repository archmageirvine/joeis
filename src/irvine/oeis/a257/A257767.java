package irvine.oeis.a257;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A257767 Positive integers whose square is the sum of 33 consecutive squares.
 * @author Sean A. Irvine
 */
public class A257767 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257767() {
    super(1, new long[] {-1, 0, 0, 0, 0, 0, 46, 0, 0, 0, 0, 0}, new long[] {143, 253, 440, 1133, 1397, 3608, 6325, 11495, 20152, 52063, 64207, 165880});
  }
}
