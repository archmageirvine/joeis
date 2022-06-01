package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168182 Characteristic function of numbers that are not multiples of 9.
 * @author Sean A. Irvine
 */
public class A168182 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168182() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {0, 1, 1, 1, 1, 1, 1, 1, 1});
  }
}
