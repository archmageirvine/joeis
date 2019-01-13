package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070399.
 * @author Sean A. Irvine
 */
public class A070399 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070399() {
    super(new long[] {1, -1, 0, 1}, new long[] {1, 6, 5, 30});
  }
}
