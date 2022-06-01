package irvine.oeis.a129;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A129704 Expansion of 1/(x^5 - 2*x^4 + x^3 - 2*x^2 + x - 1).
 * @author Sean A. Irvine
 */
public class A129704 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129704() {
    super(new long[] {1, -2, 1, -2, 1}, new long[] {-1, -1, 1, 2, 1});
  }
}
