package irvine.oeis.a236;

import irvine.oeis.LinearRecurrence;

/**
 * A236267.
 * @author Sean A. Irvine
 */
public class A236267 extends LinearRecurrence {

  /** Construct the sequence. */
  public A236267() {
    super(new long[] {1, -3, 3}, new long[] {1, 12, 39});
  }
}
