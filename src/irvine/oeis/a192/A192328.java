package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192328.
 * @author Sean A. Irvine
 */
public class A192328 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192328() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {27, 147, 507, 867, 1587});
  }
}
