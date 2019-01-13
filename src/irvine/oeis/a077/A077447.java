package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077447.
 * @author Sean A. Irvine
 */
public class A077447 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077447() {
    super(new long[] {-1, 0, 6, 0}, new long[] {4, 8, 16, 44});
  }
}
