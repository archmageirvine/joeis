package irvine.oeis.a288;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A288959 a(n) = n^2*(n^2 - 1)^2/2.
 * @author Sean A. Irvine
 */
public class A288959 extends LinearRecurrence {

  /** Construct the sequence. */
  public A288959() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 18, 288, 1800, 7200, 22050, 56448});
  }
}
