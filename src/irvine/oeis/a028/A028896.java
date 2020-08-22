package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028896 6 times triangular numbers: a(n) = 3*n*(n+1).
 * @author Sean A. Irvine
 */
public class A028896 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028896() {
    super(new long[] {1, -3, 3}, new long[] {0, 6, 18});
  }
}
