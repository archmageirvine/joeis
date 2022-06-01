package irvine.oeis.a146;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A146559 Expansion of (1-x)/(1 - 2*x + 2*x^2).
 * @author Sean A. Irvine
 */
public class A146559 extends LinearRecurrence {

  /** Construct the sequence. */
  public A146559() {
    super(new long[] {-2, 2}, new long[] {1, 1});
  }
}
