package irvine.oeis.a239;

import irvine.oeis.LinearRecurrence;

/**
 * A239568.
 * @author Sean A. Irvine
 */
public class A239568 extends LinearRecurrence {

  /** Construct the sequence. */
  public A239568() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 6, 27, 75, 165});
  }
}
