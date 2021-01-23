package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174902 Denominator of 1 - 1/n^2, using 0 at the pole where n=0.
 * @author Sean A. Irvine
 */
public class A174902 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174902() {
    super(new long[] {1, -3, 3}, new long[] {1, 0, 1});
  }
}
