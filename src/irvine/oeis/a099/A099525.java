package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099525 Expansion of 1/(1-2x-3x^3).
 * @author Sean A. Irvine
 */
public class A099525 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099525() {
    super(new long[] {3, 0, 2}, new long[] {1, 2, 4});
  }
}
