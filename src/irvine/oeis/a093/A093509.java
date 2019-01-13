package irvine.oeis.a093;

import irvine.oeis.LinearRecurrence;

/**
 * A093509.
 * @author Sean A. Irvine
 */
public class A093509 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093509() {
    super(new long[] {-1, 2, -2, 2, -2, 2, -2, 2, -2, 2}, new long[] {0, 5, 6, 10, 12, 15, 18, 20, 24, 25});
  }
}
