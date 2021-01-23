package irvine.oeis.a105;

import irvine.oeis.LinearRecurrence;

/**
 * A105450 a(n) = binomial(n+5,6) + binomial(n+3,3) + binomial(n+2,3) + binomial(n-1,1).
 * @author Sean A. Irvine
 */
public class A105450 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105450() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 6, 22, 60, 142, 305, 607});
  }
}
