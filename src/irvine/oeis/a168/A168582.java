package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168582.
 * @author Sean A. Irvine
 */
public class A168582 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168582() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {1, 1, 3, 7, 17});
  }
}
