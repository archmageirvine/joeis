package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158874.
 * @author Sean A. Irvine
 */
public class A158874 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158874() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 24, 144, 504, 1344, 3024});
  }
}
