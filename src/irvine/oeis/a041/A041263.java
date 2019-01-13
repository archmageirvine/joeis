package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041263.
 * @author Sean A. Irvine
 */
public class A041263 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041263() {
    super(new long[] {-1, 0, 24, 0}, new long[] {1, 1, 23, 24});
  }
}
