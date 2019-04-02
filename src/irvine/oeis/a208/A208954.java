package irvine.oeis.a208;

import irvine.oeis.LinearRecurrence;

/**
 * A208954 n^4*(n-1)*(n+1)/12.
 * @author Sean A. Irvine
 */
public class A208954 extends LinearRecurrence {

  /** Construct the sequence. */
  public A208954() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 4, 54, 320, 1250, 3780, 9604});
  }
}
