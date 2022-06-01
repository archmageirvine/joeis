package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158131 121n + 1.
 * @author Sean A. Irvine
 */
public class A158131 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158131() {
    super(new long[] {-1, 2}, new long[] {122, 243});
  }
}
