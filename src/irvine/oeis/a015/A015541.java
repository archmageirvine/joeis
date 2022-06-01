package irvine.oeis.a015;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A015541 Expansion of x/(1 - 5*x - 7*x^2).
 * @author Sean A. Irvine
 */
public class A015541 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015541() {
    super(new long[] {7, 5}, new long[] {0, 1});
  }
}
