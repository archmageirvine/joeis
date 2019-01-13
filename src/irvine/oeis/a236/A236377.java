package irvine.oeis.a236;

import irvine.oeis.LinearRecurrence;

/**
 * A236377.
 * @author Sean A. Irvine
 */
public class A236377 extends LinearRecurrence {

  /** Construct the sequence. */
  public A236377() {
    super(new long[] {-1, 3, -4, 4, -2, -2, 4, -4, 3}, new long[] {1, 1, 2, 10, 35, 59, 84, 132, 213});
  }
}
