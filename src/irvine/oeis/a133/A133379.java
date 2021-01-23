package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133379 Vector Markov with characteristic polynomial: 160264 + 80136 x - 49 x^2 - x^3.
 * @author Sean A. Irvine
 */
public class A133379 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133379() {
    super(new long[] {160264, 80136, -49}, new long[] {0, 1, 1});
  }
}
