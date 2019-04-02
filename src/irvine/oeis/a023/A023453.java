package irvine.oeis.a023;

import irvine.oeis.LinearRecurrence;

/**
 * A023453 n-11.
 * @author Sean A. Irvine
 */
public class A023453 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023453() {
    super(new long[] {-1, 2}, new long[] {-11, -10});
  }
}
