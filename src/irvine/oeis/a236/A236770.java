package irvine.oeis.a236;

import irvine.oeis.LinearRecurrence;

/**
 * A236770.
 * @author Sean A. Irvine
 */
public class A236770 extends LinearRecurrence {

  /** Construct the sequence. */
  public A236770() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 12, 51, 145});
  }
}
