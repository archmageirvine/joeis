package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168181 Characteristic function of numbers that are not multiples of 8.
 * @author Sean A. Irvine
 */
public class A168181 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168181() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0}, new long[] {0, 1, 1, 1, 1, 1, 1, 1});
  }
}
