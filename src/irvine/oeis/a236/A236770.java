package irvine.oeis.a236;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A236770 a(n) = n*(n + 1)*(3*n^2 + 3*n - 2)/8.
 * @author Sean A. Irvine
 */
public class A236770 extends LinearRecurrence {

  /** Construct the sequence. */
  public A236770() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 12, 51, 145});
  }
}
