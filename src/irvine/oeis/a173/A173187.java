package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173187 <code>a(n) = binomial(n + 3, 3)*9^n</code>.
 * @author Sean A. Irvine
 */
public class A173187 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173187() {
    super(new long[] {-6561, 2916, -486, 36}, new long[] {1, 36, 810, 14580});
  }
}
