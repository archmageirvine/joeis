package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015568 Expansion of <code>x/(1 - 7*x - 10*x^2)</code>.
 * @author Sean A. Irvine
 */
public class A015568 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015568() {
    super(new long[] {10, 7}, new long[] {0, 1});
  }
}
