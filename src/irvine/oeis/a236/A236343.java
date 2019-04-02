package irvine.oeis.a236;

import irvine.oeis.LinearRecurrence;

/**
 * A236343 Expansion of (1 - x + 2*x^2 - x^3) / ((1 - x)^2 * (1 - x^3)) in powers of x.
 * @author Sean A. Irvine
 */
public class A236343 extends LinearRecurrence {

  /** Construct the sequence. */
  public A236343() {
    super(new long[] {1, -2, 1, -1, 2}, new long[] {1, 1, 3, 5, 6});
  }
}
