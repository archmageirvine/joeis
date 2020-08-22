package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015547 Expansion of x/(1 - 5x - 11x^2).
 * @author Sean A. Irvine
 */
public class A015547 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015547() {
    super(new long[] {11, 5}, new long[] {0, 1});
  }
}
