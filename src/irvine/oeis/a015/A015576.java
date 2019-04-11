package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015576 Expansion of <code>x/(1 - 8*x - 7*x^2)</code>.
 * @author Sean A. Irvine
 */
public class A015576 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015576() {
    super(new long[] {7, 8}, new long[] {0, 1});
  }
}
