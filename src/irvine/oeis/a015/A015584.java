package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015584 Expansion of <code>x/(1 - 9*x - 8*x^2)</code>.
 * @author Sean A. Irvine
 */
public class A015584 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015584() {
    super(new long[] {8, 9}, new long[] {0, 1});
  }
}
