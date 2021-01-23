package irvine.oeis.a245;

import irvine.oeis.LinearRecurrence;

/**
 * A245766 a(n) = 2*(n^2 + 1) - n*(1 + (-1)^n).
 * @author Sean A. Irvine
 */
public class A245766 extends LinearRecurrence {

  /** Construct the sequence. */
  public A245766() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {2, 4, 6, 20, 26});
  }
}
