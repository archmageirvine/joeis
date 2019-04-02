package irvine.oeis.a175;

import irvine.oeis.LinearRecurrence;

/**
 * A175485 Numerators of averages of squares of the first n positive integers.
 * @author Sean A. Irvine
 */
public class A175485 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175485() {
    super(new long[] {1, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0}, new long[] {1, 5, 14, 15, 11, 91, 20, 51, 95, 77, 46, 325, 63, 145, 248, 187, 105, 703});
  }
}
