package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015553 Expansion of <code>x/(1 - 6*x - 11*x^2)</code>.
 * @author Sean A. Irvine
 */
public class A015553 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015553() {
    super(new long[] {11, 6}, new long[] {0, 1});
  }
}
