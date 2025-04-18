package irvine.oeis.a236;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A236267 a(n) = 8*n^2 + 3*n + 1.
 * @author Sean A. Irvine
 */
public class A236267 extends LinearRecurrence {

  /** Construct the sequence. */
  public A236267() {
    super(new long[] {1, -3, 3}, new long[] {1, 12, 39});
  }
}
