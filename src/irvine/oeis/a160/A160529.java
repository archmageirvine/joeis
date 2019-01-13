package irvine.oeis.a160;

import irvine.oeis.LinearRecurrence;

/**
 * A160529.
 * @author Sean A. Irvine
 */
public class A160529 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160529() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {1, 5, 6, 25, 26});
  }
}
