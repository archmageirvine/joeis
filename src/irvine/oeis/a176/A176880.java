package irvine.oeis.a176;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A176880 Expansion of 1/(1 - 3*x + x^2 - 2*x^3 + 2*x^4).
 * @author Sean A. Irvine
 */
public class A176880 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176880() {
    super(new long[] {-2, 2, -1, 3}, new long[] {1, 3, 8, 23});
  }
}
