package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077814.
 * @author Sean A. Irvine
 */
public class A077814 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077814() {
    super(new long[] {-1, 2, -3, 4, -3, 2}, new long[] {0, 0, 1, 1, 0, 1});
  }
}
