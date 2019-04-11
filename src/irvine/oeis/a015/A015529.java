package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015529 Expansion of <code>x/(1 - 3*x - 11*x^2)</code>.
 * @author Sean A. Irvine
 */
public class A015529 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015529() {
    super(new long[] {11, 3}, new long[] {0, 1});
  }
}
