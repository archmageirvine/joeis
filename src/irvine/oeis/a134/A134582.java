package irvine.oeis.a134;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A134582 a(n) = (2*n)^2 - 4.
 * @author Sean A. Irvine
 */
public class A134582 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134582() {
    super(new long[] {1, -3, 3}, new long[] {0, 12, 32});
  }
}
