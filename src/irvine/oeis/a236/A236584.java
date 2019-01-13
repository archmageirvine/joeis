package irvine.oeis.a236;

import irvine.oeis.LinearRecurrence;

/**
 * A236584.
 * @author Sean A. Irvine
 */
public class A236584 extends LinearRecurrence {

  /** Construct the sequence. */
  public A236584() {
    super(new long[] {-2, 4, -1, 2}, new long[] {1, 1, 1, 5});
  }
}
