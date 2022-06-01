package irvine.oeis.a070;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A070876 Binary expansion is 1xx100...0 where xx = 00 or 11.
 * @author Sean A. Irvine
 */
public class A070876 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070876() {
    super(new long[] {2, 0}, new long[] {9, 15});
  }
}
