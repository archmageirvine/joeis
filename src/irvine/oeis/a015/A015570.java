package irvine.oeis.a015;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A015570 Expansion of x/(1 - 7*x - 11*x^2).
 * @author Sean A. Irvine
 */
public class A015570 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015570() {
    super(new long[] {11, 7}, new long[] {0, 1});
  }
}
