package irvine.oeis.a002;

import irvine.oeis.LinearRecurrence;

/**
 * A002447 Expansion of 1/(1-2*x^2-3*x^3).
 * @author Sean A. Irvine
 */
public class A002447 extends LinearRecurrence {

  /** Construct the sequence. */
  public A002447() {
    super(new long[] {3, 2, 0}, new long[] {1, 0, 2});
  }
}
