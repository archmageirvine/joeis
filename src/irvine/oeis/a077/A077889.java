package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077889.
 * @author Sean A. Irvine
 */
public class A077889 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077889() {
    super(new long[] {1, 0, -1, 1}, new long[] {1, 1, 0, -1});
  }
}
