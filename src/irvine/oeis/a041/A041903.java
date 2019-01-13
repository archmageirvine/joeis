package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041903.
 * @author Sean A. Irvine
 */
public class A041903 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041903() {
    super(new long[] {-1, 0, 0, 0, 174, 0, 0, 0}, new long[] {1, 1, 3, 4, 171, 175, 521, 696});
  }
}
