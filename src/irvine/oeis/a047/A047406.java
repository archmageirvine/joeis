package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047406.
 * @author Sean A. Irvine
 */
public class A047406 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047406() {
    super(new long[] {-1, 1, 1}, new long[] {4, 6, 12});
  }
}
