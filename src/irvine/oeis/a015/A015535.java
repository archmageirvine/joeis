package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015535 Expansion of <code>x/(1 - 5*x - 2*x^2)</code>.
 * @author Sean A. Irvine
 */
public class A015535 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015535() {
    super(new long[] {2, 5}, new long[] {0, 1});
  }
}
