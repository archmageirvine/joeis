package irvine.oeis.a238;

import irvine.oeis.LinearRecurrence;

/**
 * A238538.
 * @author Sean A. Irvine
 */
public class A238538 extends LinearRecurrence {

  /** Construct the sequence. */
  public A238538() {
    super(new long[] {-256, 432, -202, 27}, new long[] {1, 15, 219, 3315});
  }
}
