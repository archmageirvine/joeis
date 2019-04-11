package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158131 <code>121n + 1</code>.
 * @author Sean A. Irvine
 */
public class A158131 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158131() {
    super(new long[] {-1, 2}, new long[] {122, 243});
  }
}
