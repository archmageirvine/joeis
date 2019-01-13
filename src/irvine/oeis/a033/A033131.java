package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033131.
 * @author Sean A. Irvine
 */
public class A033131 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033131() {
    super(new long[] {-4, 1, 0, 4}, new long[] {1, 5, 20, 81});
  }
}
