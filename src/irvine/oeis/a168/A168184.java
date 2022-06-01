package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168184 Characteristic function of numbers that are not multiples of 10.
 * @author Sean A. Irvine
 */
public class A168184 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168184() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {0, 1, 1, 1, 1, 1, 1, 1, 1, 1});
  }
}
