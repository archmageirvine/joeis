package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077882.
 * @author Sean A. Irvine
 */
public class A077882 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077882() {
    super(new long[] {-2, 1, 1, 1}, new long[] {0, 1, 1, 2});
  }
}
