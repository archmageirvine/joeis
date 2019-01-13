package irvine.oeis.a237;

import irvine.oeis.LinearRecurrence;

/**
 * A237262.
 * @author Sean A. Irvine
 */
public class A237262 extends LinearRecurrence {

  /** Construct the sequence. */
  public A237262() {
    super(new long[] {-1, 0, 8, 0}, new long[] {1, 2, 6, 15});
  }
}
