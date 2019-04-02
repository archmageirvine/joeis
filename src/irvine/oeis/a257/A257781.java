package irvine.oeis.a257;

import irvine.oeis.LinearRecurrence;

/**
 * A257781 Positive integers whose square is the sum of 50 consecutive squares.
 * @author Sean A. Irvine
 */
public class A257781 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257781() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0}, new long[] {245, 385, 495, 655, 795, 1055, 1365, 2205, 2855, 3795, 4615, 6135});
  }
}
