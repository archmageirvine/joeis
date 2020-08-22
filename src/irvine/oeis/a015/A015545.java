package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015545 Expansion of x/(1 - 5*x - 9*x^2).
 * @author Sean A. Irvine
 */
public class A015545 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015545() {
    super(new long[] {9, 5}, new long[] {0, 1});
  }
}
