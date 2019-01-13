package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022311.
 * @author Sean A. Irvine
 */
public class A022311 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022311() {
    super(new long[] {-1, 0, 2}, new long[] {0, 6, 7});
  }
}
