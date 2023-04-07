package irvine.oeis.a015;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A015579 Expansion of g.f. x/(1 - 9*x - 2*x^2).
 * @author Sean A. Irvine
 */
public class A015579 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015579() {
    super(new long[] {2, 9}, new long[] {0, 1});
  }
}
