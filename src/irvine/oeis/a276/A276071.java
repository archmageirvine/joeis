package irvine.oeis.a276;

import irvine.oeis.LinearRecurrence;

/**
 * A276071.
 * @author Sean A. Irvine
 */
public class A276071 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276071() {
    super(new long[] {1, 0, 0, 0, -5, 0, 0, 0, 10, 0, 0, 0, -10, 0, 0, 0, 5, 0, 0, 0}, new long[] {0, 0, 0, 0, 1, 1, 1, 1, 8, 4, 16, 2, 27, 9, 81, 3, 64, 16, 256, 4});
  }
}
