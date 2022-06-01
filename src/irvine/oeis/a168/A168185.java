package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168185 Characteristic function of numbers that are not multiples of 12.
 * @author Sean A. Irvine
 */
public class A168185 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168185() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1});
  }
}
