package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077894.
 * @author Sean A. Irvine
 */
public class A077894 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077894() {
    super(new long[] {1, 1, -2, 1}, new long[] {1, 1, -1, -2});
  }
}
