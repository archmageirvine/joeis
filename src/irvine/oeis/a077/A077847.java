package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077847.
 * @author Sean A. Irvine
 */
public class A077847 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077847() {
    super(new long[] {2, -4, 0, 3}, new long[] {1, 3, 9, 23});
  }
}
