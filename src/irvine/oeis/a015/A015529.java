package irvine.oeis.a015;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A015529 Expansion of x/(1 - 3*x - 11*x^2).
 * @author Sean A. Irvine
 */
public class A015529 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015529() {
    super(new long[] {11, 3}, new long[] {0, 1});
  }
}
