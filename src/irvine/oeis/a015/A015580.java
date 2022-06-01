package irvine.oeis.a015;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A015580 Expansion of x/(1 - 9*x - 4*x^2).
 * @author Sean A. Irvine
 */
public class A015580 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015580() {
    super(new long[] {4, 9}, new long[] {0, 1});
  }
}
