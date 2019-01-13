package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176640.
 * @author Sean A. Irvine
 */
public class A176640 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176640() {
    super(new long[] {-8, 12, 6, -15, 3, 3}, new long[] {0, 1, 5, 14, 46, 111});
  }
}
