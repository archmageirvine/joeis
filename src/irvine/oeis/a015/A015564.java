package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015564 Expansion of <code>x/(1 - 7*x - 6*x^2)</code>.
 * @author Sean A. Irvine
 */
public class A015564 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015564() {
    super(new long[] {6, 7}, new long[] {0, 1});
  }
}
