package irvine.oeis.a288;

import irvine.oeis.LinearRecurrence;

/**
 * A288732.
 * @author Sean A. Irvine
 */
public class A288732 extends LinearRecurrence {

  /** Construct the sequence. */
  public A288732() {
    super(new long[] {-2, 2, 0, 0, 1}, new long[] {2, 4, 6, 8, 10});
  }
}
