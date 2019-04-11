package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129113 Expansion of <code>x^3 / (1 - x - 5*x^2 - x^3 + x^4)</code>.
 * @author Sean A. Irvine
 */
public class A129113 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129113() {
    super(new long[] {-1, 1, 5, 1}, new long[] {0, 0, 0, 1});
  }
}
