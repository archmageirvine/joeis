package irvine.oeis.a200;

import irvine.oeis.LinearRecurrence;

/**
 * A200442.
 * @author Sean A. Irvine
 */
public class A200442 extends LinearRecurrence {

  /** Construct the sequence. */
  public A200442() {
    super(new long[] {-1, 31}, new long[] {1, 31});
  }
}
