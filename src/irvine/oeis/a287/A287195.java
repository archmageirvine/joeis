package irvine.oeis.a287;

import irvine.oeis.LinearRecurrence;

/**
 * A287195.
 * @author Sean A. Irvine
 */
public class A287195 extends LinearRecurrence {

  /** Construct the sequence. */
  public A287195() {
    super(new long[] {1, -1, 0, -2, 2, 0, 1}, new long[] {1, 3, 3, 5, 9, 9, 12});
  }
}
