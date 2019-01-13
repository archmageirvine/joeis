package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047429.
 * @author Sean A. Irvine
 */
public class A047429 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047429() {
    super(new long[] {-1, 1, 0, 1}, new long[] {4, 5, 6, 12});
  }
}
