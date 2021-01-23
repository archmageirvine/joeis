package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033505 Expansion of 1/(1 - 3*x - x^2 + x^3).
 * @author Sean A. Irvine
 */
public class A033505 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033505() {
    super(new long[] {-1, 1, 3}, new long[] {1, 3, 10});
  }
}
