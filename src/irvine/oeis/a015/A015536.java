package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015536 Expansion of <code>x/(1-5*x-3*x^2)</code>.
 * @author Sean A. Irvine
 */
public class A015536 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015536() {
    super(new long[] {3, 5}, new long[] {0, 1});
  }
}
