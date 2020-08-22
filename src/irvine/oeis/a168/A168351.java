package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168351 a(n) = n^5*(n+1)/2.
 * @author Sean A. Irvine
 */
public class A168351 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168351() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 1, 48, 486, 2560, 9375, 27216});
  }
}
