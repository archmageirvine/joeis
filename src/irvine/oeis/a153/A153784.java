package irvine.oeis.a153;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A153784 4 times heptagonal numbers: a(n) = 2*n*(5*n-3).
 * @author Sean A. Irvine
 */
public class A153784 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153784() {
    super(new long[] {1, -3, 3}, new long[] {0, 4, 28});
  }
}
