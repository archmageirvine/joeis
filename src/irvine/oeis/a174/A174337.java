package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174337.
 * @author Sean A. Irvine
 */
public class A174337 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174337() {
    super(new long[] {1, -3, 3}, new long[] {0, 94, 376});
  }
}
