package irvine.oeis.a108;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A108014 Expansion of (x^2-2*x)/(x^4-x^2+2*x-1).
 * @author Sean A. Irvine
 */
public class A108014 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108014() {
    super(new long[] {1, 0, -1, 2}, new long[] {0, 2, 3, 4});
  }
}
