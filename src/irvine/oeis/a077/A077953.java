package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077953.
 * @author Sean A. Irvine
 */
public class A077953 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077953() {
    super(new long[] {2, -2, 1}, new long[] {1, 1, -1});
  }
}
