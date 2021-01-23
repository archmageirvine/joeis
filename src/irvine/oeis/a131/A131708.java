package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131708 A024494 prefixed by a 0.
 * @author Sean A. Irvine
 */
public class A131708 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131708() {
    super(new long[] {2, -3, 3}, new long[] {0, 1, 2});
  }
}
