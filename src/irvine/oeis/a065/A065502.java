package irvine.oeis.a065;

import irvine.oeis.LinearRecurrence;

/**
 * A065502.
 * @author Sean A. Irvine
 */
public class A065502 extends LinearRecurrence {

  /** Construct the sequence. */
  public A065502() {
    super(new long[] {-1, 2, -2, 2, -2, 2}, new long[] {2, 4, 5, 6, 8, 10});
  }
}
