package irvine.oeis.a036;

import irvine.oeis.LinearRecurrence;

/**
 * A036239.
 * @author Sean A. Irvine
 */
public class A036239 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036239() {
    super(new long[] {-24, 50, -35, 10}, new long[] {0, 2, 15, 80});
  }
}
