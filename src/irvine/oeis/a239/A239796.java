package irvine.oeis.a239;

import irvine.oeis.LinearRecurrence;

/**
 * A239796.
 * @author Sean A. Irvine
 */
public class A239796 extends LinearRecurrence {

  /** Construct the sequence. */
  public A239796() {
    super(new long[] {1, -3, 3}, new long[] {-6, 17, 54});
  }
}
