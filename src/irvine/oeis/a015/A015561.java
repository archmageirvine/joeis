package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015561 Expansion of <code>x/(1 - 7*x - 4*x^2)</code>.
 * @author Sean A. Irvine
 */
public class A015561 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015561() {
    super(new long[] {4, 7}, new long[] {0, 1});
  }
}
