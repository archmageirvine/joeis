package irvine.oeis.a187;

import irvine.oeis.LinearRecurrence;

/**
 * A187065.
 * @author Sean A. Irvine
 */
public class A187065 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187065() {
    super(new long[] {-1, 0, 2, 0, 1, 0}, new long[] {0, 0, 1, 0, 0, 1});
  }
}
