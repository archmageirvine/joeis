package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199771.
 * @author Sean A. Irvine
 */
public class A199771 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199771() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {1, 5, 12, 26, 45, 75});
  }
}
