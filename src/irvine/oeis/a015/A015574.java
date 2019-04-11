package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015574 Expansion of <code>x/(1 - 8*x - 3*x^2)</code>.
 * @author Sean A. Irvine
 */
public class A015574 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015574() {
    super(new long[] {3, 8}, new long[] {0, 1});
  }
}
