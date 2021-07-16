package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123004 Expansion of g.f. x^2/(1 - 2*x - 25*x^2).
 * @author Sean A. Irvine
 */
public class A123004 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123004() {
    super(new long[] {25, 2}, new long[] {0, 1});
  }
}
