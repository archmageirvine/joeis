package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015591 Expansion of x/(1 - 10*x - 9*x^2).
 * @author Sean A. Irvine
 */
public class A015591 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015591() {
    super(new long[] {9, 10}, new long[] {0, 1});
  }
}
