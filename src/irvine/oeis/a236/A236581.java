package irvine.oeis.a236;

import irvine.oeis.LinearRecurrence;

/**
 * A236581.
 * @author Sean A. Irvine
 */
public class A236581 extends LinearRecurrence {

  /** Construct the sequence. */
  public A236581() {
    super(new long[] {-1, 4, -6, 8}, new long[] {1, 5, 37, 269});
  }
}
