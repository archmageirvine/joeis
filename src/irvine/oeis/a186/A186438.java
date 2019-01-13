package irvine.oeis.a186;

import irvine.oeis.LinearRecurrence;

/**
 * A186438.
 * @author Sean A. Irvine
 */
public class A186438 extends LinearRecurrence {

  /** Construct the sequence. */
  public A186438() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 1}, new long[] {10, 12, 20, 30, 38, 40, 50, 60});
  }
}
