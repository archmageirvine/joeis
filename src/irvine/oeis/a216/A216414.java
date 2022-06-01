package irvine.oeis.a216;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A216414 a(n) = (-1)^(n-3)*binomial(n,3) - 1.
 * @author Sean A. Irvine
 */
public class A216414 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216414() {
    super(new long[] {1, 3, 2, -2, -3}, new long[] {0, -5, 9, -21, 34});
  }
}
