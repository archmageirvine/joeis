package irvine.oeis.a236;

import irvine.oeis.LinearRecurrence;

/**
 * A236428.
 * @author Sean A. Irvine
 */
public class A236428 extends LinearRecurrence {

  /** Construct the sequence. */
  public A236428() {
    super(new long[] {-1, 2, 2}, new long[] {1, 1, 5});
  }
}
