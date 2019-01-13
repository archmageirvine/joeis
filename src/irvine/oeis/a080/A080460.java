package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080460.
 * @author Sean A. Irvine
 */
public class A080460 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080460() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {2, 2, 6, 10, 14});
  }
}
