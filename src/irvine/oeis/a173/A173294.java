package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173294 Values of 16*n^2+24*n+7, n&gt;=0, each duplicated.
 * @author Sean A. Irvine
 */
public class A173294 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173294() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {7, 7, 47, 47, 119});
  }
}
