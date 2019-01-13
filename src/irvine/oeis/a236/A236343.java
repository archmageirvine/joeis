package irvine.oeis.a236;

import irvine.oeis.LinearRecurrence;

/**
 * A236343.
 * @author Sean A. Irvine
 */
public class A236343 extends LinearRecurrence {

  /** Construct the sequence. */
  public A236343() {
    super(new long[] {1, -2, 1, -1, 2}, new long[] {1, 1, 3, 5, 6});
  }
}
