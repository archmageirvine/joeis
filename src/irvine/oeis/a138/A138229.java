package irvine.oeis.a138;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A138229 Expansion of (1-x)/(1-2x+6x^2).
 * @author Sean A. Irvine
 */
public class A138229 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138229() {
    super(new long[] {-6, 2}, new long[] {1, 1});
  }
}
