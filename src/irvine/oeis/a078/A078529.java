package irvine.oeis.a078;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A078529 Exponent sequence for a bilinear recursive sequence.
 * @author Sean A. Irvine
 */
public class A078529 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078529() {
    super(new long[] {1, -2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 2}, new long[] {3, 1, 0, 0, 0, 0, 0, 1, 2, 3, 4, 6, 9, 10});
  }
}
