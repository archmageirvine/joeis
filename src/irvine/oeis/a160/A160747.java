package irvine.oeis.a160;

import irvine.oeis.LinearRecurrence;

/**
 * A160747.
 * @author Sean A. Irvine
 */
public class A160747 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160747() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 15, 85, 295, 771});
  }
}
