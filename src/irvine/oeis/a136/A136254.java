package irvine.oeis.a136;

import irvine.oeis.LinearRecurrence;

/**
 * A136254.
 * @author Sean A. Irvine
 */
public class A136254 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136254() {
    super(new long[] {-1, 4, -6, 4}, new long[] {4, 6, 8, 12});
  }
}
