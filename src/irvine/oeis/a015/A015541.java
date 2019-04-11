package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015541 Expansion of <code>x/(1 - 5*x - 7*x^2)</code>.
 * @author Sean A. Irvine
 */
public class A015541 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015541() {
    super(new long[] {7, 5}, new long[] {0, 1});
  }
}
