package irvine.oeis.a236;

import irvine.oeis.LinearRecurrence;

/**
 * A236165.
 * @author Sean A. Irvine
 */
public class A236165 extends LinearRecurrence {

  /** Construct the sequence. */
  public A236165() {
    super(new long[] {1, 1, 0, 1}, new long[] {1, 1, 0, 0});
  }
}
