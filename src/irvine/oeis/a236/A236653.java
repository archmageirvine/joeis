package irvine.oeis.a236;

import irvine.oeis.LinearRecurrence;

/**
 * A236653.
 * @author Sean A. Irvine
 */
public class A236653 extends LinearRecurrence {

  /** Construct the sequence. */
  public A236653() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 8, 10, 19});
  }
}
