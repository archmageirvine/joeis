package irvine.oeis.a023;

import irvine.oeis.LinearRecurrence;

/**
 * A023458 n-16.
 * @author Sean A. Irvine
 */
public class A023458 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023458() {
    super(new long[] {-1, 2}, new long[] {-16, -15});
  }
}
