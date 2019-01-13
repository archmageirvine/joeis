package irvine.oeis.a288;

import irvine.oeis.LinearRecurrence;

/**
 * A288176.
 * @author Sean A. Irvine
 */
public class A288176 extends LinearRecurrence {

  /** Construct the sequence. */
  public A288176() {
    super(new long[] {1, -4, 2, 2}, new long[] {2, 4, 8, 16});
  }
}
