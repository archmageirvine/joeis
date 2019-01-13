package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123943.
 * @author Sean A. Irvine
 */
public class A123943 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123943() {
    super(new long[] {1, 0, -6, 0, 8}, new long[] {0, 1, 5, 40, 315});
  }
}
