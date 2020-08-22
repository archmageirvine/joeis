package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054777 a(n) = 4*n*(4*n-1)*(4*n-2)*(4*n-3).
 * @author Sean A. Irvine
 */
public class A054777 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054777() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 24, 1680, 11880, 43680});
  }
}
