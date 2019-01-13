package irvine.oeis.a236;

import irvine.oeis.LinearRecurrence;

/**
 * A236398.
 * @author Sean A. Irvine
 */
public class A236398 extends LinearRecurrence {

  /** Construct the sequence. */
  public A236398() {
    super(new long[] {1, 0, 0, 0}, new long[] {1, 1, 2, 1});
  }
}
