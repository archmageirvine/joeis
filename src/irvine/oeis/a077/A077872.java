package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077872.
 * @author Sean A. Irvine
 */
public class A077872 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077872() {
    super(new long[] {1, 0, -2, 2}, new long[] {1, 2, 2, 0});
  }
}
