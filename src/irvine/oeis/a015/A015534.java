package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015534 Expansion of <code>x/(1 - 4*x - 11*x^2)</code>.
 * @author Sean A. Irvine
 */
public class A015534 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015534() {
    super(new long[] {11, 4}, new long[] {0, 1});
  }
}
