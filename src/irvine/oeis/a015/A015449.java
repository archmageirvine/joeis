package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015449 Expansion of <code>(1-4*x)/(1-5*x-x^2)</code>.
 * @author Sean A. Irvine
 */
public class A015449 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015449() {
    super(new long[] {1, 5}, new long[] {1, 1});
  }
}
