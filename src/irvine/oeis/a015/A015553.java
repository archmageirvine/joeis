package irvine.oeis.a015;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A015553 Expansion of x/(1 - 6*x - 11*x^2).
 * @author Sean A. Irvine
 */
public class A015553 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015553() {
    super(new long[] {11, 6}, new long[] {0, 1});
  }
}
