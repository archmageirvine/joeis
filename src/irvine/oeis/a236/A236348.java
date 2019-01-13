package irvine.oeis.a236;

import irvine.oeis.LinearRecurrence;

/**
 * A236348.
 * @author Sean A. Irvine
 */
public class A236348 extends LinearRecurrence {

  /** Construct the sequence. */
  public A236348() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 0, 2, 4});
  }
}
