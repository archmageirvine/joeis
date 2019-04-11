package irvine.oeis.a185;

import irvine.oeis.LinearRecurrence;

/**
 * A185357 Expansion of <code>1/(1 - x - x^2 + x^18 - x^20)</code>.
 * @author Sean A. Irvine
 */
public class A185357 extends LinearRecurrence {

  /** Construct the sequence. */
  public A185357() {
    super(new long[] {1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1}, new long[] {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4180, 6763});
  }
}
