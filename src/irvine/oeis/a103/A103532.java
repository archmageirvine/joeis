package irvine.oeis.a103;

import irvine.oeis.LinearRecurrence;

/**
 * A103532 Number of divisors of 240^n.
 * @author Sean A. Irvine
 */
public class A103532 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103532() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 20, 81, 208});
  }
}
