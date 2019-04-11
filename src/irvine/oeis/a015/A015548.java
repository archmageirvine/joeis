package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015548 Expansion of <code>x/(1 - 5*x - 12*x^2)</code>.
 * @author Sean A. Irvine
 */
public class A015548 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015548() {
    super(new long[] {12, 5}, new long[] {0, 1});
  }
}
