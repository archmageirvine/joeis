package irvine.oeis.a055;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A055504 n*(n-1)*(n-2)*(n-3)*(n-4)*(2*n-1)/72.
 * @author Sean A. Irvine
 */
public class A055504 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055504() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 0, 0, 0, 0, 15, 110});
  }
}
