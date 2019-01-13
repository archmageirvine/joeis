package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022322.
 * @author Sean A. Irvine
 */
public class A022322 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022322() {
    super(new long[] {-1, 0, 2}, new long[] {1, 8, 10});
  }
}
