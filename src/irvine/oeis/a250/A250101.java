package irvine.oeis.a250;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A250101 Expansion of (18*x+86*x^2)/(1-11*x^2-150*x^3).
 * @author Sean A. Irvine
 */
public class A250101 extends LinearRecurrence {

  /** Construct the sequence. */
  public A250101() {
    super(new long[] {150, 11, 0}, new long[] {0, 18, 86});
  }
}
