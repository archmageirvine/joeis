package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015566 Expansion of <code>x/(1 - 7*x - 9*x^2)</code>.
 * @author Sean A. Irvine
 */
public class A015566 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015566() {
    super(new long[] {9, 7}, new long[] {0, 1});
  }
}
