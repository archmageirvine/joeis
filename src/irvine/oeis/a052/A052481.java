package irvine.oeis.a052;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A052481 a(n) = 2^n*(binomial(n,2) + 1).
 * @author Sean A. Irvine
 */
public class A052481 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052481() {
    super(new long[] {8, -12, 6}, new long[] {1, 2, 8});
  }
}
