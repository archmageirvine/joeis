package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015589 Expansion of <code>x/(1 - 10*x - 7*x^2)</code>.
 * @author Sean A. Irvine
 */
public class A015589 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015589() {
    super(new long[] {7, 10}, new long[] {0, 1});
  }
}
