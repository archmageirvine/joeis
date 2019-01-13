package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077984.
 * @author Sean A. Irvine
 */
public class A077984 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077984() {
    super(new long[] {-2, 2, -2}, new long[] {1, -2, 6});
  }
}
