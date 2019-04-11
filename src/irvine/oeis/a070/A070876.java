package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070876 Binary expansion is <code>1xx100</code>...0 where <code>xx = 00</code> or 11.
 * @author Sean A. Irvine
 */
public class A070876 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070876() {
    super(new long[] {2, 0}, new long[] {9, 15});
  }
}
