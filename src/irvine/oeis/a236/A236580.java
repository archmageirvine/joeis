package irvine.oeis.a236;

import irvine.oeis.LinearRecurrence;

/**
 * A236580.
 * @author Sean A. Irvine
 */
public class A236580 extends LinearRecurrence {

  /** Construct the sequence. */
  public A236580() {
    super(new long[] {-1, 4, -6, 7}, new long[] {1, 4, 25, 154});
  }
}
