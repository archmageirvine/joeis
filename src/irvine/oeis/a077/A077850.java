package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077850.
 * @author Sean A. Irvine
 */
public class A077850 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077850() {
    super(new long[] {1, -2, -1, 3}, new long[] {1, 3, 8, 19});
  }
}
