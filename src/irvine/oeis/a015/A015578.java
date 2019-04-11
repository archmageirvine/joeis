package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015578 Expansion of <code>x/(1 - 8*x - 11*x^2)</code>.
 * @author Sean A. Irvine
 */
public class A015578 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015578() {
    super(new long[] {11, 8}, new long[] {0, 1});
  }
}
