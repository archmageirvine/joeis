package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134172.
 * @author Sean A. Irvine
 */
public class A134172 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134172() {
    super(new long[] {-1, 2, -3, 4, -3, 2}, new long[] {0, 0, 1, 2, 1, 1});
  }
}
