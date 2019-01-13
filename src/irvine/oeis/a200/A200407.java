package irvine.oeis.a200;

import irvine.oeis.LinearRecurrence;

/**
 * A200407.
 * @author Sean A. Irvine
 */
public class A200407 extends LinearRecurrence {

  /** Construct the sequence. */
  public A200407() {
    super(new long[] {-1, 0, 0, 340, 0, 0}, new long[] {1, 9, 131, 209, 3051, 44539});
  }
}
