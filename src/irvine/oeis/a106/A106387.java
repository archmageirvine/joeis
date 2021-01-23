package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106387 Numbers j such that 6j^2 + 6j + 1 = 11k.
 * @author Sean A. Irvine
 */
public class A106387 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106387() {
    super(new long[] {-1, 1, 1}, new long[] {4, 6, 15});
  }
}
