package irvine.oeis.a236;

import irvine.oeis.LinearRecurrence;

/**
 * A236337.
 * @author Sean A. Irvine
 */
public class A236337 extends LinearRecurrence {

  /** Construct the sequence. */
  public A236337() {
    super(new long[] {1, -2, 1, -1, 2}, new long[] {2, 3, 4, 7, 9});
  }
}
