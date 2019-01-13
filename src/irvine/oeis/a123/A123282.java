package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123282.
 * @author Sean A. Irvine
 */
public class A123282 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123282() {
    super(new long[] {-1, 208, -2718, 208}, new long[] {0, 16, 2744, 527280});
  }
}
