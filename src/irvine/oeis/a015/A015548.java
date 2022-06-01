package irvine.oeis.a015;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A015548 Expansion of x/(1 - 5*x - 12*x^2).
 * @author Sean A. Irvine
 */
public class A015548 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015548() {
    super(new long[] {12, 5}, new long[] {0, 1});
  }
}
