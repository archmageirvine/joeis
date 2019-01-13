package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047519.
 * @author Sean A. Irvine
 */
public class A047519 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047519() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 1}, new long[] {1, 2, 3, 4, 6, 7, 9});
  }
}
